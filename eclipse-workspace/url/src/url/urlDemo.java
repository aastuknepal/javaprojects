package url;

import java.net.URL;
	public class urlDemo{
	public static void main (String args []) {
	try {
	URL url= new URL("https://www.javatpoint.com//java.tutorial");
	System.out.println("Protocol:" + url.getProtocol());
	System.out.println("Host Name:"+ url.getHost());
	System.out.println("File Name:" + url.getFile());
	}
	catch (Exception e) {
		System.out.println (e) ;
	}
	}
	}
	


