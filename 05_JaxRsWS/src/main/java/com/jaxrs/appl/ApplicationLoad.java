package com.jaxrs.appl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.jaxrs.JaxRSRestEasyService;
import com.jaxrs.ws.TestRsService;


public class ApplicationLoad extends Application{

    // provides number of classes which we are provided...

	private Set<Object> sigleTon=new HashSet<Object>();
	
	
	public ApplicationLoad(){
		sigleTon.add(new JaxRSRestEasyService());
        sigleTon.add(new TestRsService());
	}


	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return sigleTon;
	}
	
	

}
