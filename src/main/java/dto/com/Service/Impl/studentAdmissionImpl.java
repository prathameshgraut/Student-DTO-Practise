package dto.com.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.com.DTOLAYER.AdmissionDTO;
import dto.com.Entity.Payment;
import dto.com.Entity.Student;
import dto.com.Repository.PaymentRepoo;
import dto.com.Repository.StudentRepoo;
import dto.com.Service.studentAddmissionService;

@Service
public class studentAdmissionImpl implements studentAddmissionService{

	@Autowired
	StudentRepoo stdRepo;
	
	@Autowired
	PaymentRepoo payRepo;

	@Override
	public void Addmission(AdmissionDTO admissionDTO) {
		Student student = new Student();
		student.setName(admissionDTO.getStudentName());
		student.setAddress(admissionDTO.getStudentAddress());
		student.setEmail(admissionDTO.getStudentEmail());
		student.setAge(admissionDTO.getStudentAge());
		student.setCourse(admissionDTO.getStudentCourse());
		stdRepo.save(student);
		
		Payment payment = new Payment();
		payment.setAmount(admissionDTO.getPaymentAmount());
		student.getId();
		payRepo.save(payment);
	}
	
}