package MailWebSer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceProvider;

import java.util.*;
@WebService()
public class mailService {
	// 发送邮件服务
	@WebMethod
	public boolean sendEmail(String url, String payload) {
		try {
			MailUtils.sendMail(url, "test", payload);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@WebMethod
	public boolean sendEmailBatch(String[] url, String payload) {
		try{

			for(String s:url)	
			{
				MailUtils.sendMail(s, "test", payload);
			}
			return true;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	@WebMethod
	public  boolean vaildateEmail(String email) {
		// 123456@qq.com
		 if (email == null)
	            return false;
	        String rule = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
	        Pattern pattern;
	        Matcher matcher;
	        pattern = Pattern.compile(rule);
	        matcher = pattern.matcher(email);
	        if (matcher.matches())
	            return true;
	        else
	            return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String url="http://localhost:9097/Service/mailService";
		Endpoint.publish(url,new mailService());
		System.out.print("public Success");
	}
}
