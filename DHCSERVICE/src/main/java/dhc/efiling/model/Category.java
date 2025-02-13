package dhc.efiling.model;

public class Category {

	private String cat_code;
	private String cat_desc;
	
	public Category(String cat_code, String cat_desc) {
	    this.cat_code = cat_code;
	    this.cat_desc = cat_desc;
	}

	public String getCat_code() {
		return cat_code;
	}

	public void setCat_code(String cat_code) {
		this.cat_code = cat_code;
	}

	public String getCat_desc() {
		return cat_desc;
	}

	public void setCat_desc(String cat_desc) {
		this.cat_desc = cat_desc;
	}
	
}
