package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("request_asign_work_trans")
public class RequestAsignWorkTransBean{
    @Id 
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

    /** 派单人 */
    private String asignerName;

    /** 
     * 派单人的取得  
     * @return String 派单人  
     */  
    public String getAsignerName() {
        return asignerName;
    }

    /* 
     *  派单人的设值  
     * @param String asignerName  
     */  
    public void setAsignerName(String asignerName){
        this.asignerName = asignerName;
    }

    /** 派工时间 */
    private Timestamp asignTime;

    /** 
     * 派工时间的取得  
     * @return Timestamp 派工时间  
     */  
    public Timestamp getAsignTime() {
        return asignTime;
    }

    /* 
     *  派工时间的设值  
     * @param Timestamp asignTime  
     */  
    public void setAsignTime(Timestamp asignTime){
        this.asignTime = asignTime;
    }

    /** 维修人员姓名 */
    private Timestamp asignedWorkerName;

    /** 
     * 维修人员姓名的取得  
     * @return Timestamp 维修人员姓名  
     */  
    public Timestamp getAsignedWorkerName() {
        return asignedWorkerName;
    }

    /* 
     *  维修人员姓名的设值  
     * @param Timestamp asignedWorkerName  
     */  
    public void setAsignedWorkerName(Timestamp asignedWorkerName){
        this.asignedWorkerName = asignedWorkerName;
    }

    /** 维修人员工号 */
    private Long workerHrId;

    /** 
     * 维修人员工号的取得  
     * @return Long 维修人员工号  
     */  
    public Long getWorkerHrId() {
        return workerHrId;
    }

    /* 
     *  维修人员工号的设值  
     * @param Long workerHrId  
     */  
    public void setWorkerHrId(Long workerHrId){
        this.workerHrId = workerHrId;
    }

    /**  */
    private Long asignedWorkerCall;

    /** 
     * 的取得  
     * @return Long   
     */  
    public Long getAsignedWorkerCall() {
        return asignedWorkerCall;
    }

    /* 
     *  的设值  
     * @param Long asignedWorkerCall  
     */  
    public void setAsignedWorkerCall(Long asignedWorkerCall){
        this.asignedWorkerCall = asignedWorkerCall;
    }

    /** 工程预估费用 */
    private BigDecimal workEstimationFee;

    /** 
     * 工程预估费用的取得  
     * @return BigDecimal 工程预估费用  
     */  
    public BigDecimal getWorkEstimationFee() {
        return workEstimationFee;
    }

    /* 
     *  工程预估费用的设值  
     * @param BigDecimal workEstimationFee  
     */  
    public void setWorkEstimationFee(BigDecimal workEstimationFee){
        this.workEstimationFee = workEstimationFee;
    }

    /** 工程实际费用 */
    private BigDecimal workRealFee;

    /** 
     * 工程实际费用的取得  
     * @return BigDecimal 工程实际费用  
     */  
    public BigDecimal getWorkRealFee() {
        return workRealFee;
    }

    /* 
     *  工程实际费用的设值  
     * @param BigDecimal workRealFee  
     */  
    public void setWorkRealFee(BigDecimal workRealFee){
        this.workRealFee = workRealFee;
    }

    /**  */
    private Timestamp workPayedTime;

    /** 
     * 的取得  
     * @return Timestamp   
     */  
    public Timestamp getWorkPayedTime() {
        return workPayedTime;
    }

    /* 
     *  的设值  
     * @param Timestamp workPayedTime  
     */  
    public void setWorkPayedTime(Timestamp workPayedTime){
        this.workPayedTime = workPayedTime;
    }

    /** 工程材料费 */
    private BigDecimal workMateralFee;

    /** 
     * 工程材料费的取得  
     * @return BigDecimal 工程材料费  
     */  
    public BigDecimal getWorkMateralFee() {
        return workMateralFee;
    }

    /* 
     *  工程材料费的设值  
     * @param BigDecimal workMateralFee  
     */  
    public void setWorkMateralFee(BigDecimal workMateralFee){
        this.workMateralFee = workMateralFee;
    }

    /** 工程人工费 */
    private BigDecimal workLaborFee;

    /** 
     * 工程人工费的取得  
     * @return BigDecimal 工程人工费  
     */  
    public BigDecimal getWorkLaborFee() {
        return workLaborFee;
    }

    /* 
     *  工程人工费的设值  
     * @param BigDecimal workLaborFee  
     */  
    public void setWorkLaborFee(BigDecimal workLaborFee){
        this.workLaborFee = workLaborFee;
    }

    /** 工程评价等级 */
    private Integer workEvalueLevel;

    /** 
     * 工程评价等级的取得  
     * @return Integer 工程评价等级  
     */  
    public Integer getWorkEvalueLevel() {
        return workEvalueLevel;
    }

    /* 
     *  工程评价等级的设值  
     * @param Integer workEvalueLevel  
     */  
    public void setWorkEvalueLevel(Integer workEvalueLevel){
        this.workEvalueLevel = workEvalueLevel;
    }

    /** 工程评语 */
    private String workEvalueComment;

    /** 
     * 工程评语的取得  
     * @return String 工程评语  
     */  
    public String getWorkEvalueComment() {
        return workEvalueComment;
    }

    /* 
     *  工程评语的设值  
     * @param String workEvalueComment  
     */  
    public void setWorkEvalueComment(String workEvalueComment){
        this.workEvalueComment = workEvalueComment;
    }

}