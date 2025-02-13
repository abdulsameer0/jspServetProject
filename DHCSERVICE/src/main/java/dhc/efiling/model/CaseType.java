package dhc.efiling.model;

public class CaseType {
	private String ctype;
	private String case_desc;
	private String entry_ctype;
	private String side;

	public CaseType(String ctype, String case_desc, String entry_ctype, String side) {
		this.ctype = ctype;
		this.case_desc = case_desc;
		this.entry_ctype = entry_ctype;
		this.side = side;
	}
	public CaseType(String ctype) {
		this.ctype = ctype;
		
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCase_desc() {
		return case_desc;
	}

	public void setCase_desc(String case_desc) {
		this.case_desc = case_desc;
	}

	public String getEntry_ctype() {
		return entry_ctype;
	}

	public void setEntry_ctype(String entry_ctype) {
		this.entry_ctype = entry_ctype;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

}
