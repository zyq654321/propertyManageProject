package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import propertyManage.db.bean.HumanResourceBean;
import propertyManage.db.bean.PropertyCommunityBean;

/** 
 *  物业小区基本信息表 Repository 
 */  
public interface PropertyCommunityRepository extends CrudRepository<PropertyCommunityBean,Integer>{
	
}