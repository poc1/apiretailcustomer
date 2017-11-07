package com.redhat.developers.msa.ola;

import java.util.ArrayList;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.redhat.developers.model.CustomerContactAddressesDetail;
import com.redhat.developers.model.CustomerContactMediaDetail;
import com.redhat.developers.model.CustomerContactPhoneDetail;
import com.redhat.developers.model.CustomerDataRetail;
import com.redhat.developers.model.CustomerDocumentDetail;


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
	
	
	// get Customer Basic Data
	public CustomerDataRetail getCustomerDataById(String customerId)
	{
		ListIterator<CustomerDataRetail> iterator =  customerDataRetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerDataRetail data = iterator.next();
			if(data.getCustomerId().equals(customerId))
				return data;
		}
		return new CustomerDataRetail();		
	}
	
	
	// get Customer Contact Address
	public Iterable<CustomerContactAddressesDetail> getCustomerContactAddress(String customerId)
	{
		ArrayList<CustomerContactAddressesDetail> it = new ArrayList<CustomerContactAddressesDetail>();
		ListIterator<CustomerContactAddressesDetail> iterator =  customerContactAddressesDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactAddressesDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	
	// get Customer Contact Phone
	public Iterable<CustomerContactPhoneDetail> getCustomerContactPhone(String customerId)
	{
		ArrayList<CustomerContactPhoneDetail> it = new ArrayList<CustomerContactPhoneDetail>();
		ListIterator<CustomerContactPhoneDetail> iterator =  customerContactPhoneDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactPhoneDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	
	// get Customer Contact Media
	public Iterable<CustomerContactMediaDetail> getCustomerContactMedia(String customerId)
	{
		ArrayList<CustomerContactMediaDetail> it = new ArrayList<CustomerContactMediaDetail>();
		ListIterator<CustomerContactMediaDetail> iterator =  customerContactMediaDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactMediaDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	// get Customer Contact Documents
	public Iterable<CustomerDocumentDetail> getCustomerDocumentDetail(String customerId)
	{
		ArrayList<CustomerDocumentDetail> it = new ArrayList<CustomerDocumentDetail>();
		ListIterator<CustomerDocumentDetail> iterator =  customerDocumentDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerDocumentDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	
	
	
}
