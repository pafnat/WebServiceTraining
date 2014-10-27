package com.javax.mtom.client;

import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import com.jaxws.mtom.service.SOAPAttachment;

public class SOAPAttachmentClient {

	public static void main(String[] args) throws Exception {

		URL serviceURL = new URL("http://localhost:8090/JaxWSMTOM/image?wsdl");
		QName nsqname = new QName("http://service.mtom.jaxws.com/","SOAPAttachmentImplService");
		Service service = Service.create(serviceURL, nsqname);
		SOAPAttachment soapAttachment = service.getPort(SOAPAttachment.class);

		
		Image image=soapAttachment.doanloadImage("test.png");
		JFrame frame=new JFrame();
		frame.setSize(200, 300);
		JLabel label=new JLabel(new ImageIcon(image));
		
		frame.add(label);
		frame.setVisible(true);
		
		System.out.println("Image Downloaded successfully....");
		
	}

	public static void uploadImage() throws Exception {

		URL serviceURL = new URL("http://localhost:8090/JaxWSMTOM/image?wsdl");

		QName nsqname = new QName("http://service.mtom.jaxws.com/",
				"SOAPAttachmentImplService");

		Service service = Service.create(serviceURL, nsqname);

		SOAPAttachment soapAttachment = service.getPort(SOAPAttachment.class);

		Image imgToUpload = ImageIO
				.read(new File(
						"D:\\Training Repository\\Java Web Service Sept 2014 Batch\\Daily Notes\\Day-17\\Java Script Important Library.png"));

		BindingProvider bp = (BindingProvider) soapAttachment;

		SOAPBinding binding = (SOAPBinding) bp.getBinding();

		binding.setMTOMEnabled(true);

		String status = soapAttachment.uploadImage(imgToUpload);

		System.out.println("Images Upload Status => " + status);
	}
	
	
	public static void downloadImage() throws Exception{
		
		URL serviceURL = new URL("http://localhost:8090/JaxWSMTOM/image?wsdl");

		QName nsqname = new QName("http://service.mtom.jaxws.com/",
				"SOAPAttachmentImplService");

		Service service = Service.create(serviceURL, nsqname);

		SOAPAttachment soapAttachment = service.getPort(SOAPAttachment.class);

		
		Image image=soapAttachment.doanloadImage("test");
		
		JFrame frame=new JFrame();
		frame.setSize(200, 300);
		
		JLabel label=new JLabel(new ImageIcon(image));
		
		frame.add(label);
		frame.setVisible(true);
		
		System.out.println("Image Downloaded successfully....");
		
		
	}

}
