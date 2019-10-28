package MailWebSer;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class PublishServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:9090/Service/mailService";
		Endpoint.publish(url,new mailService());
		System.out.print("public Success");
	}
}
/*
¡¡wsimport -s D:\DataBase\AWSTestEclipse\WebServiceProject\src -p mailClient -keep http://localhost:9090/Service/mailService?wsdl

*/