package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.HouseAddrTypeBean;
import propertyManage.db.bean.HumanResourceBean;

/** 
 *  小区住户地址描述方式表 Repository 
 */  
public interface HouseAddrTypeRepository extends CrudRepository<HouseAddrTypeBean,Long>{
	
	List<HouseAddrTypeBean> findByCommunityId(Integer communityId);

}