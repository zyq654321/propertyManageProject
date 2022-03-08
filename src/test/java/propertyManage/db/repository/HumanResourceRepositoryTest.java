package propertyManage.db.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import propertyManage.db.bean.HumanResourceBean;
import propertyManage.db.repository.HumanResourceRepository;

@SpringBootTest
public class HumanResourceRepositoryTest {
	

	@Autowired
	private HumanResourceRepository humanResourceRepository;

	@Test
	public void createSimpleCustomer() {
		String testStr="1234567890123456";
		System.out.println("1234567890123456 sub14="+testStr.substring(14, 15));
		HumanResourceBean humanResourceBean=new HumanResourceBean();
		Optional<HumanResourceBean> humanResourceBeanOpt =humanResourceRepository.findById(new Long("12345712"));
		if (humanResourceBeanOpt.isPresent()) {
			humanResourceBean=humanResourceBeanOpt.get();
			System.out.println("HumanResourceId="+humanResourceBean.getHumanResourceId());
			
			System.out.println("getHrname="+humanResourceBean.getRealName());
		}
		List<HumanResourceBean> humanResourceBeanList=humanResourceRepository.findBySysName("Name2");
		for(HumanResourceBean nhumanResourceBean :humanResourceBeanList) {
			System.out.println("HumanResourceId="+nhumanResourceBean.getHumanResourceId());
		}
		humanResourceBean=new HumanResourceBean();
		humanResourceBean.setCallNumber(new Long("13918201981"));
		humanResourceBean.setBirthday(new Date(2022,12,22));
		humanResourceBean.setCompanyID(123456);
		humanResourceBean.setCompanyTitle("CompanyTitle");
		humanResourceBean.setGender(true);
		humanResourceBean.setHomeAddress("HomeAddress");
		//humanResourceBean.setHumanResourceId(new Long("12345693"));
		humanResourceBean.setIdentityCardId("36222112329377373");
		humanResourceBean.setSysName("Name2");
		humanResourceBean.setRealName("Name2");
		humanResourceBean.setPassword("751016");
		humanResourceBean=humanResourceRepository.save(humanResourceBean);
		System.out.println("new HumanResourceId="+humanResourceBean.getHumanResourceId());
		
	}
}
