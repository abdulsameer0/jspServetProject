package dhc.efiling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dhc.efiling.model.PisEmployees;
import dhc.efiling.repository.PisEmployeesRepository;

@Service
public class LoginService {

	 @Autowired
	    private PisEmployeesRepository employeesRepository;

	 public String authenticate(String empCode, String password) {
	        try {
	            PisEmployees employee = null;
	            try {
	                employee = employeesRepository.findByEmpCode(empCode);
	            } catch (Exception e) {
	                // If no record is found, employee will remain null.
	            }
	            if (employee == null) {
	                return "Incorrect employee code";
	            } else if (!employee.getPass().equals(password)) {
	                return "Incorrect password";
	            } else {
	                return "success";
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "Internal error";
	        }
	    }

}
