package com.jaxws.mtom.service;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

@MTOM
@WebService(endpointInterface="com.jaxws.mtom.service.SOAPAttachment")
public class SOAPAttachmentImpl implements SOAPAttachment{

	@Override
	public Image doanloadImage(String imageName) {
		
		try{
			
			File image=new File("D:\\Training Repository\\Java Web Service Sept 2014 Batch\\Daily Notes\\Day-4\\"+imageName);
			return ImageIO.read(image);
			
		}catch(IOException ex){
			System.out.println("Error Occured=>"+ex.getMessage());
			ex.printStackTrace();
			return null;
		}
		
		//
		// TODO Auto-generated method stub
		
	}

	@Override
	public String uploadImage(Image data) {
		
			if(data!=null){
				
				System.out.println("Upload is Successfull..in server.."+data.toString());
				return "File Uploaded Successfully..";
			}
			
			throw new WebServiceException("Upload Failed..");
			
		// TODO Auto-generated method stub
	}
	
}
