package dhc.efiling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dhc.efiling.model.ActCode;
import dhc.efiling.model.AllJudges;
import dhc.efiling.model.CaseType;
import dhc.efiling.model.CaseTypeByCtype;
import dhc.efiling.model.Category;
import dhc.efiling.model.CourtList;
import dhc.efiling.model.PoliceStation;
import dhc.efiling.model.Sections;
import dhc.efiling.repository.MasterRepository;

@Service
public class MasterService {

	@Autowired
	MasterRepository masterRepository;

	public List<Category> getCaseCategory() {
		return masterRepository.getCaseCategory();
	}

	public List<PoliceStation> getPoliceCode() {
		return masterRepository.getPoliceCode();
	}

	public List<CourtList> getCourtList() {
		return masterRepository.getCourtList();
	}

	public List<CaseType> getCaseType() {
		return masterRepository.getCaseType();
	}

	public List<CaseTypeByCtype> getApplication() {
		return masterRepository.getCaseTypeByCtype();
	}

	public List<ActCode> getAllActs() {
		return masterRepository.ActCode();
	}

	public List<Sections> getAllSections() {
		return masterRepository.getAllSections();
	}

	public List<AllJudges> getAllJudges() {
		return masterRepository.getAllJudges();
	}
	
	public List<String> getJudgeName(){
		return masterRepository.getJudgeName();
	}
}
