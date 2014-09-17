package com.jaxrs.appl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.jaxrs.JaxRSRestEasyService;

public class ApplicationLoad extends Application{
	
	private Set<Object> sigleTon=new HashSet<Object>();
	
	
	public ApplicationLoad(){
		sigleTon.add(new JaxRSRestEasyService());
	}


	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return sigleTon;
	}
	
	

}
