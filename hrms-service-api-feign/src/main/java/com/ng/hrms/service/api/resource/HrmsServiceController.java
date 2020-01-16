package com.ng.hrms.service.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ng.hrms.service.api.configuration.FeignProxyService;
import com.ng.hrms.service.api.model.Employee;

@RestController
@RefreshScope
@RequestMapping("/rest")
public class HrmsServiceController {
	
	@Autowired
	FeignProxyService feignPS;
	
	@GetMapping
	public String getInfo() {
		return feignPS.hellow();
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp){
		return feignPS.saveEmployee(emp);
	}
	
	@PostMapping("/addEmployees")
	public ResponseEntity<?> saveAllEmployees(@RequestBody List<Employee> empList){
		return feignPS.saveAllEmployees(empList);		
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp){
		return feignPS.updateEmployee(emp);
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id){
		return feignPS.getEmployeeById(id);
	}
	
	@GetMapping("/getEmployeeByDepartmentName/{depName}")
	public ResponseEntity<?> getEmployeeByDepartmentName(@PathVariable String depName){
		return feignPS.getEmployeeByDepartmentName(depName);
	}

	@GetMapping("/getEmployeeByCity/{city}")
	public ResponseEntity<?> getEmployeeByCity(@PathVariable String city){
		return feignPS.getEmployeeByCity(city);
	}

	@GetMapping("/getAllEmployees")
	public ResponseEntity<?> getAllEmployees(){
		return feignPS.getAllEmployees();
	}		

}
