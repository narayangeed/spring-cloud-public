package com.ng.hrms.service.api.configuration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ng.hrms.service.api.model.Employee;

@FeignClient("hrms-db-api")
public interface FeignProxyService {
	
	@GetMapping("/hrms-db-api")
	public String hellow();
	
	@PostMapping("/hrms-db-api/rest/addEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp);
	
	@PostMapping("/hrms-db-api/rest/addEmployees")
	public ResponseEntity<?> saveAllEmployees(@RequestBody List<Employee> empList);
	
	@PutMapping("/hrms-db-api/rest/updateEmployee")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp);
	
	@GetMapping("/hrms-db-api/rest/getEmployeeById/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id);	
	
	@GetMapping("/hrms-db-api/rest/getEmployeeByDepartmentName/{depName}")
	public ResponseEntity<?> getEmployeeByDepartmentName(@PathVariable String depName);

	@GetMapping("/hrms-db-api/rest/getEmployeeByCity/{city}")
	public ResponseEntity<?> getEmployeeByCity(@PathVariable String city);

	@GetMapping("/hrms-db-api/rest/getAllEmployees")
	public ResponseEntity<?> getAllEmployees();

}
