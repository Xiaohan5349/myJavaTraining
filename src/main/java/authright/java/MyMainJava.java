package authright.java;




import java.util.*;
import java.io.IOException;

import authright.java.util.*;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import authright.java.util.MyPerson;
import authright.java.learning.*;




//import static authright.java.util.MyPerson.print1;

public class MyMainJava 
{

	
	public static void main(String[] args) throws IOException {

			
		MyInnerPerson testInnerPerson = new MyInnerPerson();
		MyPerson.print1();
		MyPerson testPerson = new MyPerson();
		testPerson.print1();

		IOTest testIO = new IOTest();
		List<String> apps = new ArrayList<>();
		apps.add("https://idcs-c08118fe0ad64c5eb9b34ef8fd6512be.identity.oraclecloud.com:443/fed");
		apps.add("https://bedbath-stores.domo.com");
		apps.add("https://dashboard.gcp.bedbath.com/v1/ddh-microservice/saml/metadata");
		apps.add("https://bedbath.domo.com");
		apps.add("https://www.perceptyx.com/bbbps221/index.cgi/saml-login/?o=B");
		apps.add("https://go.deem.com");
		apps.add("https://federatedid-na1.services.adobe.com/federated/saml/metadata/alias/0c3c905f-8633-4c46-ab0c-bbb8d4700bb0");
		testIO.deleteSpecificLines(apps);


		//testPerson.print2();
		//print1();
		//testInnerPerson.printInner1();
		//testInnerPerson.printInner2();
		//testInnerPerson.printInner3();
		testInnerPerson.useInner3();

		CollectionTest test = new CollectionTest();
		//test.testQueue();


//        	try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
//
//			HttpGet httpGet = new HttpGet("http://httpbin.org/get");
//            		try (CloseableHttpResponse response1 = httpclient.execute(httpGet)){
//                		System.out.println("response code: "+ response1.getCode());
//                		System.out.println("response reason: "+ response1.getReasonPhrase());
//                		HttpEntity entity1 = response1.getEntity();
//                		EntityUtils.consume(entity1);
//            		}
//
//
//            		HttpPost httpPost = new HttpPost("http://httpbin.org/post");
//            		List<NameValuePair> nvps = new ArrayList<>();
//            		nvps.add(new BasicNameValuePair("username", "vip"));
//            		nvps.add(new BasicNameValuePair("password", "secret"));
//            		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
//
//
//            		try (CloseableHttpResponse response2 = httpclient.execute(httpPost)){
//                		System.out.println("response code: "+ response2.getCode());
//                		System.out.println("response reason: "+ response2.getReasonPhrase());
//               			HttpEntity entity2 = response2.getEntity();
//                		EntityUtils.consume(entity2);
//            		}
//
//        	} catch (IOException e) {
//            		e.printStackTrace();
//        	}

	}
}
