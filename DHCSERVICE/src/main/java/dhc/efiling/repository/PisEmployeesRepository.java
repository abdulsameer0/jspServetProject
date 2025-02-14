package dhc.efiling.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dhc.efiling.model.PisEmployees;

@Repository
public class PisEmployeesRepository {
    
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    // RowMapper to map each row to a PisEmployees object
	    private static final RowMapper<PisEmployees> ROW_MAPPER = new RowMapper<PisEmployees>() {
	        @Override
	        public PisEmployees mapRow(ResultSet rs, int rowNum) throws SQLException {
	            return new PisEmployees(rs.getString("emp_code"), rs.getString("pass"));
	        }
	    };

	    // Retrieve an employee by employee code
	    public PisEmployees findByEmpCode(String empCode) {
	        String sql = "SELECT emp_code, pass FROM access.pis_employees WHERE emp_code = ?";
	        return jdbcTemplate.queryForObject(sql, ROW_MAPPER, empCode);
	    }
	
}
