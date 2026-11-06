package dto.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.com.DTOLAYER.AdmissionDTO;
//import dto.com.Entity.Payment;
//import dto.com.Entity.Student;
import dto.com.Service.studentAddmissionService;

@RestController
public class AdmissionController{
	
	@Autowired
	studentAddmissionService stdaddService;
	
	@PostMapping("addStd")
	public void studentAddmission(@RequestBody AdmissionDTO admissionDTO) {
		stdaddService.Addmission(admissionDTO);
	}
	
	@GetMapping("getData/{id}")
	public AdmissionDTO getData(@PathVariable int id) {
		AdmissionDTO admissionDTO= stdaddService.getData(id);
		return admissionDTO;
	}
}
