package configs;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"db","beans"})
@PropertySource("classpath:app.properties")
@EnableTransactionManagement
public class SpringConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dati= new DriverManagerDataSource(env.getProperty("db.url"),env.getProperty("db.username"),env.getProperty("db.password"));
		dati.setDriverClassName(env.getProperty("db.driver"));
		return dati;
		
	}
	
	@Bean
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean factory= new LocalSessionFactoryBean();
		factory.setPackagesToScan("beans");
		factory.setDataSource(getDataSource());
		Properties hibernateProps= new Properties();
		hibernateProps.setProperty("hibernate.hbm2ddl.auto", "update");
		factory.setHibernateProperties(hibernateProps);
		return factory;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager getHibernateManager(SessionFactory getFactory) {
		HibernateTransactionManager hibi=new HibernateTransactionManager();
		hibi.setSessionFactory(getFactory);
			return hibi;
		
	}
	
	
}
