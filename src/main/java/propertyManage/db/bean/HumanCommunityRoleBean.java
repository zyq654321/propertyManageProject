package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("human_community_role_mst")
public class HumanCommunityRoleBean{
    @Id 
    /** 项目小区人员权限ID */
    private Long communityRoleId;

    /** 
     * 项目小区人员权限ID的取得  
     * @return Long 项目小区人员权限ID  
     */  
    public Long getCommunityRoleId() {
        return communityRoleId;
    }

    /* 
     *  项目小区人员权限ID的设值  
     * @param Long communityRoleId  
     */  
    public void setCommunityRoleId(Long communityRoleId){
        this.communityRoleId = communityRoleId;
    }

    /** 人员ID */
    private Long humanResourceId;

    /** 
     * 人员ID的取得  
     * @return Long 人员ID  
     */  
    public Long getHumanResourceId() {
        return humanResourceId;
    }

    /* 
     *  人员ID的设值  
     * @param Long humanResourceId  
     */  
    public void setHumanResourceId(Long humanResourceId){
        this.humanResourceId = humanResourceId;
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

    /** 物业经理 0 */
    private Integer communityManager;

    /** 
     * 物业经理 0的取得  
     * @return Integer 物业经理 0  
     */  
    public Integer getCommunityManager() {
        return communityManager;
    }

    /* 
     *  物业经理 0的设值  
     * @param Integer communityManager  
     */  
    public void setCommunityManager(Integer communityManager){
        this.communityManager = communityManager;
    }

    /** 经理助理 1 */
    private Integer managerAssistant;

    /** 
     * 经理助理 1的取得  
     * @return Integer 经理助理 1  
     */  
    public Integer getManagerAssistant() {
        return managerAssistant;
    }

    /* 
     *  经理助理 1的设值  
     * @param Integer managerAssistant  
     */  
    public void setManagerAssistant(Integer managerAssistant){
        this.managerAssistant = managerAssistant;
    }

    /** 财务经理 2 */
    private Integer financeManager;

    /** 
     * 财务经理 2的取得  
     * @return Integer 财务经理 2  
     */  
    public Integer getFinanceManager() {
        return financeManager;
    }

    /* 
     *  财务经理 2的设值  
     * @param Integer financeManager  
     */  
    public void setFinanceManager(Integer financeManager){
        this.financeManager = financeManager;
    }

    /** 财务人员 3 */
    private Integer financeStaff;

    /** 
     * 财务人员 3的取得  
     * @return Integer 财务人员 3  
     */  
    public Integer getFinanceStaff() {
        return financeStaff;
    }

    /* 
     *  财务人员 3的设值  
     * @param Integer financeStaff  
     */  
    public void setFinanceStaff(Integer financeStaff){
        this.financeStaff = financeStaff;
    }

    /** 保安经理 4 */
    private Integer securityManager;

    /** 
     * 保安经理 4的取得  
     * @return Integer 保安经理 4  
     */  
    public Integer getSecurityManager() {
        return securityManager;
    }

    /* 
     *  保安经理 4的设值  
     * @param Integer securityManager  
     */  
    public void setSecurityManager(Integer securityManager){
        this.securityManager = securityManager;
    }

    /** 保安 5 */
    private Integer securityStaff;

    /** 
     * 保安 5的取得  
     * @return Integer 保安 5  
     */  
    public Integer getSecurityStaff() {
        return securityStaff;
    }

    /* 
     *  保安 5的设值  
     * @param Integer securityStaff  
     */  
    public void setSecurityStaff(Integer securityStaff){
        this.securityStaff = securityStaff;
    }

    /** 保洁员 6 */
    private Integer cleaner;

    /** 
     * 保洁员 6的取得  
     * @return Integer 保洁员 6  
     */  
    public Integer getCleaner() {
        return cleaner;
    }

    /* 
     *  保洁员 6的设值  
     * @param Integer cleaner  
     */  
    public void setCleaner(Integer cleaner){
        this.cleaner = cleaner;
    }

    /** 维修人员 7 */
    private Integer maintainer;

    /** 
     * 维修人员 7的取得  
     * @return Integer 维修人员 7  
     */  
    public Integer getMaintainer() {
        return maintainer;
    }

    /* 
     *  维修人员 7的设值  
     * @param Integer maintainer  
     */  
    public void setMaintainer(Integer maintainer){
        this.maintainer = maintainer;
    }

}