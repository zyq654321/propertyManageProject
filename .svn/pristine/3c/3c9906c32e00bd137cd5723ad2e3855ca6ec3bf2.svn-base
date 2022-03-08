package propertyManage.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import propertyManage.db.bean.HumanResourceBean;
import propertyManage.db.bean.RequestAsignTransBean;

/** 
 *  报修处理工程事务表 Repository 
 */  
public interface RequestAsignTransRepository extends CrudRepository<RequestAsignTransBean,Long>{

	Optional<RequestAsignTransBean>  findByRequestId(Long requestId);

}