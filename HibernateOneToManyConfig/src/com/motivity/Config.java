package com.motivity;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
	public static Session config() {
		Properties p=new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/motivity");
		p.setProperty("hibernate.connection.user", "root");
		p.setProperty("hibernate.connection.password", "root");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.dialet", "org.hibernate.dialect.MySQLDialect");
		p.setProperty("hibernate.hbm2ddl.auto", "create");
		SessionFactory sf=new Configuration().addResource("customer.xml").addResource("vendor.xml").addProperties(p).buildSessionFactory();
		return sf.openSession();
	}
}
