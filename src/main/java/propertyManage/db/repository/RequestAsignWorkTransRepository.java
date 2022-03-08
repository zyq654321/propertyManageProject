package propertyManage.db.repository;

import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.RequestAsignWorkTransBean;

/** 
 *  报修处理工程事务表表 Repository 
 */  
public interface RequestAsignWorkTransRepository extends CrudRepository<RequestAsignWorkTransBean,Long>{

}