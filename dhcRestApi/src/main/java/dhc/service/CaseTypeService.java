package dhc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dhc.entity.CaseType;
import dhc.repository.CaseTypeRepository;

@Service
public class CaseTypeService {

	@Autowired
	CaseTypeRepository caseTypeRepository;
	
	public List<CaseType> getAllCaseType(){
		return caseTypeRepository.findAll();
	}
}
