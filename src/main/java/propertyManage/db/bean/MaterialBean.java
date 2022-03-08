package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("material_mst")
public class MaterialBean{
    @Id 
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

    /** 材料名 */
    private String materialName;

    /** 
     * 材料名的取得  
     * @return String 材料名  
     */  
    public String getMaterialName() {
        return materialName;
    }

    /* 
     *  材料名的设值  
     * @param String materialName  
     */  
    public void setMaterialName(String materialName){
        this.materialName = materialName;
    }

    /** 公司ID */
    private Integer companyId;

    /** 
     * 公司ID的取得  
     * @return Integer 公司ID  
     */  
    public Integer getCompanyId() {
        return companyId;
    }

    /* 
     *  公司ID的设值  
     * @param Integer companyId  
     */  
    public void setCompanyId(Integer companyId){
        this.companyId = companyId;
    }

    /** 材料单价 */
    private BigDecimal materiaUnitValue;

    /** 
     * 材料单价的取得  
     * @return BigDecimal 材料单价  
     */  
    public BigDecimal getMateriaUnitValue() {
        return materiaUnitValue;
    }

    /* 
     *  材料单价的设值  
     * @param BigDecimal materiaUnitValue  
     */  
    public void setMateriaUnitValue(BigDecimal materiaUnitValue){
        this.materiaUnitValue = materiaUnitValue;
    }

    /** 材料单位 */
    private String materiaUnit;

    /** 
     * 材料单位的取得  
     * @return String 材料单位  
     */  
    public String getMateriaUnit() {
        return materiaUnit;
    }

    /* 
     *  材料单位的设值  
     * @param String materiaUnit  
     */  
    public void setMateriaUnit(String materiaUnit){
        this.materiaUnit = materiaUnit;
    }

}