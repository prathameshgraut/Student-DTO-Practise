package dto.com.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void Addmission(Student student, Payment payment) {
		stdRepo.save(student);
		payRepo.save(payment);
	}
}