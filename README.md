# Easy DART

OpenDART 공시 데이터를 Java에서 쉽게 조회할 수 있도록 만든 API 클라이언트 라이브러리입니다. API 요청과 JSON 응답 변환을 처리하고, 분야별 서비스와 DTO를 제공합니다.

일반 Java 프로젝트에서 직접 생성하거나 Spring Boot에서 자동 등록된 `DartClient` Bean을 사용할 수 있습니다.

## 주요 기능

- 주주·지분, 임원·직원, 재무제표 등 11개 분야의 API 제공
- JSON 응답을 Java DTO로 변환
- DTO 접근자를 통한 금액·날짜·구분 코드 전처리
- `DartApiException`과 `DartStatusCode`를 통한 오류 처리
- Spring Boot 설정 바인딩 및 Bean 자동 등록

## 사용 환경

| 항목 | 기준 |
| --- | --- |
| Java | 컴파일 대상 Java 11, 실행 검증 JDK 21.0.9 |
| 빌드 도구 | Maven, 검증 버전 3.9.12 |
| Spring Boot | 선택 사항, 자동 설정 검증 버전 2.7.18 |
| JSON 처리 | Jackson 2.15.4 |
| 인증 | OpenDART API 인증키 |

Spring Boot 3 이상과 Java 11 런타임은 아직 검증하지 않았습니다.

## 설치

프로젝트 루트에서 빌드하고 로컬 Maven 저장소에 설치합니다.

```shell
mvn clean install
```

사용할 프로젝트의 `pom.xml`에 의존성을 추가합니다. 아래 방식은 먼저 같은 환경의 로컬 Maven 저장소에 설치한 경우를 기준으로 합니다.

```xml
<dependency>
    <groupId>com.easydart</groupId>
    <artifactId>easy-dart</artifactId>
    <version>1.0.0</version>
</dependency>
```

### JAR 파일로 사용

```shell
mvn clean package
```

| 생성 파일 | 용도 |
| --- | --- |
| `target/easy-dart-1.0.0.jar` | 프로젝트에 추가할 라이브러리 |
| `target/easy-dart-1.0.0-sources.jar` | IDE에서 참조할 소스 코드 |

JAR를 수동으로 추가할 때는 `jackson-databind`, `jackson-core`, `jackson-annotations` 2.15.4도 클래스패스에 추가해야 합니다. Maven 의존성으로 사용하면 Jackson 의존성은 함께 해결됩니다. 이 JAR는 `java -jar`로 실행하는 프로그램이 아니라 다른 프로그램에서 참조하는 라이브러리입니다.

## 빠른 시작

[OpenDART](https://opendart.fss.or.kr)에서 발급받은 인증키를 `DART_API_KEY` 환경 변수로 설정합니다. 라이브러리는 아래 예제에서 전달한 값을 사용합니다.

> 현재 버전은 기본 URL에서 `/api`가 중복되는 문제가 있습니다. 아래 예제처럼 기본 주소를 `https://opendart.fss.or.kr`로 지정하세요.

### 일반 Java

```java
import com.easydart.DartClient;
import com.easydart.dto.shareholder.GetDividendInfoDto;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        DartClient client = DartClient.builder()
                .apiKey(System.getenv("DART_API_KEY"))
                .baseUrl("https://opendart.fss.or.kr")
                .timeoutSeconds(30)
                .build();

        // 삼성전자 2023년 사업보고서의 배당 정보
        List<GetDividendInfoDto> dividends = client.shareholder()
                .getDividendInfo("00126380", "2023", "11011");

        for (GetDividendInfoDto dividend : dividends) {
            System.out.println("법인명: " + dividend.getCorpNameRaw());
            System.out.println("고유번호: " + dividend.getCorpCodeRaw());
            System.out.println("구분: " + dividend.getSe());
            System.out.println("당기: " + dividend.getThstrm());
        }
    }
}
```

회사명과 고유번호는 현재 DTO 변환 문제를 피하기 위해 원본 접근자(`Raw`)를 사용합니다. 자세한 내용은 아래의 알려진 문제를 참고하세요.

### Spring Boot

Spring Boot 프로젝트의 `application.yml`에 설정합니다.

```yaml
dart:
  api:
    key: ${DART_API_KEY}
    base-url: https://opendart.fss.or.kr
    timeout-seconds: 30
```

`DartClient`는 자동으로 Bean에 등록되므로 생성자로 주입할 수 있습니다.

```java
import com.easydart.DartClient;
import com.easydart.dto.shareholder.GetDividendInfoDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DisclosureService {
    private final DartClient dartClient;

    public DisclosureService(DartClient dartClient) {
        this.dartClient = dartClient;
    }

    public List<GetDividendInfoDto> getDividends() {
        return dartClient.shareholder()
                .getDividendInfo("00126380", "2023", "11011");
    }
}
```

## 지원 API 분야

| 서비스 | 주요 데이터 |
| --- | --- |
| `shareholder()` | 배당, 증자·감자, 주식 총수, 주요주주 |
| `personnel()` | 임원·직원 현황, 이사·감사 보수 |
| `financial()` | 주요계정, 전체 재무제표, 재무지표, XBRL 택사노미 |
| `debtSecurities()` | 채무증권 발행, 기업어음·회사채 잔액 |
| `audit()` | 감사의견, 감사용역, 비감사용역 |
| `funding()` | 타법인 출자, 공모·사모자금 사용 |
| `securitiesIssuance()` | 증자·감자 결정, 사채 발행, 자기주식 취득·처분 |
| `corporateRestructure()` | 합병·분할, 영업·자산 양수도 |
| `corporateCrisis()` | 부도, 영업정지, 회생절차, 소송 |
| `overseasListing()` | 해외 상장·상장폐지 |
| `securitiesRegistration()` | 지분·채무증권 및 합병·분할 증권신고서 |

전체 메서드와 파라미터는 [API 사용 가이드](API_GUIDE.md)를 참고하세요.

### 자주 사용하는 파라미터

| 파라미터 | 설명 | 예시 |
| --- | --- | --- |
| `corpCode` | 기업 고유번호. 앞자리 0을 포함한 문자열 | `"00126380"` |
| `bsnsYear` | 사업연도 | `"2023"` |
| `reprtCode` | 보고서 코드 | `"11011"` |
| `bgnDe`, `endDe` | 조회 시작일·종료일 | `"20230101"`, `"20231231"` |
| `fsDiv` | 별도·연결 재무제표 구분 | `"OFS"`, `"CFS"` |

보고서 코드는 `11011`(사업보고서), `11012`(반기보고서), `11013`(1분기보고서), `11014`(3분기보고서)를 사용합니다. 기업 고유번호는 주식 종목코드와 다릅니다.

## 오류 처리

API 오류는 `com.easydart.DartApiException`으로 전달됩니다. 조회 결과가 없는 상태(`013`)는 예외 대신 빈 리스트를 반환합니다. 인증키가 누락된 경우에는 요청 전에 `IllegalStateException`이 발생합니다.

```java
try {
    var dividends = client.shareholder()
            .getDividendInfo("00126380", "2023", "11011");
    if (dividends.isEmpty()) {
        System.out.println("조회된 데이터가 없습니다.");
    }
} catch (com.easydart.DartApiException e) {
    System.err.println("오류 코드: " + e.getRawCode());
    System.err.println("오류 유형: " + e.getStatusCode());
}
```

## 검증 결과 및 알려진 문제

JAR를 참조하는 별도 Java 프로그램에서 Spring 없는 사용과 Spring Boot 2.7.18 자동 설정을 검증했습니다. 기본 URL을 별도로 지정한 실제 API 호출에서는 삼성전자 2023년 배당 데이터 15건을 조회했습니다.

현재 확인된 문제는 다음과 같습니다.

| 문제 | 현재 사용 방법 |
| --- | --- |
| 기본 URL과 서비스 경로의 `/api` 중복 | `baseUrl` 또는 `dart.api.base-url`을 `https://opendart.fss.or.kr`로 설정 |
| 배당 DTO의 `getCorpName()`이 회사명을 숫자로 변환해 `null` 반환 | `getCorpNameRaw()` 사용 |
| 배당 DTO의 `getCorpCode()`이 앞자리 0을 제거 | `getCorpCodeRaw()` 사용 |

모의 서버 검사 10개 중 7개가 통과했고 위 문제에 해당하는 3개가 실패했습니다. 전체 API와 DTO의 동작을 모두 검증한 것은 아닙니다. 재실행 방법과 상세 결과는 [JAR 사용 검증 문서](tests/jar-consumer/README.md)를 참고하세요.

## 문서

- [API 사용 가이드](API_GUIDE.md): 분야별 메서드, 파라미터, 오류 코드
- [데이터 전처리 문서](docs/PROCESSING.md): 응답 데이터 변환 규칙
- [JAR 사용 검증](tests/jar-consumer/README.md): 테스트 결과 및 재실행 명령
