package dhc.efiling.model;

public class Sections {
	private String name;
	private String section_type;

	public Sections(String name, String section_type) {
		this.name = name;
		this.section_type = section_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection_type() {
		return section_type;
	}

	public void setSection_type(String section_type) {
		this.section_type = section_type;
	}

}
