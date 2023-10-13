package com.simplilearn.spring.jdbc.dao;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.simplilearn.spring.jdbc.bean.Employee;

public class Employeedao {
   
	private JdbcTemplate jdbctemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}



	public int saveEmployee(Employee e) {
		String query = "insert into emp1 values('" + e.getId() + "','" + e.getName() + "','" + e.getPassword()
				+ "', '" + e.getEmail() + "','" + e.getCountry() + "')";
		return jdbctemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update emp1 set name='" + e.getName() + "', password='" + e.getPassword() + "', email='"
				+ e.getEmail() + "', country='" + e.getCountry() + "' where id = '" + e.getId() + "'";

		return jdbctemplate.update(query);
	}

	public int deleteEmployee(int id) {
		String query = "delete from emp1 where id = '" + id + "'";
		return jdbctemplate.update(query);
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e) {
		String query = "insert into emp1 values(?,?,?,?,?)";
		return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setString(3, e.getPassword());
				ps.setString(4, e.getEmail());
				ps.setString(5, e.getCountry());

				return ps.execute();
			}
		});
	}

	public List<Employee> getEmplList(){
		return jdbctemplate.query("select * from emp1", new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList = new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setPassword(rs.getString(3));
					e.setEmail(rs.getString(4));
					e.setCountry(rs.getString(5));
					empList.add(e);
				}
				return empList;
			}
		
		});
	} 
	 
	public  void saveEmpWithNamedQuery(Employee e) {
		String query = "insert into emp1 values (:id,:name,:password,:email,:country)";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("password", e.getPassword());
		map.put("email", e.getEmail());
		map.put("country", e.getCountry());
		
		namedParameterJdbcTemplate.execute(query, map, new PreparedStatementCallback() {

			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				return ps.execute();
			}
		});
		
	}
}