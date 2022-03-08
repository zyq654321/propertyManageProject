package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("request_status_history_trans")
public class RequestStatusHistoryTransBean{
    @Id 
    /** 物业报修请求状态变更记录ID */
    private Integer requestStatusHistoryID;

    /** 
     * 物业报修请求状态变更记录ID的取得  
     * @return Integer 物业报修请求状态变更记录ID  
     */  
    public Integer getRequestStatusHistoryID() {
        return requestStatusHistoryID;
    }

    /* 
     *  物业报修请求状态变更记录ID的设值  
     * @param Integer requestStatusHistoryID  
     */  
    public void setRequestStatusHistoryID(Integer requestStatusHistoryID){
        this.requestStatusHistoryID = requestStatusHistoryID;
    }

    /** 报修请求ID */
    private Integer requestID;

    /** 
     * 报修请求ID的取得  
     * @return Integer 报修请求ID  
     */  
    public Integer getRequestID() {
        return requestID;
    }

    /* 
     *  报修请求ID的设值  
     * @param Integer requestID  
     */  
    public void setRequestID(Integer requestID){
        this.requestID = requestID;
    }

    /** 报修请求状态 */
    private Integer status;

    /** 
     * 报修请求状态的取得  
     * @return Integer 报修请求状态  
     */  
    public Integer getStatus() {
        return status;
    }

    /* 
     *  报修请求状态的设值  
     * @param Integer status  
     */  
    public void setStatus(Integer status){
        this.status = status;
    }

    /** 状态变更时间 */
    private Timestamp modifyDateTime;

    /** 
     * 状态变更时间的取得  
     * @return Timestamp 状态变更时间  
     */  
    public Timestamp getModifyDateTime() {
        return modifyDateTime;
    }

    /* 
     *  状态变更时间的设值  
     * @param Timestamp modifyDateTime  
     */  
    public void setModifyDateTime(Timestamp modifyDateTime){
        this.modifyDateTime = modifyDateTime;
    }

    /**  */
    private String modifyComment;

    /** 
     * 的取得  
     * @return String   
     */  
    public String getModifyComment() {
        return modifyComment;
    }

    /* 
     *  的设值  
     * @param String modifyComment  
     */  
    public void setModifyComment(String modifyComment){
        this.modifyComment = modifyComment;
    }

}