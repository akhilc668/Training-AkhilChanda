package com.ex;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringSelect {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void display() {
		String sql = "select * from student1";
		List li = jdbcTemplate.queryForList(sql);
		Iterator i = li.iterator();
		System.out.println("|sid|sname|marks|section|");
		while (i.hasNext()) {
			Map<String, Object> o = (Map) i.next();
			Object[] s = o.values().toArray();
			System.out.println("-------------------------");
			for (Object value : s) {
				System.out.print("|"+value );
			}
			System.out.println("|");
		}
	}
}
