package dto.com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.com.Entity.Payment;

@Repository
public interface PaymentRepoo extends JpaRepository<Payment, Integer> {
	
	 Optional<Payment> findByStudentId(int id);
}
