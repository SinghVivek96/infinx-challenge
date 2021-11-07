package com.infinx.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infinx.model.Bill;
import com.infinx.repo.BillRepo;

@RestController
@RequestMapping("/")
public class BillController {
	
	@Autowired
	private final BillRepo billRepo;
	
	public BillController(BillRepo billRepo) {
		super();
		this.billRepo = billRepo;
	}
	
	@GetMapping("/bills")
	public List<Bill> getBills(){
		return billRepo.findAll();
	}
	
	@GetMapping("/bills/{id}")
	public Optional<Bill> getBill(@PathVariable Long id){
		return billRepo.findById(id);
	}
	
	@GetMapping("/bills/due/{dueDate}")
	public List<Bill> getBill(@PathVariable String dueDate){
		return billRepo.findByDueDate(dueDate);
	}
	
    @PostMapping("/bills")
    Bill newBill(@RequestBody Bill newBill) {
      return billRepo.save(newBill);
    }
	
}
