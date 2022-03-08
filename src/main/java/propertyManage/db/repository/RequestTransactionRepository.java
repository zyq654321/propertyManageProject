package propertyManage.db.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import propertyManage.db.bean.RequestTransactionBean;

/** 
 *  物业报修请求事务表表 Repository 
 */  
public interface RequestTransactionRepository extends CrudRepository<RequestTransactionBean,Long>{

	@Query(value="Select * from request_transaction where if(:requestID is not null,requestID = :requestID,1=1)  "
			+ "and if(:beginDay is not null , Date(RequestDateTime) >= :beginDay,1=1) "
			+ "and if(:endDay is not null,  Date(RequestDateTime) <= :endDay,1=1) "
			+ "and  if(:requesterCall is not null ,requesterCall = :requesterCall,1=1) "
			+ "and  if(:requestType is not null ,requestType = :requestType,1=1) "
			+ "and  if(:requestPrivatePublic is not null ,requestPrivatePublic = :requestPrivatePublic,1=1) "
			+ "and  if(:requestCurrentStatus is not null ,requestCurrentStatus < :requestCurrentStatus,1=1) ")
	List<RequestTransactionBean> findRequestData(Long requestID,java.sql.Date beginDay,
			java.sql.Date endDay, String requesterCall,Integer requestCurrentStatus,
			Integer requestType,Integer requestPrivatePublic);

}