package com.demo.common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.common.pojo.Address;
import com.demo.common.pojo.BusinessInfo;
import com.demo.common.pojo.BusinessOwner;
import com.demo.common.pojo.PaymentAccount;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGenerator {

	public void generateJson() {
		ObjectMapper mapper = new ObjectMapper();
		PaymentAccount payAccount = new PaymentAccount();

		createPayAccountObjectFlavourOne(payAccount);

		try {
			mapper.writeValue(
					new File("/Users/ymishra/Personal/Intuit/projects/Spring/src/main/resources/payAccount.json"),
					payAccount);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createPayAccountObjectFlavourOne(PaymentAccount payAccount) {
		payAccount.setAccountNumber("5247710000396531");
		payAccount.setStatus("ACTIVE");
		payAccount.setEmail("imsglobal@yahoo.com");
		payAccount.setPhone("989-345-6754");
		payAccount.setWebsite("http://imsglobal.com");

		BusinessInfo businessInfo = new BusinessInfo();
		businessInfo.setBusinessName("imsglobal");
		businessInfo.setLegalName("IMS GLOBAL INC.");

		Address address = new Address();
		address.setStreetAddress("3245 Hubbard Street");
		address.setCity("Sherman Oaks");
		address.setState("CA");
		address.setZip("91411");
		address.setCountry("USA");
		businessInfo.setAddress(address);

		payAccount.setBusinessInfo(businessInfo);

		List<BusinessOwner> businessOwnerList = new ArrayList<>();
		BusinessOwner firstOwner = new BusinessOwner();
		firstOwner.setFirstName("John");
		firstOwner.setLastName("Doe");
		firstOwner.setEmail("john.does@gmail.com");
		firstOwner.setPhone("345-567-4644");
		firstOwner.setAddress(address);

		BusinessOwner secondOwner = new BusinessOwner();
		secondOwner.setFirstName("Smith");
		secondOwner.setLastName("Doe");
		secondOwner.setEmail("smith.does@gmail.com");
		secondOwner.setPhone("346-567-4644");
		secondOwner.setAddress(address);

		businessOwnerList.add(firstOwner);
		businessOwnerList.add(secondOwner);

		payAccount.setBusinessOwnerList(businessOwnerList);

	}

	public void readJson() {

		ObjectMapper mapper = new ObjectMapper();
		try {
			PaymentAccount payAccount = mapper.readValue(
					new File("/Users/ymishra/Personal/Intuit/projects/Spring/src/main/resources/payAccount.json"),
					PaymentAccount.class);
			
			System.out.println(payAccount.getAccountNumber());
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
