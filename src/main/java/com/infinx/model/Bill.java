package com.infinx.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Bill.findByDueDate", query = "SELECT p FROM Bill p WHERE LOWER(p.billedDueDate) = LOWER(?1)")
public class Bill {
	@Id
    Long   billNumber;
	String billedTo;
	String billedDate;
	public String getBilledDueDate() {
		return billedDueDate;
	}
	public void setBilledDueDate(String billedDueDate) {
		this.billedDueDate = billedDueDate;
	}
	String billedDueDate;
	double billedPrice;
	double billedTax;
	double billedTotal;
	public Long getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}
	public String getBilledTo() {
		return billedTo;
	}
	public void setBilledTo(String billedTo) {
		this.billedTo = billedTo;
	}
	public String getBilledDate() {
		return billedDate;
	}
	public void setBilledDate(String billedDate) {
		this.billedDate = billedDate;
	}
	public double getBilledPrice() {
		return billedPrice;
	}
	public void setBilledPrice(double billedPrice) {
		this.billedPrice = billedPrice;
	}
	public double getBilledTax() {
		return billedTax;
	}
	public void setBilledTax(double billedTax) {
		this.billedTax = billedTax;
	}
	public double getBilledTotal() {
		return billedTotal;
	}
	public void setBilledTotal(double billedTotal) {
		this.billedTotal = billedTotal;
	}
	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", billedTo=" + billedTo + ", billedDate=" + billedDate
				+ ", billedDueDate=" + billedDueDate + ", billedPrice=" + billedPrice + ", billedTax=" + billedTax
				+ ", billedTotal=" + billedTotal + "]";
	}

	public Bill(Long billNumber, String billedTo, String billedDate, String billedDueDate, double billedPrice,
			double billedTax, double billedTotal) {
		super();
		this.billNumber = billNumber;
		this.billedTo = billedTo;
		this.billedDate = billedDate;
		this.billedDueDate = billedDueDate;
		this.billedPrice = billedPrice;
		this.billedTax = billedTax;
		this.billedTotal = billedTotal;
	}
	public Bill() {
		super();
	}
	
	
}
