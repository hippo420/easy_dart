package com.easydart;

import com.easydart.client.DartHttpClient;
import com.easydart.service.*;

/**
 * OpenDart API 메인 클라이언트.
 *
 * Spring Boot 환경: application.properties에 dart.api.key 설정 시 자동 Bean으로 등록됩니다.
 * 비Spring 환경: DartClient.builder().apiKey("키").build() 로 직접 생성하세요.
 *
 * <pre>
 * // Spring Boot 사용 예:
 * {@literal @}Autowired DartClient dartClient;
 * List<GetCapitalChangesDto> result = dartClient.shareholder().getCapitalChanges("00126380", "2023", "11011");
 *
 * // 직접 생성 예:
 * DartClient client = DartClient.builder().apiKey("발급받은키40자리").build();
 * </pre>
 */
public class DartClient {

    private final ShareholderService shareholder;
    private final PersonnelService personnel;
    private final FinancialService financial;
    private final DebtSecuritiesService debtSecurities;
    private final AuditService audit;
    private final FundingService funding;
    private final SecuritiesIssuanceService securitiesIssuance;
    private final CorporateRestructureService corporateRestructure;
    private final CorporateCrisisService corporateCrisis;
    private final OverseasListingService overseasListing;
    private final SecuritiesRegistrationService securitiesRegistration;

    public DartClient(DartHttpClient httpClient) {
        this.shareholder = new ShareholderService(httpClient);
        this.personnel = new PersonnelService(httpClient);
        this.financial = new FinancialService(httpClient);
        this.debtSecurities = new DebtSecuritiesService(httpClient);
        this.audit = new AuditService(httpClient);
        this.funding = new FundingService(httpClient);
        this.securitiesIssuance = new SecuritiesIssuanceService(httpClient);
        this.corporateRestructure = new CorporateRestructureService(httpClient);
        this.corporateCrisis = new CorporateCrisisService(httpClient);
        this.overseasListing = new OverseasListingService(httpClient);
        this.securitiesRegistration = new SecuritiesRegistrationService(httpClient);
    }

    /** 주주/지분 관련 API (증자감자, 배당, 자기주식, 대주주 등) */
    public ShareholderService shareholder() { return shareholder; }

    /** 임원/직원 관련 API (임원현황, 직원현황, 보수현황 등) */
    public PersonnelService personnel() { return personnel; }

    /** 재무제표 관련 API (주요계정, 전체재무제표, 재무지표, XBRL 등) */
    public FinancialService financial() { return financial; }

    /** 채무증권 관련 API (발행실적, 기업어음, 회사채 미상환잔액 등) */
    public DebtSecuritiesService debtSecurities() { return debtSecurities; }

    /** 감사 관련 API (감사의견, 감사용역, 비감사용역 등) */
    public AuditService audit() { return audit; }

    /** 자금 조달/운용 관련 API (타법인출자, 공모자금, 사모자금 등) */
    public FundingService funding() { return funding; }

    /** 주요사항보고 - 증권발행 결정 API (유무상증자, 감자, CB/BW 발행 등) */
    public SecuritiesIssuanceService securitiesIssuance() { return securitiesIssuance; }

    /** 주요사항보고 - 기업구조 변경 API (합병, 분할, 영업양수도, 자산양수도 등) */
    public CorporateRestructureService corporateRestructure() { return corporateRestructure; }

    /** 기업 위기/이벤트 관련 API (부도, 영업정지, 회생절차, 소송 등) */
    public CorporateCrisisService corporateCrisis() { return corporateCrisis; }

    /** 해외 증권시장 상장/상장폐지 관련 API */
    public OverseasListingService overseasListing() { return overseasListing; }

    /** 증권신고서 관련 API (지분증권, 채무증권, 합병, 분할 등) */
    public SecuritiesRegistrationService securitiesRegistration() { return securitiesRegistration; }

    // =========================================================
    // 직접 생성용 빌더 (비Spring 환경)
    // =========================================================

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private String apiKey;
        private int timeoutSeconds = 30;
        private String baseUrl = "https://opendart.fss.or.kr/api";

        public Builder apiKey(String apiKey) { this.apiKey = apiKey; return this; }
        public Builder timeoutSeconds(int seconds) { this.timeoutSeconds = seconds; return this; }
        public Builder baseUrl(String baseUrl) { this.baseUrl = baseUrl; return this; }

        public DartClient build() {
            DartProperties props = new DartProperties();
            props.setKey(apiKey);
            props.setTimeoutSeconds(timeoutSeconds);
            props.setBaseUrl(baseUrl);
            return new DartClient(new DartHttpClient(props));
        }
    }
}
