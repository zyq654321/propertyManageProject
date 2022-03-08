package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("human_resource_mst")
public class HumanResourceBean{
    @Id 
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

    /** 真实姓名 */
    private String realName;

    /** 
     * 真实姓名的取得  
     * @return String 真实姓名  
     */  
    public String getRealName() {
        return realName;
    }

    /* 
     *  真实姓名的设值  
     * @param String realName  
     */  
    public void setRealName(String realName){
        this.realName = realName;
    }

    /** 系统用户名 */
    private String sysName;

    /** 
     * 系统用户名的取得  
     * @return String 系统用户名  
     */  
    public String getSysName() {
        return sysName;
    }

    /* 
     *  系统用户名的设值  
     * @param String sysName  
     */  
    public void setSysName(String sysName){
        this.sysName = sysName;
    }

    /** 身份证号 */
    private String identityCardId;

    /** 
     * 身份证号的取得  
     * @return String 身份证号  
     */  
    public String getIdentityCardId() {
        return identityCardId;
    }

    /* 
     *  身份证号的设值  
     * @param String identityCardId  
     */  
    public void setIdentityCardId(String identityCardId){
        this.identityCardId = identityCardId;
    }

    /** 生日 */
    private Date birthday;

    /** 
     * 生日的取得  
     * @return Date 生日  
     */  
    public Date getBirthday() {
        return birthday;
    }

    /* 
     *  生日的设值  
     * @param Date birthday  
     */  
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    /** 联系电话 */
    private Long callNumber;

    /** 
     * 联系电话的取得  
     * @return Long 联系电话  
     */  
    public Long getCallNumber() {
        return callNumber;
    }

    /* 
     *  联系电话的设值  
     * @param Long callNumber  
     */  
    public void setCallNumber(Long callNumber){
        this.callNumber = callNumber;
    }

    /** 性别 */
    private Boolean gender;

    /** 
     * 性别的取得  
     * @return Boolean 性别  
     */  
    public Boolean getGender() {
        return gender;
    }

    /* 
     *  性别的设值  
     * @param Boolean gender  
     */  
    public void setGender(Boolean gender){
        this.gender = gender;
    }

    /** 住址 */
    private String homeAddress;

    /** 
     * 住址的取得  
     * @return String 住址  
     */  
    public String getHomeAddress() {
        return homeAddress;
    }

    /* 
     *  住址的设值  
     * @param String homeAddress  
     */  
    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }

    /** 系统密码 */
    private String password;

    /** 
     * 系统密码的取得  
     * @return String 系统密码  
     */  
    public String getPassword() {
        return password;
    }

    /* 
     *  系统密码的设值  
     * @param String password  
     */  
    public void setPassword(String password){
        this.password = password;
    }

}