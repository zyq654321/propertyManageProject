package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.HouseAccoutBean;
import propertyManage.db.bean.RequestTransactionBean;

/** 
 *  物业住户基本信息 Repository 
 */  
public interface HouseAccoutRepository extends CrudRepository<HouseAccoutBean,Long>{
	
	@Query(value="Select * from house_accout_mst where if(:houseAccountId is not null , houseAccountId = :houseAccountId,1=1)"
			+ "and CommunityId = :communityId  "
			+ "and if(:addressTypeID is not null , addressTypeID = :addressTypeID,1=1) "
			+ "and if(:addrClass1Info is not null , addrClass1Info = :addrClass1Info,1=1) "
			+ "and if(:addrClass2Info is not null , addrClass2Info = :addrClass2Info,1=1) "
			+ "and if(:addrClass3Info is not null , addrClass3Info = :addrClass3Info,1=1) "
			+ "and if(:addrClass4Info is not null , addrClass4Info = :addrClass4Info,1=1) ")
			
	List<HouseAccoutBean> findHouseInfo(Long houseAccountId,Integer communityId,Integer addressTypeID,Integer addrClass1Info,
			Integer addrClass2Info,Integer addrClass3Info,Integer addrClass4Info);

}