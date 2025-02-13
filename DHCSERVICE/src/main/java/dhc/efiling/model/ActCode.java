package dhc.efiling.model;

public class ActCode {
	public String act_code;
	public String act;

	public ActCode(String act_code, String act) {
		this.act_code = act_code;
		this.act = act;
	}

	public String getAct_code() {
		return act_code;
	}

	public void setAct_code(String act_code) {
		this.act_code = act_code;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

}
