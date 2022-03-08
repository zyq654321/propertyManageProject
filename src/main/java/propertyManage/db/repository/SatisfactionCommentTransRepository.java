package propertyManage.db.repository;

import org.springframework.data.repository.CrudRepository;
import propertyManage.db.bean.SatisfactionCommentTransBean;

/** 
 *  满意度评价表 Repository 
 */  
public interface SatisfactionCommentTransRepository extends CrudRepository<SatisfactionCommentTransBean,Long>{

}