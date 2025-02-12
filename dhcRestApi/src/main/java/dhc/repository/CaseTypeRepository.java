package dhc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dhc.entity.CaseType;

@Repository
public class CaseTypeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// Get All Employees
	public List<CaseType> findAll() {
		String sql = "SELECT * FROM judl.case_type where main_misc = 'M'";
     return jdbcTemplate.query(sql, new RowMapper<CaseType>() {
    	 
    	 @Override
    	 public CaseType mapRow(ResultSet rs, int rowNum) throws SQLException {
    		 return new CaseType(
    				 rs.getString("ctype"),
    				 rs.getString("main_misc")
    				 );
    				 
    	 }
     });
	}
	
	
	
	
	
	
	
	
	
}
