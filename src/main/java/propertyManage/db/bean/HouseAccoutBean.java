package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("house_accout_mst")
public class HouseAccoutBean{
    @Id 
    /** 住户ID */
    private Long houseAccountId;

    /** 
     * 住户ID的取得  
     * @return Long 住户ID  
     */  
    public Long getHouseAccountId() {
        return houseAccountId;
    }

    /* 
     *  住户ID的设值  
     * @param Long houseAccountId  
     */  
    public void setHouseAccountId(Long houseAccountId){
        this.houseAccountId = houseAccountId;
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

    /** 住户地址类型ID */
    private Integer addressTypeID;

    /** 
     * 住户地址类型ID的取得  
     * @return Integer 住户地址类型ID  
     */  
    public Integer getAddressTypeID() {
        return addressTypeID;
    }

    /* 
     *  住户地址类型ID的设值  
     * @param Integer addressTypeID  
     */  
    public void setAddressTypeID(Integer addressTypeID){
        this.addressTypeID = addressTypeID;
    }

    /** 一级地址信息 */
    private Integer addrClass1Info;

    /** 
     * 一级地址信息的取得  
     * @return Integer 一级地址信息  
     */  
    public Integer getAddrClass1Info() {
        return addrClass1Info;
    }

    /* 
     *  一级地址信息的设值  
     * @param Integer addrClass1Info  
     */  
    public void setAddrClass1Info(Integer addrClass1Info){
        this.addrClass1Info = addrClass1Info;
    }

    /** 二级地址信息 */
    private Integer addrClass2Info;

    /** 
     * 二级地址信息的取得  
     * @return Integer 二级地址信息  
     */  
    public Integer getAddrClass2Info() {
        return addrClass2Info;
    }

    /* 
     *  二级地址信息的设值  
     * @param Integer addrClass2Info  
     */  
    public void setAddrClass2Info(Integer addrClass2Info){
        this.addrClass2Info = addrClass2Info;
    }

    /** 三级地址信息 */
    private Integer addrClass3Info;

    /** 
     * 三级地址信息的取得  
     * @return Integer 三级地址信息  
     */  
    public Integer getAddrClass3Info() {
        return addrClass3Info;
    }

    /* 
     *  三级地址信息的设值  
     * @param Integer addrClass3Info  
     */  
    public void setAddrClass3Info(Integer addrClass3Info){
        this.addrClass3Info = addrClass3Info;
    }

    /** 四级地址信息 */
    private Integer addrClass4Info;

    /** 
     * 四级地址信息的取得  
     * @return Integer 四级地址信息  
     */  
    public Integer getAddrClass4Info() {
        return addrClass4Info;
    }

    /* 
     *  四级地址信息的设值  
     * @param Integer addrClass4Info  
     */  
    public void setAddrClass4Info(Integer addrClass4Info){
        this.addrClass4Info = addrClass4Info;
    }

    /** 全地址 */
    private String allAddr;

    /** 
     * 全地址的取得  
     * @return String 全地址  
     */  
    public String getAllAddr() {
        return allAddr;
    }

    /* 
     *  全地址的设值  
     * @param String allAddr  
     */  
    public void setAllAddr(String allAddr){
        this.allAddr = allAddr;
    }

    /** 产权性质 0 产权 1 使用权 */
    private Integer propertyRight;

    /** 
     * 产权性质 0 产权 1 使用权的取得  
     * @return Integer 产权性质 0 产权 1 使用权  
     */  
    public Integer getPropertyRight() {
        return propertyRight;
    }

    /* 
     *  产权性质 0 产权 1 使用权的设值  
     * @param Integer propertyRight  
     */  
    public void setPropertyRight(Integer propertyRight){
        this.propertyRight = propertyRight;
    }

    /** 户主姓名 */
    private String mainMemberName;

    /** 
     * 户主姓名的取得  
     * @return String 户主姓名  
     */  
    public String getMainMemberName() {
        return mainMemberName;
    }

    /* 
     *  户主姓名的设值  
     * @param String mainMemberName  
     */  
    public void setMainMemberName(String mainMemberName){
        this.mainMemberName = mainMemberName;
    }

    /** 户主电话 */
    private Long mainMemberCall;

    /** 
     * 户主电话的取得  
     * @return Long 户主电话  
     */  
    public Long getMainMemberCall() {
        return mainMemberCall;
    }

    /* 
     *  户主电话的设值  
     * @param Long mainMemberCall  
     */  
    public void setMainMemberCall(Long mainMemberCall){
        this.mainMemberCall = mainMemberCall;
    }

    /** 房屋面积 */
    private BigDecimal houseArea;

    /** 
     * 房屋面积的取得  
     * @return BigDecimal 房屋面积  
     */  
    public BigDecimal getHouseArea() {
        return houseArea;
    }

    /* 
     *  房屋面积的设值  
     * @param BigDecimal houseArea  
     */  
    public void setHouseArea(BigDecimal houseArea){
        this.houseArea = houseArea;
    }

    /** 合计费率 */
    private BigDecimal summaryFeeRate;

    /** 
     * 合计费率的取得  
     * @return BigDecimal 合计费率  
     */  
    public BigDecimal getSummaryFeeRate() {
        return summaryFeeRate;
    }

    /* 
     *  合计费率的设值  
     * @param BigDecimal summaryFeeRate  
     */  
    public void setSummaryFeeRate(BigDecimal summaryFeeRate){
        this.summaryFeeRate = summaryFeeRate;
    }

    /** 计费周期 */
    private Integer feePeriod;

    /** 
     * 计费周期的取得  
     * @return Integer 计费周期  
     */  
    public Integer getFeePeriod() {
        return feePeriod;
    }

    /* 
     *  计费周期的设值  
     * @param Integer feePeriod  
     */  
    public void setFeePeriod(Integer feePeriod){
        this.feePeriod = feePeriod;
    }

    /** 物业管理费率 */
    private BigDecimal propertyFeeRate;

    /** 
     * 物业管理费率的取得  
     * @return BigDecimal 物业管理费率  
     */  
    public BigDecimal getPropertyFeeRate() {
        return propertyFeeRate;
    }

    /* 
     *  物业管理费率的设值  
     * @param BigDecimal propertyFeeRate  
     */  
    public void setPropertyFeeRate(BigDecimal propertyFeeRate){
        this.propertyFeeRate = propertyFeeRate;
    }

    /** 保洁费率 */
    private BigDecimal cleanFeeRate;

    /** 
     * 保洁费率的取得  
     * @return BigDecimal 保洁费率  
     */  
    public BigDecimal getCleanFeeRate() {
        return cleanFeeRate;
    }

    /* 
     *  保洁费率的设值  
     * @param BigDecimal cleanFeeRate  
     */  
    public void setCleanFeeRate(BigDecimal cleanFeeRate){
        this.cleanFeeRate = cleanFeeRate;
    }

    /** 保安费率 */
    private BigDecimal securityFeeRate;

    /** 
     * 保安费率的取得  
     * @return BigDecimal 保安费率  
     */  
    public BigDecimal getSecurityFeeRate() {
        return securityFeeRate;
    }

    /* 
     *  保安费率的设值  
     * @param BigDecimal securityFeeRate  
     */  
    public void setSecurityFeeRate(BigDecimal securityFeeRate){
        this.securityFeeRate = securityFeeRate;
    }

    /** 水泵增压费率 */
    private BigDecimal waterPumpFeeRate;

    /** 
     * 水泵增压费率的取得  
     * @return BigDecimal 水泵增压费率  
     */  
    public BigDecimal getWaterPumpFeeRate() {
        return waterPumpFeeRate;
    }

    /* 
     *  水泵增压费率的设值  
     * @param BigDecimal waterPumpFeeRate  
     */  
    public void setWaterPumpFeeRate(BigDecimal waterPumpFeeRate){
        this.waterPumpFeeRate = waterPumpFeeRate;
    }

    /** 其他费率 */
    private BigDecimal otherFeeRate;

    /** 
     * 其他费率的取得  
     * @return BigDecimal 其他费率  
     */  
    public BigDecimal getOtherFeeRate() {
        return otherFeeRate;
    }

    /* 
     *  其他费率的设值  
     * @param BigDecimal otherFeeRate  
     */  
    public void setOtherFeeRate(BigDecimal otherFeeRate){
        this.otherFeeRate = otherFeeRate;
    }

    /** 电梯费率 */
    private BigDecimal elevatorRate;

    /** 
     * 电梯费率的取得  
     * @return BigDecimal 电梯费率  
     */  
    public BigDecimal getElevatorRate() {
        return elevatorRate;
    }

    /* 
     *  电梯费率的设值  
     * @param BigDecimal elevatorRate  
     */  
    public void setElevatorRate(BigDecimal elevatorRate){
        this.elevatorRate = elevatorRate;
    }

    /** 车位费用 */
    private BigDecimal parkingFee;

    /** 
     * 车位费用的取得  
     * @return BigDecimal 车位费用  
     */  
    public BigDecimal getParkingFee() {
        return parkingFee;
    }

    /* 
     *  车位费用的设值  
     * @param BigDecimal parkingFee  
     */  
    public void setParkingFee(BigDecimal parkingFee){
        this.parkingFee = parkingFee;
    }

    /** 固定费用 */
    private BigDecimal fixedFee;

    /** 
     * 固定费用的取得  
     * @return BigDecimal 固定费用  
     */  
    public BigDecimal getFixedFee() {
        return fixedFee;
    }

    /* 
     *  固定费用的设值  
     * @param BigDecimal fixedFee  
     */  
    public void setFixedFee(BigDecimal fixedFee){
        this.fixedFee = fixedFee;
    }

    /** 合计缴用 */
    private BigDecimal totalPeriodFee;

    /** 
     * 合计缴用的取得  
     * @return BigDecimal 合计缴用  
     */  
    public BigDecimal getTotalPeriodFee() {
        return totalPeriodFee;
    }

    /* 
     *  合计缴用的设值  
     * @param BigDecimal totalPeriodFee  
     */  
    public void setTotalPeriodFee(BigDecimal totalPeriodFee){
        this.totalPeriodFee = totalPeriodFee;
    }

    /** 已缴费期 */
    private Date payedFeePeriod;

    /** 
     * 已缴费期的取得  
     * @return Date 已缴费期  
     */  
    public Date getPayedFeePeriod() {
        return payedFeePeriod;
    }

    /* 
     *  已缴费期的设值  
     * @param Date payedFeePeriod  
     */  
    public void setPayedFeePeriod(Date payedFeePeriod){
        this.payedFeePeriod = payedFeePeriod;
    }

}