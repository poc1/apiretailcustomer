package com.redhat.developers.msa.ola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


import org.springframework.stereotype.Service;
import com.redhat.developers.model.CustomerContactAddressesDetail;
import com.redhat.developers.model.CustomerContactMediaDetail;
import com.redhat.developers.model.CustomerContactPhoneDetail;
import com.redhat.developers.model.CustomerDataRetail;
import com.redhat.developers.model.CustomerDocumentDetail;
import com.redhat.developers.pojo.BasicData;


@Service
public class RetailCustomerService {

	
	ArrayList<CustomerDataRetail> customerDataRetailList;
	ArrayList<CustomerContactAddressesDetail> customerContactAddressesDetailList;
	ArrayList<CustomerContactPhoneDetail> customerContactPhoneDetailList;
	ArrayList<CustomerContactMediaDetail> customerContactMediaDetailList;
	ArrayList<CustomerDocumentDetail> customerDocumentDetailList;
	

	public RetailCustomerService() {
		super();
		
		// DATOS BASICOS DEL CLIENTE
		this.customerDataRetailList = new ArrayList<CustomerDataRetail>();
		this.customerDataRetailList.add(new CustomerDataRetail("11111", "ADOLFO", "ACEVES", "GONZALEZ", "CASADO", "MASCULINO", "NO", "", "1966-11-15", "SERVICIOS PERSONALES, PARA EL HOGAR", "USUARIOS MENORES DE SERVICIOS", "MEXICO", "MEXICO", "PREMIER", "MEXICO", "", "BANCA SERFIN", "CLIENTE", "NORMAL", "5679", "PERSONAS FISICAS", "SI"));
		
		// DOMICILIO
		customerContactAddressesDetailList = new ArrayList<CustomerContactAddressesDetail>();
		customerContactAddressesDetailList.add(new CustomerContactAddressesDetail("11111", "PRINCIPAL", "001", "OTROS", "NUM 26 120", "CALLE", "320", "4", "UNIVERSIDAD", "ZARAGOZA", "CASA - HABITACION", "COLONIA", "LAS AMERICAS SAN PABLO", "SANTIAGO DE QUERETARO", "QUERETARO", "QUERETARO", "AGUASCALIENTES MUNICIPIO DE", "00076121", "MEXICO", "DESHABITADO", "2015-06-02", "", "CALLE NUM 26 120 NUM 320 NUM INT 4, COLONIA LAS AMERICAS SAN PABLO, CP. 00076121, SANTIAGO DE QUERETARO, QUERETARO, QUERETARO", "2015-06-02", "2017-08-09"));
		
		
		// TELEFONOS
		customerContactPhoneDetailList = new ArrayList<CustomerContactPhoneDetail>();
		customerContactPhoneDetailList.add(new CustomerContactPhoneDetail("11111", "VIVIENDA", "001", "", "FIJO", "ENVIAR CORRESPONDENCIA", "222", "5731959", "2016-12-28", "2017-08-09", "001", "TELEFONO SIN INTENTO DE MARC", "2016-12-28", "", "44444", "66666", "77777", "88888"));
		
		// MEDIA
		customerContactMediaDetailList = new ArrayList<CustomerContactMediaDetail>();
		customerContactMediaDetailList.add(new CustomerContactMediaDetail("11111", "", "Correo Electrónico", "1", "abregocristela@santander.com", "Inexistente", "Alta por Canal"));
	
		// DOCUMENTOS
		customerDocumentDetailList = new ArrayList<CustomerDocumentDetail>();
		customerDocumentDetailList.add(new CustomerDocumentDetail("11111", "CURP", "01", "AEGA661115HMCCND03", "20011-01-01", "2006-12-31", ""));
		customerDocumentDetailList.add(new CustomerDocumentDetail("11111", "CODIGO DE CLIENTE", "01", "00020244", "2001-01-01", "2006-12-31", ""));
		customerDocumentDetailList.add(new CustomerDocumentDetail("11111", "RFC", "01", "QUMU661115AM1", "2001-01-01", "2006-12-31", ""));
	}
	
	
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
