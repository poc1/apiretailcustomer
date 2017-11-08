/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.developers.msa.ola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.developers.model.CustomerContactAddressesDetail;
import com.redhat.developers.model.CustomerContactMediaDetail;
import com.redhat.developers.model.CustomerContactPhoneDetail;
import com.redhat.developers.model.CustomerDataRetail;
import com.redhat.developers.pojo.BasicData;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class RetailCustomerController {

	public final RetailCustomerService retailService;

	@Autowired
	public RetailCustomerController(RetailCustomerService retailService) {
			this.retailService = retailService;
	}
	
	/**
	 * Información básica del Cliente
	 * @param customerid
	 * @return
	 */
	@RequestMapping(value="/basicdata/", method=RequestMethod.POST)
	@ApiOperation(value = "Información Básica del Cliente",response = CustomerDataRetail.class, produces = "application/json")
	public @ResponseBody String getBasicData(@RequestBody BasicData basicData)
	{
		return retailService.getBasicData(basicData);
	}
	
	
	
	/**
	 * Direcciones del Cliente
	 * @param basicData
	 * @return
	 */
	@RequestMapping(value="/address/", method=RequestMethod.POST)
	@ApiOperation(value = "Direcciones del Cliente",response = CustomerContactAddressesDetail.class, produces = "application/json")
	public @ResponseBody String getCustomerContactAddress(@RequestBody BasicData basicData)
	{
		return retailService.getCustomerContactAddress(basicData);
	}
	
	
	/**
	 * Teléfonos del Cliente
	 * @param customerid
	 * @return
	 */
	@RequestMapping(value="/phone/", method=RequestMethod.POST)
	@ApiOperation(value = "Teléfonos del Cliente",response = CustomerContactPhoneDetail.class, produces = "application/json")
	public @ResponseBody String getCustomerContactPhone(@RequestBody BasicData basicData)
	{
		return retailService.getCustomerContactPhone(basicData);
	}
	
	
	/**
	 * Medios Electrónicos
	 * @param customerid
	 * @return
	 */
	@RequestMapping(value="/media/", method=RequestMethod.POST)
	@ApiOperation(value = "Medios Electrónicos del Cliente",response = CustomerContactMediaDetail.class, produces = "application/json")
	public @ResponseBody String getCustomerContactMedia(@RequestBody BasicData basicData)
	{
		return retailService.getCustomerContactMedia(basicData);
	}

}

