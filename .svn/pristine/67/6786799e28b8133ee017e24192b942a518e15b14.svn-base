package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("work_fee_trans")
public class WorkFeeTransBean{
    @Id 
    /** 工单号 */
    private Long workId;

    /** 
     * 工单号的取得  
     * @return Long 工单号  
     */  
    public Long getWorkId() {
        return workId;
    }

    /* 
     *  工单号的设值  
     * @param Long workId  
     */  
    public void setWorkId(Long workId){
        this.workId = workId;
    }

    /** 是否最新版 */
    private Integer isNewest;

    /** 
     * 是否最新版的取得  
     * @return Integer 是否最新版  
     */  
    public Integer getIsNewest() {
        return isNewest;
    }

    /* 
     *  是否最新版的设值  
     * @param Integer isNewest  
     */  
    public void setIsNewest(Integer isNewest){
        this.isNewest = isNewest;
    }

    /** 报修请求ID */
    private Long requestId;

    /** 
     * 报修请求ID的取得  
     * @return Long 报修请求ID  
     */  
    public Long getRequestId() {
        return requestId;
    }

    /* 
     *  报修请求ID的设值  
     * @param Long requestId  
     */  
    public void setRequestId(Long requestId){
        this.requestId = requestId;
    }

    /** 工程预估费用 */
    private BigDecimal estimationFee;

    /** 
     * 工程预估费用的取得  
     * @return BigDecimal 工程预估费用  
     */  
    public BigDecimal getEstimationFee() {
        return estimationFee;
    }

    /* 
     *  工程预估费用的设值  
     * @param BigDecimal estimationFee  
     */  
    public void setEstimationFee(BigDecimal estimationFee){
        this.estimationFee = estimationFee;
    }

    /** 工程实际费用 */
    private BigDecimal realFeeTotal;

    /** 
     * 工程实际费用的取得  
     * @return BigDecimal 工程实际费用  
     */  
    public BigDecimal getRealFeeTotal() {
        return realFeeTotal;
    }

    /* 
     *  工程实际费用的设值  
     * @param BigDecimal realFeeTotal  
     */  
    public void setRealFeeTotal(BigDecimal realFeeTotal){
        this.realFeeTotal = realFeeTotal;
    }

    /** 工程材料费 */
    private BigDecimal materalFee;

    /** 
     * 工程材料费的取得  
     * @return BigDecimal 工程材料费  
     */  
    public BigDecimal getMateralFee() {
        return materalFee;
    }

    /* 
     *  工程材料费的设值  
     * @param BigDecimal materalFee  
     */  
    public void setMateralFee(BigDecimal materalFee){
        this.materalFee = materalFee;
    }

    /** 工程人工费 */
    private BigDecimal laborFee;

    /** 
     * 工程人工费的取得  
     * @return BigDecimal 工程人工费  
     */  
    public BigDecimal getLaborFee() {
        return laborFee;
    }

    /* 
     *  工程人工费的设值  
     * @param BigDecimal laborFee  
     */  
    public void setLaborFee(BigDecimal laborFee){
        this.laborFee = laborFee;
    }

    /** 收费时间 */
    private Timestamp payedTime;

    /** 
     * 收费时间的取得  
     * @return Timestamp 收费时间  
     */  
    public Timestamp getPayedTime() {
        return payedTime;
    }

    /* 
     *  收费时间的设值  
     * @param Timestamp payedTime  
     */  
    public void setPayedTime(Timestamp payedTime){
        this.payedTime = payedTime;
    }

}