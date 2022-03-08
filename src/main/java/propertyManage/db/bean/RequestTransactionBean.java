package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("request_transaction")
public class RequestTransactionBean{
    @Id 
    /** 报修请求ID */
    private Long requestID;

    /** 
     * 报修请求ID的取得  
     * @return Long 报修请求ID  
     */  
    public Long getRequestID() {
        return requestID;
    }

    /* 
     *  报修请求ID的设值  
     * @param Long requestID  
     */  
    public void setRequestID(Long requestID){
        this.requestID = requestID;
    }

    /** 物业小区ID */
    private Integer communityId;

    /** 
     * 物业小区ID的取得  
     * @return Integer 物业小区ID  
     */  
    public Integer getCommunityId() {
        return communityId;
    }

    /* 
     *  物业小区ID的设值  
     * @param Integer communityId  
     */  
    public void setCommunityId(Integer communityId){
        this.communityId = communityId;
    }

    /** 报修日时 */
    private Timestamp requestDateTime;

    /** 
     * 报修日时的取得  
     * @return Timestamp 报修日时  
     */  
    public Timestamp getRequestDateTime() {
        return requestDateTime;
    }

    /* 
     *  报修日时的设值  
     * @param Timestamp requestDateTime  
     */  
    public void setRequestDateTime(Timestamp requestDateTime){
        this.requestDateTime = requestDateTime;
    }

    /** 报修请求人名 */
    private String requesterName;

    /** 
     * 报修请求人名的取得  
     * @return String 报修请求人名  
     */  
    public String getRequesterName() {
        return requesterName;
    }

    /* 
     *  报修请求人名的设值  
     * @param String requesterName  
     */  
    public void setRequesterName(String requesterName){
        this.requesterName = requesterName;
    }

    /** 报修请求人电话 */
    private Long requesterCall;

    /** 
     * 报修请求人电话的取得  
     * @return Long 报修请求人电话  
     */  
    public Long getRequesterCall() {
        return requesterCall;
    }

    /* 
     *  报修请求人电话的设值  
     * @param Long requesterCall  
     */  
    public void setRequesterCall(Long requesterCall){
        this.requesterCall = requesterCall;
    }

    /** 报修请求事务分类 0 水管 、下水道等 1  电路、电器等   2 墙体、门窗、地板 、天花板等 3 有线、通信、网络设备等 4 楼道、路面、停车场设施 5 其他 */
    private Integer requestType;

    /** 
     * 报修请求事务分类 0 水管 、下水道等 1  电路、电器等   2 墙体、门窗、地板 、天花板等 3 有线、通信、网络设备等 4 楼道、路面、停车场设施 5 其他的取得  
     * @return Integer 报修请求事务分类 0 水管 、下水道等 1  电路、电器等   2 墙体、门窗、地板 、天花板等 3 有线、通信、网络设备等 4 楼道、路面、停车场设施 5 其他  
     */  
    public Integer getRequestType() {
        return requestType;
    }

    /* 
     *  报修请求事务分类 0 水管 、下水道等 1  电路、电器等   2 墙体、门窗、地板 、天花板等 3 有线、通信、网络设备等 4 楼道、路面、停车场设施 5 其他的设值  
     * @param Integer requestType  
     */  
    public void setRequestType(Integer requestType){
        this.requestType = requestType;
    }

    /** 0：电话报修 1 物业管理处报修 2 网络，微信自助报修 */
    private Integer requestMethod;

    /** 
     * 0：电话报修 1 物业管理处报修 2 网络，微信自助报修的取得  
     * @return Integer 0：电话报修 1 物业管理处报修 2 网络，微信自助报修  
     */  
    public Integer getRequestMethod() {
        return requestMethod;
    }

    /* 
     *  0：电话报修 1 物业管理处报修 2 网络，微信自助报修的设值  
     * @param Integer requestMethod  
     */  
    public void setRequestMethod(Integer requestMethod){
        this.requestMethod = requestMethod;
    }

    /** 报修请求物业地址 */
    private String requestAddress;

    /** 
     * 报修请求物业地址的取得  
     * @return String 报修请求物业地址  
     */  
    public String getRequestAddress() {
        return requestAddress;
    }

    /* 
     *  报修请求物业地址的设值  
     * @param String requestAddress  
     */  
    public void setRequestAddress(String requestAddress){
        this.requestAddress = requestAddress;
    }

    /** 住户ID */
    private Integer houseAccountId;

    /** 
     * 住户ID的取得  
     * @return Integer 住户ID  
     */  
    public Integer getHouseAccountId() {
        return houseAccountId;
    }

    /* 
     *  住户ID的设值  
     * @param Integer houseAccountId  
     */  
    public void setHouseAccountId(Integer houseAccountId){
        this.houseAccountId = houseAccountId;
    }

    /** 报修部位公私性质: 0 公共部位 1 私有部位 */
    private Integer requestPrivatePublic;

    /** 
     * 报修部位公私性质: 0 公共部位 1 私有部位的取得  
     * @return Integer 报修部位公私性质: 0 公共部位 1 私有部位  
     */  
    public Integer getRequestPrivatePublic() {
        return requestPrivatePublic;
    }

    /* 
     *  报修部位公私性质: 0 公共部位 1 私有部位的设值  
     * @param Integer requestPrivatePublic  
     */  
    public void setRequestPrivatePublic(Integer requestPrivatePublic){
        this.requestPrivatePublic = requestPrivatePublic;
    }

    /** 物业报修请求内容描述 */
    private String requestDesc;

    /** 
     * 物业报修请求内容描述的取得  
     * @return String 物业报修请求内容描述  
     */  
    public String getRequestDesc() {
        return requestDesc;
    }

    /* 
     *  物业报修请求内容描述的设值  
     * @param String requestDesc  
     */  
    public void setRequestDesc(String requestDesc){
        this.requestDesc = requestDesc;
    }

    /** 物业报修请求当前状态 0已申报 1 已派单 2 已完工 4 已付款 5 已关闭 */
    private Integer requestCurrentStatus;

    /** 
     * 物业报修请求当前状态 0已申报 1 已派单 2 已完工 4 已付款 5 已关闭的取得  
     * @return Integer 物业报修请求当前状态 0已申报 1 已派单 2 已完工 4 已付款 5 已关闭  
     */  
    public Integer getRequestCurrentStatus() {
        return requestCurrentStatus;
    }

    /* 
     *  物业报修请求当前状态 0已申报 1 已派单 2 已完工 4 已付款 5 已关闭的设值  
     * @param Integer requestCurrentStatus  
     */  
    public void setRequestCurrentStatus(Integer requestCurrentStatus){
        this.requestCurrentStatus = requestCurrentStatus;
    }

    /** 预估费用 */
    private BigDecimal estimatedRequestFee;

    /** 
     * 预估费用的取得  
     * @return BigDecimal 预估费用  
     */  
    public BigDecimal getEstimatedRequestFee() {
        return estimatedRequestFee;
    }

    /* 
     *  预估费用的设值  
     * @param BigDecimal estimatedRequestFee  
     */  
    public void setEstimatedRequestFee(BigDecimal estimatedRequestFee){
        this.estimatedRequestFee = estimatedRequestFee;
    }

    /** 费用支付时间 */
    private Timestamp feePayedDateTime;

    /** 
     * 费用支付时间的取得  
     * @return Timestamp 费用支付时间  
     */  
    public Timestamp getFeePayedDateTime() {
        return feePayedDateTime;
    }

    /* 
     *  费用支付时间的设值  
     * @param Timestamp feePayedDateTime  
     */  
    public void setFeePayedDateTime(Timestamp feePayedDateTime){
        this.feePayedDateTime = feePayedDateTime;
    }

}