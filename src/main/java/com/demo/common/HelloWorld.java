package com.demo.common;

public class HelloWorld {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello " + name +"!");
		JsonGenerator json = new JsonGenerator();
		json.generateJson();
		json.readJson();
	}
}