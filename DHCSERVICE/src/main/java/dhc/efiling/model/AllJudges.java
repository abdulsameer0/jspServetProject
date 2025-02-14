package dhc.efiling.model;

public class AllJudges {
	private String judge_code;
	private String judge_prefix;
	private String judge_name;

	public AllJudges(String judge_code, String judge_prefix, String judge_name) {
		this.judge_code = judge_code;
		this.judge_prefix = judge_prefix;
		this.judge_name = judge_name;
	}

	public AllJudges(String judge_prefix, String judge_name) {
		this.judge_prefix = judge_prefix;
		this.judge_name = judge_name;
	}

	public String getJudge_code() {
		return judge_code;
	}

	public void setJudge_code(String judge_code) {
		this.judge_code = judge_code;
	}

	public String getJudge_prefix() {
		return judge_prefix;
	}

	public void setJudge_prefix(String judge_prefix) {
		this.judge_prefix = judge_prefix;
	}

	public String getJudge_name() {
		return judge_name;
	}

	public void setJudge_name(String judge_name) {
		this.judge_name = judge_name;
	}

}
