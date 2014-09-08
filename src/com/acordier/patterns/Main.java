package com.acordier.patterns;

public class Main {

	public static void main(String[] args) {
		Service service = ServiceFactory.newService(MessageService.class);
		System.out.println(service.toString());
	}

}
