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
		payment.setStudent(student);
		payRepo.save(payment);
	}

	@Override
	public AdmissionDTO getData(int id) {
		Student student = stdRepo.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
		Payment payment = payRepo.findByStudentId(id).orElseThrow(()-> new RuntimeException("Payment Not Found"));
		
		AdmissionDTO adDTO =  new AdmissionDTO();
		
		adDTO.setStudentName(student.getName());
		adDTO.setStudentAddress(student.getAddress());
		adDTO.setStudentEmail(student.getEmail());
		adDTO.setStudentAge(student.getAge());
		adDTO.setStudentCourse(student.getCourse());
		adDTO.setStudentId(student.getId());
		
		adDTO.setPaymentAmount(payment.getAmount());
		
		
		
		return adDTO;
	}
	
}