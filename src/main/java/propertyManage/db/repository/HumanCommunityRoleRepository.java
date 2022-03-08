package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import propertyManage.db.bean.HumanCommunityRoleBean;

/** 
 *  项目小区人员权限表 Repository 
 */  
public interface HumanCommunityRoleRepository extends CrudRepository<HumanCommunityRoleBean,Long>{
	
	List<HumanCommunityRoleBean> findByHumanResourceId(Long humanResourceId);
	
	@Query(value="Select A .*,B.RealName from human_community_role_mst A left join human_resource_mst B on B.HumanResourceId =A.HumanResourceId    "
			+ " where communityId=:communityId  and (Maintainer =1 or CommunityManager=1)")
	List<HumanCommunityRoleBean> findAllMaintainer (Integer communityId);

}