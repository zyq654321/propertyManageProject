package propertyManage.com.db.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.NamingStrategy;
import org.springframework.data.relational.core.mapping.RelationalPersistentProperty;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {

	@Value("${spring.datasource.druid.username}")
	private String druidUserName;
	@Value("${spring.datasource.druid.password}")
	private String druidPassword;
	@Value("${spring.datasource.druid.url}")
	private String druidUrl;
	@Value("${spring.datasource.druid.driver-class-name}")
	private String druidDriverClass;
	@Value("${spring.datasource.druid.db-type}")
	private String dataSourceType;

	@Bean(name = "dataSource", initMethod = "init", destroyMethod = "close")
	// @Qualifier("dataSource")
	// @ConfigurationProperties(prefix = "spring.datasource.druid.druid")
	public DataSource dataSource() {

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername(druidUserName);
		druidDataSource.setPassword(druidPassword);
		druidDataSource.setUrl(druidUrl);
		druidDataSource.setDriverClassName(druidDriverClass);
		druidDataSource.setDbType(dataSourceType);
		druidDataSource.setInitialSize(1);
		// druidDataSource.init();

		return druidDataSource;
	}

	@Bean
	public NamingStrategy namingStrategy() {
		return new NamingStrategy() {
			@Override
			public String getColumnName(RelationalPersistentProperty property) {
				// Assert.notNull(property, "Property must not be null.");
				// 将列名原样返回就好
				return property.getName();
			}
		};
	}
}
