package dhc.efiling.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dhc.efiling.model.ActCode;
import dhc.efiling.model.AllJudges;
import dhc.efiling.model.CaseType;
import dhc.efiling.model.CaseTypeByCtype;
import dhc.efiling.model.Category;
import dhc.efiling.model.CourtList;
import dhc.efiling.model.PoliceStation;
import dhc.efiling.model.Sections;

@Repository
public class MasterRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// get case type category by method
	private final RowMapper<Category> categoryRowMapper = (rs, rowNum) -> new Category(rs.getString("cat_code"),
			rs.getString("cat_desc"));

	public List<Category> getCaseCategory() {
		String sql = "SELECT CAT_CODE,CAT_DESC from judl.category order by CAT_CODE";
		return jdbcTemplate.query(sql, categoryRowMapper);
	}

	// get police station and police station name by method
	private final RowMapper<PoliceStation> policeStationRowMapper = (rs,
			rowNum) -> new PoliceStation(rs.getString("police_station_code"), rs.getString("police_station_name"));

	public List<PoliceStation> getPoliceCode() {
		String sql = "SELECT POLICE_STATION_CODE,POLICE_STATION_NAME from judl.police_station_dir order by POLICE_STATION_NAME";
		return jdbcTemplate.query(sql, policeStationRowMapper);
	}

	// get court list by method
	private final RowMapper<CourtList> courtListRowMapper = (rs,
			rowNum) -> new CourtList(rs.getString("court_auth_code"), rs.getString("court_name"));

	public List<CourtList> getCourtList() {
		String sql = "SELECT COURT_AUTH_CODE, COURT_NAME FROM judl.COURT_AUTHORITY order by court_name";
		return jdbcTemplate.query(sql, courtListRowMapper);
	}

	// get case type by method
	public final RowMapper<CaseType> caseTypeRowMapper = (rs, rowNum) -> new CaseType(rs.getString("ctype"),
			rs.getString("case_desc"), rs.getString("entry_ctype"), rs.getString("side"));

	public List<CaseType> getCaseType() {
		String sql = "SELECT CTYPE,CASE_DESC,ENTRY_CTYPE,SIDE from judl.case_type WHERE MAIN_MISC='M' order by ctype";
		return jdbcTemplate.query(sql, caseTypeRowMapper);
	}

	// get case type by c type
	public final RowMapper<CaseTypeByCtype> caseTypeRowMapperByCtype = (rs,
			rowNum) -> new CaseTypeByCtype(rs.getString("ctype"));

	public List<CaseTypeByCtype> getCaseTypeByCtype() {
		String sql = "SELECT CTYPE FROM judl.CASE_TYPE WHERE MAIN_MISC='A'  order by ctype";
		return jdbcTemplate.query(sql, caseTypeRowMapperByCtype);
	}

	// get ACT_DIR by method
	public final RowMapper<ActCode> actCodeRowMapper = (rs, rowNum) -> new ActCode(rs.getString("act_code"),
			rs.getString("act"));

	public List<ActCode> ActCode() {
		String sql = "select * from judl.ACT_DIR  order by ACT";
		return jdbcTemplate.query(sql, actCodeRowMapper);
	}

	// get all sections
	public final RowMapper<Sections> sectionsRowMapper = (rs, rowNum) -> new Sections(rs.getString("name"),
			rs.getString("section_type"));

	public List<Sections> getAllSections() {
		String sql = "select NAME,SECTION_TYPE from judl.ACT_SECTION_TYPE order by SECTION_TYPE";
		return jdbcTemplate.query(sql, sectionsRowMapper);
	}

	// getAllJudges by method
	public final RowMapper<AllJudges> allJudgesRowMapper = (rs, rowNum) -> new AllJudges(rs.getString("judge_code"),
			rs.getString("judge_prefix"), rs.getString("judge_name"));

	public List<AllJudges> getAllJudges() {
		String sql = "select judge_code, judge_prefix, judge_name from judl.judge where judge_code is not null and judge_code>0";
		return jdbcTemplate.query(sql, allJudgesRowMapper);
	}

	// RowMapper to map each row to a String with "HMJ " + judge_name
	public final RowMapper<String> judgeNameRowMapper = (rs, rowNum) ->"HMJ " +(rs.getString("judge_name"));

    // Function to get judge names with specified conditions
	public List<String> getJudgeName() {
		String sql = "SELECT judge_prefix, judge_name " + "FROM judl.judge " + "WHERE judge_code IS NOT NULL "
				+ "  AND judge_code > 0 " + "  AND judge_prefix LIKE '%JUSTICE%' " + "  AND sitting_retired = 'S' "
				+ "ORDER BY sitting_retired DESC, seniority";
		return jdbcTemplate.query(sql, judgeNameRowMapper);
	}

}
