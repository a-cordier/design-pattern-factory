package com.acordier.patterns;

public class ServiceFactory {
	
	public static Service newService(Class<? extends Service> clazz, String name, String description){
		if(clazz.equals(MessageService.class)){
			return new MessageService(name, description);
		}else if(clazz.equals(EventService.class)){
			return new EventService(name, description);
		}
		throw new ServiceFactoryException("Unknown concrete type ");
	}
}
