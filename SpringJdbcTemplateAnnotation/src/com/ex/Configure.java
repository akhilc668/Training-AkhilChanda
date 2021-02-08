package com.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Configure {

	DriverManagerDataSource dmds;

	JdbcTemplate jt;

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
	public JdbcTemplate getTemplate() {
		jt = new JdbcTemplate(dmds);
		return jt;
	}

	@Bean
	public SpringSelect jTemplates() {
		SpringSelect ss = new SpringSelect();
		ss.setJdbcTemplate(jt);
		return ss;
	}

	@Bean
	public SpringInsert jTemplatei() {
		SpringInsert si = new SpringInsert();
		si.setJdbcTemplate(jt);
		return si;
	}

	@Bean
	public SpringUpdate jTemplateu() {
		SpringUpdate su = new SpringUpdate();
		su.setJdbcTemplate(jt);
		return su;
	}

	@Bean
	public SpringDelete jTemplated() {
		SpringDelete sd = new SpringDelete();
		sd.setJdbcTemplate(jt);
		return sd;
	}
}
