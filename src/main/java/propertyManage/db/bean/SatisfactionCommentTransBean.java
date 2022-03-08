package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("satisfaction_comment_trans")
public class SatisfactionCommentTransBean{
    @Id 
    /** 评价ID */
    private Long commentID;

    /** 
     * 评价ID的取得  
     * @return Long 评价ID  
     */  
    public Long getCommentID() {
        return commentID;
    }

    /* 
     *  评价ID的设值  
     * @param Long commentID  
     */  
    public void setCommentID(Long commentID){
        this.commentID = commentID;
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

    /** 满意度等级 */
    private Integer satisfactionLevel;

    /** 
     * 满意度等级的取得  
     * @return Integer 满意度等级  
     */  
    public Integer getSatisfactionLevel() {
        return satisfactionLevel;
    }

    /* 
     *  满意度等级的设值  
     * @param Integer satisfactionLevel  
     */  
    public void setSatisfactionLevel(Integer satisfactionLevel){
        this.satisfactionLevel = satisfactionLevel;
    }

    /** 评价内容 */
    private String comment;

    /** 
     * 评价内容的取得  
     * @return String 评价内容  
     */  
    public String getComment() {
        return comment;
    }

    /* 
     *  评价内容的设值  
     * @param String comment  
     */  
    public void setComment(String comment){
        this.comment = comment;
    }

    /** 评价时间 */
    private Timestamp commentTime;

    /** 
     * 评价时间的取得  
     * @return Timestamp 评价时间  
     */  
    public Timestamp getCommentTime() {
        return commentTime;
    }

    /* 
     *  评价时间的设值  
     * @param Timestamp commentTime  
     */  
    public void setCommentTime(Timestamp commentTime){
        this.commentTime = commentTime;
    }

    /** 评价人 */
    private String commentName;

    /** 
     * 评价人的取得  
     * @return String 评价人  
     */  
    public String getCommentName() {
        return commentName;
    }

    /* 
     *  评价人的设值  
     * @param String commentName  
     */  
    public void setCommentName(String commentName){
        this.commentName = commentName;
    }

}