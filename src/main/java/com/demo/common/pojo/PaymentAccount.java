package com.demo.common.pojo;

import java.util.List;

public class PaymentAccount {

	private String accountNumber;
	private String status;
	private String phone;
	private String email;
	private String website;
	private BusinessInfo businessInfo;
	private List<BusinessOwner> businessOwnerList;
	private List<BankAccount> bankAccountsList;
	private PaymentMethod paymentMethod;
	private RiskProfile riskProfile;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public BusinessInfo getBusinessInfo() {
		return businessInfo;
	}
	public void setBusinessInfo(BusinessInfo businessInfo) {
		this.businessInfo = businessInfo;
	}
	public List<BusinessOwner> getBusinessOwnerList() {
		return businessOwnerList;
	}
	public void setBusinessOwnerList(List<BusinessOwner> businessOwnerList) {
		this.businessOwnerList = businessOwnerList;
	}
	public List<BankAccount> getBankAccountsList() {
		return bankAccountsList;
	}
	public void setBankAccountsList(List<BankAccount> bankAccountsList) {
		this.bankAccountsList = bankAccountsList;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public RiskProfile getRiskProfile() {
		return riskProfile;
	}
	public void setRiskProfile(RiskProfile riskProfile) {
		this.riskProfile = riskProfile;
	}
	
	
	
}
