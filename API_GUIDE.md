# Easy DART API 사용 가이드

easy-dart는 OpenDart API를 Java에서 쉽게 사용하기 위한 라이브러리입니다.

## 목차
1. [설치](#설치)
2. [인증키 설정](#인증키-설정)
3. [사용 방법](#사용-방법)
4. [API 목록](#api-목록)
   - [주주/지분](#주주지분-api)
   - [임원/직원](#임원직원-api)
   - [재무제표](#재무제표-api)
   - [채무증권](#채무증권-api)
   - [감사](#감사-api)
   - [자금조달](#자금조달-api)
   - [증권발행 결정](#증권발행-결정-api-주요사항보고)
   - [기업구조 변경](#기업구조-변경-api-주요사항보고)
   - [기업위기/이벤트](#기업위기이벤트-api)
   - [해외상장](#해외상장-api)
   - [증권신고서](#증권신고서-api)

---

## 설치

### Maven
```xml
<dependency>
    <groupId>com.easydart</groupId>
    <artifactId>easy-dart</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

## 인증키 설정

OpenDart(https://opendart.fss.or.kr)에서 발급받은 API 인증키(40자리)를 설정합니다.

### Spring Boot (application.properties)
```properties
dart.api.key=발급받은인증키40자리
dart.api.timeout-seconds=30   # 선택 (기본값: 30초)
```

### Spring Boot (application.yml)
```yaml
dart:
  api:
    key: 발급받은인증키40자리
    timeout-seconds: 30   # 선택 (기본값: 30초)
```

### 비Spring 환경 (직접 생성)
```java
DartClient client = DartClient.builder()
    .apiKey("발급받은인증키40자리")
    .timeoutSeconds(30)
    .build();
```

---

## 사용 방법

### Spring Boot에서 사용
```java
@Service
public class MyService {

    @Autowired
    private DartClient dartClient;

    public void example() {
        // 삼성전자(corp_code: 00126380) 2023년 사업보고서 증자/감자 현황
        List<GetCapitalChangesDto> list = dartClient
            .shareholder()
            .getCapitalChanges("00126380", "2023", "11011");

        for (GetCapitalChangesDto dto : list) {
            System.out.println("법인명: " + dto.getCorpName());
            System.out.println("법인구분: " + dto.getCorpCls());         // "유가증권시장"
            System.out.println("발행수량: " + dto.getIsuDcrsQy());       // BigDecimal
            System.out.println("결산일: " + dto.getStlmDt());           // "2023-12-31"
        }
    }
}
```

### 보고서 코드 상수
```
11011 = 사업보고서
11012 = 반기보고서
11013 = 1분기보고서
11014 = 3분기보고서
```

---

## API 목록

### 주주/지분 API
`dartClient.shareholder().메서드()`

| 메서드 | API명 | 파라미터 | 설명 |
|--------|-------|----------|------|
| `getCapitalChanges(corpCode, bsnsYear, reprtCode)` | 증자(감자) 현황 | 고유번호, 사업연도, 보고서코드 | 주식 발행/소각 내역 |
| `getDividendInfo(corpCode, bsnsYear, reprtCode)` | 배당에 관한 사항 | 고유번호, 사업연도, 보고서코드 | 배당 정보 |
| `getTreasuryStockStatus(corpCode, bsnsYear, reprtCode)` | 자기주식 취득 및 처분 현황 | 고유번호, 사업연도, 보고서코드 | 자기주식 취득/처분 현황 |
| `getMajorShareholderStatus(corpCode, bsnsYear, reprtCode)` | 최대주주 현황 | 고유번호, 사업연도, 보고서코드 | 최대주주 보유현황 |
| `getMajorShareholderChanges(corpCode, bsnsYear, reprtCode)` | 최대주주 변동현황 | 고유번호, 사업연도, 보고서코드 | 최대주주 변동이력 |
| `getMinorShareholderStatus(corpCode, bsnsYear, reprtCode)` | 소액주주 현황 | 고유번호, 사업연도, 보고서코드 | 소액주주 통계 |
| `getStockTotalStatus(corpCode, bsnsYear, reprtCode)` | 주식의 총수 현황 | 고유번호, 사업연도, 보고서코드 | 발행주식 총수 현황 |
| `getMajorStockHolding(corpCode)` | 대량보유 상황보고 | 고유번호 | 5% 이상 대량보유 현황 |
| `getExecutiveStockOwnership(corpCode)` | 임원·주요주주 소유보고 | 고유번호 | 임원/주요주주 주식 소유 현황 |

**사용 예시:**
```java
// 최대주주 현황 조회
List<GetMajorShareholderStatusDto> list = dartClient.shareholder()
    .getMajorShareholderStatus("00126380", "2023", "11011");

// 대량보유 상황보고 (날짜 파라미터 없음)
List<GetMajorStockHoldingDto> holding = dartClient.shareholder()
    .getMajorStockHolding("00126380");
```

---

### 임원/직원 API
`dartClient.personnel().메서드()`

| 메서드 | API명 | 파라미터 |
|--------|-------|----------|
| `getExecutiveStatus(corpCode, bsnsYear, reprtCode)` | 임원 현황 | 고유번호, 사업연도, 보고서코드 |
| `getEmployeeStatus(corpCode, bsnsYear, reprtCode)` | 직원 현황 | 고유번호, 사업연도, 보고서코드 |
| `getDirectorIndividualPay(corpCode, bsnsYear, reprtCode)` | 이사·감사 개인별 보수현황(5억 이상) | 고유번호, 사업연도, 보고서코드 |
| `getDirectorTotalPay(corpCode, bsnsYear, reprtCode)` | 이사·감사 전체 보수현황 | 고유번호, 사업연도, 보고서코드 |
| `getTopIndividualPay(corpCode, bsnsYear, reprtCode)` | 개인별 보수지급 금액(상위5인) | 고유번호, 사업연도, 보고서코드 |
| `getUnregisteredExecutivePay(corpCode, bsnsYear, reprtCode)` | 미등기임원 보수현황 | 고유번호, 사업연도, 보고서코드 |
| `getDirectorPayApproval(corpCode, bsnsYear, reprtCode)` | 이사·감사 보수현황(주총 승인금액) | 고유번호, 사업연도, 보고서코드 |
| `getDirectorPayByType(corpCode, bsnsYear, reprtCode)` | 이사·감사 보수현황(유형별) | 고유번호, 사업연도, 보고서코드 |
| `getOutsideDirectorStatus(corpCode, bsnsYear, reprtCode)` | 사외이사 및 변동현황 | 고유번호, 사업연도, 보고서코드 |

**사용 예시:**
```java
// 직원 현황 조회
List<GetEmployeeStatusDto> employees = dartClient.personnel()
    .getEmployeeStatus("00126380", "2023", "11011");

employees.forEach(e -> {
    System.out.println("사업부문: " + e.getFoBbm());
    System.out.println("직원수: " + e.getSm());            // BigDecimal
    System.out.println("평균 근속연수: " + e.getAvrgCnwkSdytrn());
    System.out.println("1인 평균급여: " + e.getJanSalaryAm()); // BigDecimal
});
```

---

### 재무제표 API
`dartClient.financial().메서드()`

| 메서드 | API명 | 파라미터 |
|--------|-------|----------|
| `getSingleCompanyKeyAccounts(corpCode, bsnsYear, reprtCode)` | 단일회사 주요계정 | 고유번호, 사업연도, 보고서코드 |
| `getMultiCompanyKeyAccounts(corpCode, bsnsYear, reprtCode)` | 다중회사 주요계정 | 고유번호(복수, 쉼표구분), 사업연도, 보고서코드 |
| `getSingleCompanyFullFinancials(corpCode, bsnsYear, reprtCode, fsDiv)` | 단일회사 전체 재무제표 | 고유번호, 사업연도, 보고서코드, 재무제표구분 |
| `getXbrlTaxonomy(sjDiv)` | XBRL 택사노미 재무제표 양식 | 재무제표구분 |
| `getSingleCompanyFinancialIndex(corpCode, bsnsYear, reprtCode, idxClCode)` | 단일회사 주요 재무지표 | 고유번호, 사업연도, 보고서코드, 지표분류코드 |
| `getMultiCompanyFinancialIndex(corpCode, bsnsYear, reprtCode, idxClCode)` | 다중회사 주요 재무지표 | 고유번호(복수), 사업연도, 보고서코드, 지표분류코드 |

**fsDiv (재무제표 구분):**
- `OFS` : 별도재무제표
- `CFS` : 연결재무제표

**idxClCode (지표분류코드):**
- `M210000` : 수익성지표
- `M220000` : 안정성지표
- `M230000` : 성장성지표
- `M240000` : 활동성지표

**사용 예시:**
```java
// 삼성전자 2023년 연결재무제표 전체
List<GetSingleCompanyFullFinancialsDto> fs = dartClient.financial()
    .getSingleCompanyFullFinancials("00126380", "2023", "11011", "CFS");

// 다중회사 주요 재무지표 (삼성전자 + SK하이닉스)
List<GetMultiCompanyFinancialIndexDto> idx = dartClient.financial()
    .getMultiCompanyFinancialIndex("00126380,00164779", "2023", "11011", "M210000");
```

---

### 채무증권 API
`dartClient.debtSecurities().메서드()`

| 메서드 | API명 | 파라미터 |
|--------|-------|----------|
| `getDebtSecuritiesIssuance(corpCode, bsnsYear, reprtCode)` | 채무증권 발행실적 | 고유번호, 사업연도, 보고서코드 |
| `getCommercialPaperBalance(corpCode, bsnsYear, reprtCode)` | 기업어음증권 미상환 잔액 | 고유번호, 사업연도, 보고서코드 |
| `getShortTermBondBalance(corpCode, bsnsYear, reprtCode)` | 단기사채 미상환 잔액 | 고유번호, 사업연도, 보고서코드 |
| `getCorporateBondBalance(corpCode, bsnsYear, reprtCode)` | 회사채 미상환 잔액 | 고유번호, 사업연도, 보고서코드 |
| `getHybridCapitalBalance(corpCode, bsnsYear, reprtCode)` | 신종자본증권 미상환 잔액 | 고유번호, 사업연도, 보고서코드 |
| `getConditionalCapitalBalance(corpCode, bsnsYear, reprtCode)` | 조건부자본증권 미상환 잔액 | 고유번호, 사업연도, 보고서코드 |

---

### 감사 API
`dartClient.audit().메서드()`

| 메서드 | API명 | 파라미터 |
|--------|-------|----------|
| `getAuditorInfo(corpCode, bsnsYear, reprtCode)` | 회계감사인의 명칭 및 감사의견 | 고유번호, 사업연도, 보고서코드 |
| `getAuditServiceContract(corpCode, bsnsYear, reprtCode)` | 감사용역체결현황 | 고유번호, 사업연도, 보고서코드 |
| `getNonAuditServiceContract(corpCode, bsnsYear, reprtCode)` | 비감사용역 계약체결 현황 | 고유번호, 사업연도, 보고서코드 |

**사용 예시:**
```java
// 감사의견 조회
List<GetAuditorInfoDto> audits = dartClient.audit()
    .getAuditorInfo("00126380", "2023", "11011");

audits.forEach(a -> {
    System.out.println("감사인: " + a.getAdtor());
    System.out.println("감사의견: " + a.getAdtOpinion());
});
```

---

### 자금조달 API
`dartClient.funding().메서드()`

| 메서드 | API명 | 파라미터 |
|--------|-------|----------|
| `getOtherCorpInvestment(corpCode, bsnsYear, reprtCode)` | 타법인 출자현황 | 고유번호, 사업연도, 보고서코드 |
| `getPublicOfferingFundUsage(corpCode, bsnsYear, reprtCode)` | 공모자금의 사용내역 | 고유번호, 사업연도, 보고서코드 |
| `getPrivatePlacementFundUsage(corpCode, bsnsYear, reprtCode)` | 사모자금의 사용내역 | 고유번호, 사업연도, 보고서코드 |

---

### 증권발행 결정 API (주요사항보고)
`dartClient.securitiesIssuance().메서드()`

날짜 파라미터: `bgnDe`(시작일), `endDe`(종료일) 형식: `YYYYMMDD`

| 메서드 | API명 |
|--------|-------|
| `getPaidCapitalIncreaseDecision(corpCode, bgnDe, endDe)` | 유상증자 결정 |
| `getFreeCapitalIncreaseDecision(corpCode, bgnDe, endDe)` | 무상증자 결정 |
| `getMixedCapitalIncreaseDecision(corpCode, bgnDe, endDe)` | 유무상증자 결정 |
| `getCapitalReductionDecision(corpCode, bgnDe, endDe)` | 감자 결정 |
| `getConvertibleBondIssuance(corpCode, bgnDe, endDe)` | 전환사채권(CB) 발행결정 |
| `getBondWithWarrantIssuance(corpCode, bgnDe, endDe)` | 신주인수권부사채권(BW) 발행결정 |
| `getExchangeableBondIssuance(corpCode, bgnDe, endDe)` | 교환사채권(EB) 발행결정 |
| `getWriteDownCocobondIssuance(corpCode, bgnDe, endDe)` | 상각형 조건부자본증권 발행결정 |
| `getTreasuryStockAcquisitionDecision(corpCode, bgnDe, endDe)` | 자기주식 취득 결정 |
| `getTreasuryStockDisposalDecision(corpCode, bgnDe, endDe)` | 자기주식 처분 결정 |
| `getTreasuryStockTrustAcquisition(corpCode, bgnDe, endDe)` | 자기주식취득 신탁계약 체결 결정 |
| `getTreasuryStockTrustTermination(corpCode, bgnDe, endDe)` | 자기주식취득 신탁계약 해지 결정 |

**사용 예시:**
```java
// 2023년 1월 ~ 12월 CB 발행결정 조회
List<GetConvertibleBondIssuanceDto> cbs = dartClient.securitiesIssuance()
    .getConvertibleBondIssuance("00126380", "20230101", "20231231");
```

---

### 기업구조 변경 API (주요사항보고)
`dartClient.corporateRestructure().메서드()`

날짜 파라미터: `bgnDe`(시작일), `endDe`(종료일) 형식: `YYYYMMDD`

| 메서드 | API명 |
|--------|-------|
| `getBusinessAcquisitionDecision(corpCode, bgnDe, endDe)` | 영업양수 결정 |
| `getBusinessTransferDecision(corpCode, bgnDe, endDe)` | 영업양도 결정 |
| `getTangibleAssetAcquisition(corpCode, bgnDe, endDe)` | 유형자산 양수 결정 |
| `getTangibleAssetTransfer(corpCode, bgnDe, endDe)` | 유형자산 양도 결정 |
| `getOtherCorpStockAcquisition(corpCode, bgnDe, endDe)` | 타법인 주식 및 출자증권 양수결정 |
| `getOtherCorpStockTransfer(corpCode, bgnDe, endDe)` | 타법인 주식 및 출자증권 양도결정 |
| `getStockRelatedBondAcquisition(corpCode, bgnDe, endDe)` | 주권 관련 사채권 양수 결정 |
| `getStockRelatedBondTransfer(corpCode, bgnDe, endDe)` | 주권 관련 사채권 양도 결정 |
| `getMergerDecision(corpCode, bgnDe, endDe)` | 회사합병 결정 |
| `getSpinOffDecision(corpCode, bgnDe, endDe)` | 회사분할 결정 |
| `getMergerSpinOffDecision(corpCode, bgnDe, endDe)` | 회사분할합병 결정 |
| `getStockExchangeTransferDecision(corpCode, bgnDe, endDe)` | 주식교환·이전 결정 |

---

### 기업위기/이벤트 API
`dartClient.corporateCrisis().메서드()`

날짜 파라미터: `bgnDe`(시작일), `endDe`(종료일) 형식: `YYYYMMDD`

| 메서드 | API명 |
|--------|-------|
| `getAssetTransferPutbackOption(corpCode, bgnDe, endDe)` | 자산양수도(기타), 풋백옵션 |
| `getDefaultOccurrence(corpCode, bgnDe, endDe)` | 부도발생 |
| `getBusinessSuspension(corpCode, bgnDe, endDe)` | 영업정지 |
| `getReorganizationApplication(corpCode, bgnDe, endDe)` | 회생절차 개시신청 |
| `getDissolutionCause(corpCode, bgnDe, endDe)` | 해산사유 발생 |
| `getCreditorBankManagementStart(corpCode, bgnDe, endDe)` | 채권은행 등의 관리절차 개시 |
| `getCreditorBankManagementStop(corpCode, bgnDe, endDe)` | 채권은행 등의 관리절차 중단 |
| `getLawsuit(corpCode, bgnDe, endDe)` | 소송 등의 제기 |

---

### 해외상장 API
`dartClient.overseasListing().메서드()`

날짜 파라미터: `bgnDe`(시작일), `endDe`(종료일) 형식: `YYYYMMDD`

| 메서드 | API명 |
|--------|-------|
| `getOverseasListingDecision(corpCode, bgnDe, endDe)` | 해외 증권시장 주권등 상장 결정 |
| `getOverseasDelistingDecision(corpCode, bgnDe, endDe)` | 해외 증권시장 주권등 상장폐지 결정 |
| `getOverseasListing(corpCode, bgnDe, endDe)` | 해외 증권시장 주권등 상장 |
| `getOverseasDelisting(corpCode, bgnDe, endDe)` | 해외 증권시장 주권등 상장폐지 |

---

### 증권신고서 API
`dartClient.securitiesRegistration().메서드()`

날짜 파라미터: `bgnDe`(시작일), `endDe`(종료일) 형식: `YYYYMMDD`

| 메서드 | API명 |
|--------|-------|
| `getEquitySecuritiesRegistration(corpCode, bgnDe, endDe)` | 지분증권 |
| `getDebtSecuritiesRegistration(corpCode, bgnDe, endDe)` | 채무증권 |
| `getDepositaryReceiptRegistration(corpCode, bgnDe, endDe)` | 증권예탁증권 |
| `getMergerRegistration(corpCode, bgnDe, endDe)` | 합병 |
| `getStockExchangeRegistration(corpCode, bgnDe, endDe)` | 주식의 포괄적 교환·이전 |
| `getSpinOffRegistration(corpCode, bgnDe, endDe)` | 분할 |

---

## 오류 처리

API 호출 실패 시 `DartHttpClient.DartApiException` (RuntimeException)이 발생합니다.

```java
import com.easydart.DartApiException;
import com.easydart.DartStatusCode;

try {
    List<GetCapitalChangesDto> result = dartClient.shareholder()
        .getCapitalChanges("00126380", "2023", "11011");
} catch (DartApiException e) {
    switch (e.getStatusCode()) {
        case UNREGISTERED_KEY:
        case DISABLED_KEY:
        case EXPIRED_ACCOUNT:
            System.err.println("인증키 오류: " + e.getStatusCode().getMessage());
            break;
        case INACCESSIBLE_IP:
            System.err.println("IP 접근 제한: OpenDart에서 서버 IP를 등록하세요.");
            break;
        case REQUEST_EXCEEDED:
            System.err.println("요청 한도 초과: 잠시 후 재시도하세요.");
            break;
        case MAINTENANCE:
            System.err.println("OpenDart 시스템 점검 중입니다.");
            break;
        case INVALID_FIELD:
            System.err.println("파라미터 값 오류: " + e.getMessage());
            break;
        default:
            System.err.println("API 오류 [" + e.getRawCode() + "]: " + e.getMessage());
    }
}
```

### DartStatusCode enum

```java
DartStatusCode code = e.getStatusCode();
code.getCode();    // "010"
code.getMessage(); // "등록되지 않은 키입니다."
code.isError();    // true
```

| enum 상수 | 코드 | 설명 | 예외 발생 |
|-----------|------|------|----------|
| `SUCCESS` | `000` | 정상 | N |
| `NO_DATA` | `013` | 조회된 데이터가 없습니다. (빈 리스트 반환) | N |
| `UNREGISTERED_KEY` | `010` | 등록되지 않은 키입니다. | Y |
| `DISABLED_KEY` | `011` | 사용할 수 없는 키입니다. (일시 사용 중지) | Y |
| `INACCESSIBLE_IP` | `012` | 접근할 수 없는 IP입니다. | Y |
| `FILE_NOT_FOUND` | `014` | 파일이 존재하지 않습니다. | Y |
| `REQUEST_EXCEEDED` | `020` | 요청 제한 초과 (일일 20,000건) | Y |
| `COMPANY_EXCEEDED` | `021` | 회사 개수 초과 (최대 100건) | Y |
| `INVALID_FIELD` | `100` | 필드의 부적절한 값입니다. | Y |
| `IMPROPER_ACCESS` | `101` | 부적절한 접근입니다. | Y |
| `MAINTENANCE` | `800` | 시스템 점검 중 | Y |
| `UNDEFINED_ERROR` | `900` | 정의되지 않은 오류 | Y |
| `EXPIRED_ACCOUNT` | `901` | 개인정보 보유기간 만료 계정 | Y |
| `UNKNOWN` | `???` | 미정의 코드 (라이브러리 버전 불일치 등) | Y |

> **참고**: `013`(NO_DATA)는 예외 없이 빈 리스트(`Collections.emptyList()`)를 반환합니다.

---

## corp_code 조회 방법

OpenDart 고유번호(corp_code)는 OpenDart 포털에서 기업 검색 후 확인하거나,
OpenDart API의 기업 목록 다운로드 기능을 통해 전체 목록을 받을 수 있습니다.

주요 기업 고유번호 예시:
- 삼성전자: `00126380`
- SK하이닉스: `00164779`
- LG전자: `00401731`
- 현대자동차: `00164742`
