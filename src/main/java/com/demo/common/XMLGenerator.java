package com.demo.common;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.demo.common.pojo.Address;

public class XMLGenerator {

	private void populateAddress(Address address) {

		address.setId(23);
		address.setStreetAddress("32451 Dublin Stt.");
		address.setCity("Woodland Hills");
		address.setState("CA");
		address.setZip("91411");
		address.setCountry("USA");
	}

	public void marshall() {
		Address address = new Address();
		populateAddress(address);

		try {
			File file = new File("/Users/ymishra/Personal/Intuit/projects/Spring/src/main/resources/address.xml");

			JAXBContext jaxbcontext = JAXBContext.newInstance(Address.class);

			Marshaller marshaller = jaxbcontext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(address, file);
			
			marshaller.marshal(address, System.out);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void unmarshall() {

		File file = new File("/Users/ymishra/Personal/Intuit/projects/Spring/src/main/resources/address.xml");

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Address.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Address address = (Address) jaxbUnmarshaller.unmarshal(file);
			System.out.println("Unmarshalling address from xml:"+address.getCity());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
