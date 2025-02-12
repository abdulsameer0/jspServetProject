package dhc.entity;

public class CaseType {
	
	private String id;
	private String value;

	
	public CaseType(String ctype) {
		this.id=ctype;
		this.value=ctype;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}

	
}
