package com.potatosaucevfx;

public class HelloWorld {
	
	private String message1;
	private double id;
	
	public void init() {
		System.out.println("Obj " + id + " init.");
		
	}
	
	public void destroy() {
		System.out.println("Obj " + id + " destroy.");
		
	}
	
	public String getMessage1() {
		return message1;
	}

	public void setMessage(String message1) {
		this.message1 = message1;
	}
	
	public void printMessage1() {
		System.out.println(message1);
	}

	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void printId() {
		System.out.println(id);
	}

	
	
	
}
