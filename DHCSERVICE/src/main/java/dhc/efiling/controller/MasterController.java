package dhc.efiling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dhc.efiling.model.ActCode;
import dhc.efiling.model.AllJudges;
import dhc.efiling.model.CaseType;
import dhc.efiling.model.CaseTypeByCtype;
import dhc.efiling.model.Category;
import dhc.efiling.model.CourtList;
import dhc.efiling.model.PoliceStation;
import dhc.efiling.model.Sections;
import dhc.efiling.service.MasterService;

@RestController
public class MasterController {

	@Autowired
	MasterService masterService;

	@GetMapping("/test")
	public String test() {
		return "HIGH COURT OF DELHI - IT CELL";
	}

	@GetMapping("/getCaseCategory")
	public List<Category> getCaseCategory() {
		return masterService.getCaseCategory();
	}

	@GetMapping("/getPoliceCode")
	public List<PoliceStation> getPoliceCode() {
		return masterService.getPoliceCode();
	}

	@GetMapping("/getCourtList")
	public List<CourtList> getCourtList() {
		return masterService.getCourtList();
	}

	@GetMapping("/getCaseType")
	public List<CaseType> getCaseType() {
		return masterService.getCaseType();
	}

	@GetMapping("/getApplication")
	public List<CaseTypeByCtype> getApplication() {
		return masterService.getApplication();
	}

	@GetMapping("/getAllActs")
	public List<ActCode> getAllActs() {
		return masterService.getAllActs();
	}

	@GetMapping("/getAllSections")
	public List<Sections> getAllSections() {
		return masterService.getAllSections();
	}

	@GetMapping("/getAllJudges")
	public List<AllJudges> getAllJudges() {
		return masterService.getAllJudges();
	}

}
