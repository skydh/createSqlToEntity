@Entity
@Table(name = "other_contract_rev")
public class OtherContractRevEntity{

    /**
    * 主键 
    */
    @Column(name ="id")
    private String id;

    /**
    * 是否删除 
    */
    @Column(name ="dr")
    private Integer dr;

    /**
    * 单据编号 
    */
    @Column(name ="bill_code")
    private String billCode;

    /**
    * 单据类型 
    */
    @Column(name ="bill_type")
    private String billType;

    /**
    * 单据状态 
    */
    @Column(name ="bill_state")
    private Integer billState;

    /**
    * 创建人id 
    */
    @Column(name ="creatorid")
    private String creatorid;

    /**
    * 创建人 
    */
    @Column(name ="creator")
    private String creator;

    /**
    * 创建时间 
    */
    @Column(name ="createtime")
    private Date createtime;

    /**
    * 修改人id 
    */
    @Column(name ="modifierid")
    private String modifierid;

    /**
    * 修改人 
    */
    @Column(name ="modifier")
    private String modifier;

    /**
    * 修改时间 
    */
    @Column(name ="modifytime")
    private Date modifytime;

    /**
    * 审核人id 
    */
    @Column(name ="reviewerid")
    private String reviewerid;

    /**
    * 审核人 
    */
    @Column(name ="reviewer")
    private String reviewer;

    /**
    * 审核时间 
    */
    @Column(name ="reviewtime")
    private Date reviewtime;

    /**
    * 租户id 
    */
    @Column(name ="tenantid")
    private String tenantid;

    /**
    * 公司id 
    */
    @Column(name ="company_id")
    private String companyId;

    /**
    * 时间戳 
    */
    @Column(name ="ts")
    private Date ts;

    /**
    * 项目id 
    */
    @Column(name ="project_id")
    private String projectId;

    /**
    * 采购单位 
    */
    @Column(name ="purchase_company")
    private String purchaseCompany;

    /**
    * 是否集采 
    */
    @Column(name ="gather_flag")
    private Boolean gatherFlag;

    /**
    * 招标申请编号 
    */
    @Column(name ="tender_id")
    private String tenderId;

    /**
    * 定标编号 
    */
    @Column(name ="custstd_id")
    private String custstdId;

    /**
    * 合同类型 
    */
    @Column(name ="contract_type_id")
    private String contractTypeId;

    /**
    * 集采层级 
    */
    @Column(name ="gather_level")
    private String gatherLevel;

    /**
    * 招标类型 
    */
    @Column(name ="tender_type")
    private String tenderType;

    /**
    * 分供方类型 
    */
    @Column(name ="subsupplier_type")
    private String subsupplierType;

    /**
    * 合同名称 
    */
    @Column(name ="contract_name")
    private String contractName;

    /**
    * 乙方名称 
    */
    @Column(name ="b_company")
    private String bCompany;

    /**
    * 服务名称 
    */
    @Column(name ="service_name")
    private String serviceName;

    /**
    * 合同草拟日期 
    */
    @Column(name ="contract_draft_date")
    private Date contractDraftDate;

    /**
    * 主要合同说明 
    */
    @Column(name ="maint_explain")
    private String maintExplain;

    /**
    * 结算内容说明 
    */
    @Column(name ="settle_explain")
    private String settleExplain;

    /**
    * 纳税人身份 
    */
    @Column(name ="tax_payer")
    private String taxPayer;

    /**
    * 纳税人识别号 
    */
    @Column(name ="tax_real_no")
    private String taxRealNo;

    /**
    * 税务登记地址 
    */
    @Column(name ="tax_reg_address")
    private String taxRegAddress;

    /**
    * 开具发票类型 
    */
    @Column(name ="invoice_type")
    private String invoiceType;

    /**
    * 税率 
    */
    @Column(name ="tax_rate")
    private String taxRate;

    /**
    * 收款单位 
    */
    @Column(name ="supplier_name")
    private String supplierName;

    /**
    * 开户行 
    */
    @Column(name ="account_bank_id")
    private String accountBankId;

    /**
    * 开户行账号 
    */
    @Column(name ="account_bank_no")
    private String accountBankNo;

    /**
    * 开户行地址 
    */
    @Column(name ="account_bank_address")
    private String accountBankAddress;

    /**
    * 支付比例主键 
    */
    @Column(name ="pay_rate_id")
    private String payRateId;

    /**
    * 总价 
    */
    @Column(name ="total_account")
    private BigDecimal totalAccount;

    /**
    * 不含税总价 
    */
    @Column(name ="tax_total_account")
    private BigDecimal taxTotalAccount;

    /**
    * 税金 
    */
    @Column(name ="tax_money")
    private BigDecimal taxMoney;

    /**
    * 履约期限 
    */
    @Column(name ="perform_limit")
    private String performLimit;

    /**
    * 履约地点 
    */
    @Column(name ="perform_address")
    private String performAddress;

    /**
    * 履约方式 
    */
    @Column(name ="perform_mode")
    private String performMode;

    /**
    * 违约责任 
    */
    @Column(name ="violation_idea_res")
    private String violationIdeaRes;

    /**
    * 其他 
    */
    @Column(name ="other")
    private String other;



}