package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("asign_history_trans")
public class AsignHistoryTransBean{
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

    /** 版本号 */
    private Integer versionNo;

    /** 
     * 版本号的取得  
     * @return Integer 版本号  
     */  
    public Integer getversionNo() {
        return versionNo;
    }

    /* 
     *  版本号的设值  
     * @param Integer versionNo  
     */  
    public void setversionNo(Integer versionNo){
        this.versionNo = versionNo;
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
    private String asignedWorkerName;

    /** 
     * 维修人员姓名的取得  
     * @return String 维修人员姓名  
     */  
    public String getAsignedWorkerName() {
        return asignedWorkerName;
    }

    /* 
     *  维修人员姓名的设值  
     * @param String asignedWorkerName  
     */  
    public void setAsignedWorkerName(String asignedWorkerName){
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

}