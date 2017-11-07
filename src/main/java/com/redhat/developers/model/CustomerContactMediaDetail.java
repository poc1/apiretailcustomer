package com.redhat.developers.model;

public class CustomerContactMediaDetail {

	private String customerId;
	private String mediaContactType; 
	private String mediaType; 
	private String mediaSequence; 
	private String mediaAddress; 
	private String contactIndicator; 
	private String obervations;
	
	
	
	public CustomerContactMediaDetail() {} 
	
	public CustomerContactMediaDetail(String customerId, String mediaContactType, String mediaType,
			String mediaSequence, String mediaAddress, String contactIndicator, String obervations) {
		super();
		this.customerId = customerId;
		this.mediaContactType = mediaContactType;
		this.mediaType = mediaType;
		this.mediaSequence = mediaSequence;
		this.mediaAddress = mediaAddress;
		this.contactIndicator = contactIndicator;
		this.obervations = obervations;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMediaContactType() {
		return mediaContactType;
	}
	public void setMediaContactType(String mediaContactType) {
		this.mediaContactType = mediaContactType;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getMediaSequence() {
		return mediaSequence;
	}
	public void setMediaSequence(String mediaSequence) {
		this.mediaSequence = mediaSequence;
	}
	public String getMediaAddress() {
		return mediaAddress;
	}
	public void setMediaAddress(String mediaAddress) {
		this.mediaAddress = mediaAddress;
	}
	public String getContactIndicator() {
		return contactIndicator;
	}
	public void setContactIndicator(String contactIndicator) {
		this.contactIndicator = contactIndicator;
	}
	public String getObervations() {
		return obervations;
	}
	public void setObervations(String obervations) {
		this.obervations = obervations;
	}

		
	
}
