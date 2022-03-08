package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;


import propertyManage.db.bean.HumanResourceBean;

/** 
 *  人力资源基本表 Repository 
 */
public interface HumanResourceRepository extends CrudRepository<HumanResourceBean,Long>{
	
	List<HumanResourceBean> findBySysName(String sysName);


	
	List<HumanResourceBean> findByRealName(String  realName);

}