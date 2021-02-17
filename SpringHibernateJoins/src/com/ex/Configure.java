package com.ex;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class Configure {

	DriverManagerDataSource dmds;

	LocalSessionFactoryBean lsfb;

	HibernateTemplate ht;

	@Bean
	public DriverManagerDataSource getConnect() {
		dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/motivity");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}

	@Bean
	public LocalSessionFactoryBean getSession() {
		lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dmds);
		lsfb.setAnnotatedClasses(Customer.class,Vendor.class);
		Properties hp = new Properties();
		hp.setProperty("hibernate.show_sql", "true");
		hp.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hp.setProperty("hibernate.hbm2ddl.auto", "create");
		lsfb.setHibernateProperties(hp);
		return lsfb;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		ht=new HibernateTemplate();
		ht.setSessionFactory(lsfb.getObject());
		ht.setCheckWriteOperations(false);
		return ht;
	}

	@Bean
	public InnerJoin hTemplates() {
		InnerJoin ss = new InnerJoin();
		ss.setHbTemplate(ht);
		return ss;
	}
	
	@Bean
	public Insert hTemplatei() {
		Insert ss = new Insert();
		ss.setHbTemplate(ht);
		return ss;
	}
	
	@Bean
	public LeftJoin hTemplatel() {
		LeftJoin ss = new LeftJoin();
		ss.setHbTemplate(ht);
		return ss;
	}
	
	@Bean
	public RightJoin hTemplater() {
		RightJoin ss = new RightJoin();
		ss.setHbTemplate(ht);
		return ss;
	}

	
}
