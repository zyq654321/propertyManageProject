package propertyManage.db.repository;

import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.MaterialApplyHistoryTransBean;

/** 
 *  工程材料申领表表 Repository 
 */  
public interface MaterialApplyHistoryTransRepository extends CrudRepository<MaterialApplyHistoryTransBean,Long>{

}