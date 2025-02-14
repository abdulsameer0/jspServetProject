package dhc.efiling.model;

public class PisEmployees {

	private String emp_code;
	private String pass;

	public PisEmployees(String emp_code, String pass) {
		this.emp_code = emp_code;
		this.pass = pass;
	}

	public PisEmployees() {
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
