package com.acordier.patterns;

public class ServiceFactory {
	
	public static Service newService(Class<? extends Service> clazz){
		if(clazz.equals(MessageService.class)){
			return new MessageService(ServiceFactory.class, "Message service", "Use this service to send and receive messages");
		}else if(clazz.equals(EventService.class)){
			return new EventService(ServiceFactory.class, "Event service", "Use this service to fire and catch events");
		}
		throw new ServiceFactoryException("Unknown concrete type ");
	}
}
