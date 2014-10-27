package com.jaxws.mtom.service;

import java.awt.Image;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface SOAPAttachment {
	
	
	@WebMethod
	public Image doanloadImage(String imageName);

	@WebMethod
	String uploadImage(Image data);

}
