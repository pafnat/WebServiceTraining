package com.javax.mtom.publish;

import javax.xml.ws.Endpoint;

import com.jaxws.mtom.service.SOAPAttachmentImpl;

public class PublishSEIO {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8090/JaxWSMTOM/image", new SOAPAttachmentImpl());
		
		//Endpoint.publish("http://localhost:8080/JaxWSMTOM/image", new SOAPAttachmentImpl());
		
		System.out.println("Service Published Successfully...");
		
		
	}

}
