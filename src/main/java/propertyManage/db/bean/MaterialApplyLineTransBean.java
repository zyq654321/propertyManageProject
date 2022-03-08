package propertyManage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Table("material_apply_line_trans")
public class MaterialApplyLineTransBean{
    @Id 
    /**  */
    private Long applyID;

    /** 
     * 的取得  
     * @return Long   
     */  
    public Long getApplyID() {
        return applyID;
    }

    /* 
     *  的设值  
     * @param Long applyID  
     */  
    public void setApplyID(Long applyID){
        this.applyID = applyID;
    }

    /** 明细枝番 */
    private String lineNo;

    /** 
     * 明细枝番的取得  
     * @return String 明细枝番  
     */  
    public String getLineNo() {
        return lineNo;
    }

    /* 
     *  明细枝番的设值  
     * @param String lineNo  
     */  
    public void setLineNo(String lineNo){
        this.lineNo = lineNo;
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

    /** 数量 */
    private BigDecimal quantity;

    /** 
     * 数量的取得  
     * @return BigDecimal 数量  
     */  
    public BigDecimal getQuantity() {
        return quantity;
    }

    /* 
     *  数量的设值  
     * @param BigDecimal quantity  
     */  
    public void setQuantity(BigDecimal quantity){
        this.quantity = quantity;
    }

    /**  */
    private Integer unit;

    /** 
     * 的取得  
     * @return Integer   
     */  
    public Integer getUnit() {
        return unit;
    }

    /* 
     *  的设值  
     * @param Integer unit  
     */  
    public void setUnit(Integer unit){
        this.unit = unit;
    }

}