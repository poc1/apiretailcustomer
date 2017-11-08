package com.redhat.developers.msa.ola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;
import com.redhat.developers.pojo.BasicData;


@Service
public class RetailCustomerService {

	
	public RetailCustomerService() {}
	
	
	/**
	 * Obtener información básica del cliente
	 * @param customerId
	 * @return
	 */
	public String getBasicData(BasicData basicData)
	{
		//String urlString = "http://localhost:8082/retail/" + basicData.getCustomerid();
	      String urlString = "http://apibank3-poc1.193b.starter-ca-central-1.openshiftapps.com:80/retail/" + basicData.getCustomerid();		  
        //String urlString = "https://webapigateway.dev.mx.corp/santander-mexico/intranet-client-dev/retail_customers/" + basicData.getCustomerid();
		
 		
		StringBuffer response = new StringBuffer();
		
		try {
				  
		  URL url = new URL(urlString);
		  HttpURLConnection con = (HttpURLConnection) url.openConnection();
		 
		  // By default it is GET request
		  con.setRequestMethod("GET");
		 
		  //add request header
		  con.setRequestProperty("Accept", "application/json");
		  con.setRequestProperty("Accept-Language", "es-ES");
		  con.setRequestProperty("Content-Type", "application/json");
		  con.setRequestProperty("x-ibm-client-id", basicData.getX_ibm_client_id());
		  con.setRequestProperty("Authorization", basicData.getAuthorization());
		  con.setRequestProperty("x-santander-global-id", basicData.getX_santander_global_id());
		 
		  //int responseCode = con.getResponseCode();
			 
		  // Reading response from input Stream
		  BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		  String output;
		  		 
		  while ((output = in.readLine()) != null) {
		   response.append(output);
		  }
		  in.close();
		  
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	  return response.toString();		
	}
	
	
	/**
	 * Direcciones del cliente
	 * @param basicData
	 * @return
	 */
	public String getCustomerContactAddress(BasicData basicData)
	{
		  //String urlString = "http://localhost:8082/retail/" + basicData.getCustomerid() +"/addresses";
		    String urlString = "http://apibank3-poc1.193b.starter-ca-central-1.openshiftapps.com:80/retail/" + basicData.getCustomerid() +"/addresses";
	      //String urlString = "https://webapigateway.dev.mx.corp/santander-mexico/intranet-client-dev/retail_customers/" + basicData.getCustomerid() +"/addresses";
						
			StringBuffer response = new StringBuffer();
			
			try {
					  
			  URL url = new URL(urlString);
			  HttpURLConnection con = (HttpURLConnection) url.openConnection();
			 
			  // By default it is GET request
			  con.setRequestMethod("GET");
			 
			  //add request header
			  con.setRequestProperty("Accept", "application/json");
			  con.setRequestProperty("Accept-Language", "es-ES");
			  con.setRequestProperty("Content-Type", "application/json");
			  con.setRequestProperty("x-ibm-client-id", basicData.getX_ibm_client_id());
			  con.setRequestProperty("Authorization", basicData.getAuthorization());
			  con.setRequestProperty("x-santander-global-id", basicData.getX_santander_global_id());
			 
			  //int responseCode = con.getResponseCode();
				 
			  // Reading response from input Stream
			  BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			  String output;
			  		 
			  while ((output = in.readLine()) != null) {
			   response.append(output);
			  }
			  in.close();
			  
			}catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			
		  return response.toString();	
	}
	
	
	/**
	 * Telefonos del cliente
	 * @param customerId
	 * @return
	 */
	public String getCustomerContactPhone(BasicData basicData)
	{
		//String urlString = "http://localhost:8082/retail/" + basicData.getCustomerid() +"/phone_numbers";
	      String urlString = "http://apibank3-poc1.193b.starter-ca-central-1.openshiftapps.com:80/retail/" + basicData.getCustomerid() +"/phone_numbers";
        //String urlString = "https://webapigateway.dev.mx.corp/santander-mexico/intranet-client-dev/retail_customers/" + basicData.getCustomerid() +"/phone_numbers";
					
		StringBuffer response = new StringBuffer();
		
		try {
				  
		  URL url = new URL(urlString);
		  HttpURLConnection con = (HttpURLConnection) url.openConnection();
		 
		  // By default it is GET request
		  con.setRequestMethod("GET");
		 
		  //add request header
		  con.setRequestProperty("Accept", "application/json");
		  con.setRequestProperty("Accept-Language", "es-ES");
		  con.setRequestProperty("Content-Type", "application/json");
		  con.setRequestProperty("x-ibm-client-id", basicData.getX_ibm_client_id());
		  con.setRequestProperty("Authorization", basicData.getAuthorization());
		  con.setRequestProperty("x-santander-global-id", basicData.getX_santander_global_id());
		 
		  //int responseCode = con.getResponseCode();
			 
		  // Reading response from input Stream
		  BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		  String output;
		  		 
		  while ((output = in.readLine()) != null) {
		   response.append(output);
		  }
		  in.close();
		  
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	  return response.toString();
	  
	}
	
	
	/**
	 * Medios Electrónicos del Cliente
	 * @param customerId
	 * @return
	 */
	public String getCustomerContactMedia(BasicData basicData)
	{
		//String urlString = "http://localhost:8082/retail/" + basicData.getCustomerid() +"/media_addresses";
	      String urlString = "http://apibank3-poc1.193b.starter-ca-central-1.openshiftapps.com:80/retail/" + basicData.getCustomerid() +"/media_addresses";
        //String urlString = "https://webapigateway.dev.mx.corp/santander-mexico/intranet-client-dev/retail_customers/" + basicData.getCustomerid() +"/media_addresses";
		                      
		StringBuffer response = new StringBuffer();
		
		try {
				  
		  URL url = new URL(urlString);
		  HttpURLConnection con = (HttpURLConnection) url.openConnection();
		 
		  // By default it is GET request
		  con.setRequestMethod("GET");
		 
		  //add request header
		  con.setRequestProperty("Accept", "application/json");
		  con.setRequestProperty("Accept-Language", "es-ES");
		  con.setRequestProperty("Content-Type", "application/json");
		  con.setRequestProperty("x-ibm-client-id", basicData.getX_ibm_client_id());
		  con.setRequestProperty("Authorization", basicData.getAuthorization());
		  con.setRequestProperty("x-santander-global-id", basicData.getX_santander_global_id());
		 
		  //int responseCode = con.getResponseCode();
			 
		  // Reading response from input Stream
		  BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		  String output;
		  		 
		  while ((output = in.readLine()) != null) {
		   response.append(output);
		  }
		  in.close();
		  
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	  return response.toString();	
	}
	

	
	
	
}
