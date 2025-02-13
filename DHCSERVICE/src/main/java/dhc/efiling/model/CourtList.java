package dhc.efiling.model;

public class CourtList {

	private String court_auth_code;
	private String court_name;

	public CourtList(String court_auth_code, String court_name) {
		this.court_auth_code = court_auth_code;
		this.court_name = court_name;
	}

	public String getCourt_auth_code() {
		return court_auth_code;
	}

	public void setCourt_auth_code(String court_auth_code) {
		this.court_auth_code = court_auth_code;
	}

	public String getCourt_name() {
		return court_name;
	}

	public void setCourt_name(String court_name) {
		this.court_name = court_name;
	}
	
	

}
