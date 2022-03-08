package propertyManage.db.repository;

import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.MaterialBean;

/** 
 *  工程材料基本表表 Repository 
 */  
public interface MaterialRepository extends CrudRepository<MaterialBean,Long>{

}