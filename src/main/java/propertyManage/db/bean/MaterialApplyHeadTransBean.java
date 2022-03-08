package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("material_apply_head_trans")
public class MaterialApplyHeadTransBean{
    @Id 
    /** 申请单号 */
    private Long applyID;

    /** 
     * 申请单号的取得  
     * @return Long 申请单号  
     */  
    public Long getApplyID() {
        return applyID;
    }

    /* 
     *  申请单号的设值  
     * @param Long applyID  
     */  
    public void setApplyID(Long applyID){
        this.applyID = applyID;
    }

    /** 报修请求号 */
    private Long requestId;

    /** 
     * 报修请求号的取得  
     * @return Long 报修请求号  
     */  
    public Long getrequestId() {
        return requestId;
    }

    /* 
     *  报修请求号的设值  
     * @param Long requestId  
     */  
    public void setrequestId(Long requestId){
        this.requestId = requestId;
    }

    /** 申请审核人 */
    private String approverName;

    /** 
     * 申请审核人的取得  
     * @return String 申请审核人  
     */  
    public String getApproverName() {
        return approverName;
    }

    /* 
     *  申请审核人的设值  
     * @param String approverName  
     */  
    public void setApproverName(String approverName){
        this.approverName = approverName;
    }

    /** 材料申请人名 */
    private Timestamp applyerName;

    /** 
     * 材料申请人名的取得  
     * @return Timestamp 材料申请人名  
     */  
    public Timestamp getApplyerName() {
        return applyerName;
    }

    /* 
     *  材料申请人名的设值  
     * @param Timestamp applyerName  
     */  
    public void setApplyerName(Timestamp applyerName){
        this.applyerName = applyerName;
    }

    /** 材料申请时间 */
    private Timestamp applyDateTime;

    /** 
     * 材料申请时间的取得  
     * @return Timestamp 材料申请时间  
     */  
    public Timestamp getApplyDateTime() {
        return applyDateTime;
    }

    /* 
     *  材料申请时间的设值  
     * @param Timestamp applyDateTime  
     */  
    public void setApplyDateTime(Timestamp applyDateTime){
        this.applyDateTime = applyDateTime;
    }

    /** 材料发放时间 */
    private Timestamp provideDateTime;

    /** 
     * 材料发放时间的取得  
     * @return Timestamp 材料发放时间  
     */  
    public Timestamp getProvideDateTime() {
        return provideDateTime;
    }

    /* 
     *  材料发放时间的设值  
     * @param Timestamp provideDateTime  
     */  
    public void setProvideDateTime(Timestamp provideDateTime){
        this.provideDateTime = provideDateTime;
    }

    /** 材料发放人姓名 */
    private String providerName;

    /** 
     * 材料发放人姓名的取得  
     * @return String 材料发放人姓名  
     */  
    public String getProviderName() {
        return providerName;
    }

    /* 
     *  材料发放人姓名的设值  
     * @param String providerName  
     */  
    public void setProviderName(String providerName){
        this.providerName = providerName;
    }

    /** 材料发放人工号 */
    private Integer providerHrId;

    /** 
     * 材料发放人工号的取得  
     * @return Integer 材料发放人工号  
     */  
    public Integer getProviderHrId() {
        return providerHrId;
    }

    /* 
     *  材料发放人工号的设值  
     * @param Integer providerHrId  
     */  
    public void setProviderHrId(Integer providerHrId){
        this.providerHrId = providerHrId;
    }

}