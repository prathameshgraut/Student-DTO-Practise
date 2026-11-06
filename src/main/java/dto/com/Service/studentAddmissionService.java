package dto.com.Service;

import dto.com.DTOLAYER.AdmissionDTO;
import dto.com.Entity.Payment;
import dto.com.Entity.Student;

public interface studentAddmissionService {
	
	public void Addmission(AdmissionDTO admissionDTO);
	
	public AdmissionDTO getData(int id);

}