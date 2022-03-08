package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("material_apply_history_trans")
public class MaterialApplyHistoryTransBean{
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

    /** 报修工单号 */
    private Long requestWorkId;

    /** 
     * 报修工单号的取得  
     * @return Long 报修工单号  
     */  
    public Long getrequestWorkId() {
        return requestWorkId;
    }

    /* 
     *  报修工单号的设值  
     * @param Long requestWorkId  
     */  
    public void setrequestWorkId(Long requestWorkId){
        this.requestWorkId = requestWorkId;
    }

    /** 材料iD */
    private Integer materialId;

    /** 
     * 材料iD的取得  
     * @return Integer 材料iD  
     */  
    public Integer getMaterialId() {
        return materialId;
    }

    /* 
     *  材料iD的设值  
     * @param Integer materialId  
     */  
    public void setMaterialId(Integer materialId){
        this.materialId = materialId;
    }

    /**  */
    private BigDecimal quantity;

    /** 
     * 的取得  
     * @return BigDecimal   
     */  
    public BigDecimal getQuantity() {
        return quantity;
    }

    /* 
     *  的设值  
     * @param BigDecimal quantity  
     */  
    public void setQuantity(BigDecimal quantity){
        this.quantity = quantity;
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

    /** 材料申请发放时间 */
    private Timestamp provideDateTime;

    /** 
     * 材料申请发放时间的取得  
     * @return Timestamp 材料申请发放时间  
     */  
    public Timestamp getProvideDateTime() {
        return provideDateTime;
    }

    /* 
     *  材料申请发放时间的设值  
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