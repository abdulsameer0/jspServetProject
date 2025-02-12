package dhc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dhc.entity.CaseType;
import dhc.service.CaseTypeService;

@RestController
@RequestMapping("api/caseType")
public class CaseTypeController {

	
	@Autowired
	CaseTypeService caseTypeService;
	
	@GetMapping
	public List<CaseType> getAllCaseType(){
		return caseTypeService.getAllCaseType();
	}
}
