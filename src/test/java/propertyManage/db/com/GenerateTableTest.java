package propertyManage.db.com;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import propertyManage.db.bean.HumanResourceBean;





@SpringBootTest
public class GenerateTableTest {
	
	@Autowired
	private GenerateTableDao generateTableDao;


	@Test
	public void createSimpleCustomer() {


		generateTableDao.execute();

		System.out.println("end");
	
		
	}

}
