@Entity
@Table(name = "other_contract_rev_payrate")
public class OtherContractRevPayrateEntity{

    /**
    *id
    */
    @Column(name ="id")
    private String id;

    /**
    *是否删除
    */
    @Column(name ="dr")
    private Integer dr;

    /**
    *公司id
    */
    @Column(name ="company_id")
    private String companyId;

    /**
    *租户id
    */
    @Column(name ="tenantid")
    private String tenantid;

    /**
    *时间戳
    */
    @Column(name ="ts")
    private Date ts;

    /**
    *行号
    */
    @Column(name ="row_no")
    private Integer rowNo;

    /**
    *支付比例
    */
    @Column(name ="pay_rate")
    private Integer payRate;

    /**
    *支付说明
    */
    @Column(name ="pay_explain")
    private String payExplain;



}