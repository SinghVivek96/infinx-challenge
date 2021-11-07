package com.infinx.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infinx.model.Bill;
 
@Repository
public interface BillRepo extends JpaRepository<Bill, Long> {
	public List<Bill> findByDueDate(String dueDate);
}
