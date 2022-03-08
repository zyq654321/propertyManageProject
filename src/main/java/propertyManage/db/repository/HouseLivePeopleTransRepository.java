package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import propertyManage.db.bean.HouseLivePeopleTransBean;

/** 
 *  房屋居住人表 Repository 
 */  
public interface HouseLivePeopleTransRepository extends CrudRepository<HouseLivePeopleTransBean,Long>{

	@Query(value="Select * from house_live_people_trans where houseAccountId =:houseAccountId and MoveDate is null")
	List<HouseLivePeopleTransBean>  findByHouseAccountId(Long houseAccountId);
}