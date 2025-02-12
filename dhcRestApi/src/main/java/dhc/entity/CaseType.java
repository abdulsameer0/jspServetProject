package dhc.entity;

public class CaseType {
	
	private String ctype;
	private String main_misc;

	public CaseType() {
	}

	public CaseType(String ctype, String main_misc) {
		this.ctype = ctype;
		this.main_misc = main_misc;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getMain_misc() {
		return main_misc;
	}

	public void setMain_misc(String main_misc) {
		this.main_misc = main_misc;
	}

}
