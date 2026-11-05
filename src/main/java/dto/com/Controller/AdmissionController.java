package dto.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dto.com.Entity.Payment;
import dto.com.Entity.Student;
import dto.com.Service.studentAddmissionService;

@RestController
public class AdmissionController{
	
	@Autowired
	studentAddmissionService stdaddService;
	
	@PostMapping("/addStd")
	public void studentAddmission(@RequestBody Student student, Payment payment) {
		stdaddService.Addmission(student, payment);
	}
}
