package com.ex;


import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;


public class SpringSelect {
	NamedParameterJdbcTemplate npjdbcTemplate;

	
	public void setNpjdbcTemplate(NamedParameterJdbcTemplate npjdbcTemplate) {
		this.npjdbcTemplate = npjdbcTemplate;
	}


	public void display() {
		String sql = "select * from student1";
		Map<String, ?> paramMap = null;
		List li = npjdbcTemplate.queryForList(sql, paramMap);
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
