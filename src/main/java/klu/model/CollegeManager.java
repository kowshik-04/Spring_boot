package klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CollegeManager {
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CollegeManager(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String saveData(College C) 
	{
		try {
			String qry = "insert into college values('"+ C.getName()+"','"+C.getAcronym() +"')";
			jdbcTemplate.update(qry);
			return "New college data has been added";
			
		}catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	public String updateData(College C) {
		try {
			String qry = "Update Token"+C.getName()+"'where acronym ='"+C.getAcronym();
			jdbcTemplate.update(qry);
			return "updated";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String deleteData(String acronym) {
		try {
			String qry = "delete from college where acronym = '"+acronym +"'";
			jdbcTemplate.update(qry);
			return "Deleted";
			
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
}
