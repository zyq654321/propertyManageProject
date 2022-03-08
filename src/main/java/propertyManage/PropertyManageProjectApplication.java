package propertyManage;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = { "propertyManage.control",  "propertyManage.control.business","propertyManage.db","propertyManage.com.db.config" })
@SpringBootApplication
public class PropertyManageProjectApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(PropertyManageProjectApplication.class, args);
		
		SpringApplication application = new SpringApplication(PropertyManageProjectApplication.class);
		// application.setBannerMode(Mode.OFF);//关闭banner
		application.run(args);
	}
	

}
