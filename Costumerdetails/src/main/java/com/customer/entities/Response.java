 package com.customer.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private CustomerDetails CustomerDetails;
	
	
	/**
	 * @param status
	 * @param errorCode
	 * @param messageType
	 * @param message
	 */
	
	@JsonCreator
	public Response(@JsonProperty("Status") int status,@JsonProperty("ErrorCode") int errorCode,@JsonProperty("MessageType") String messageType,@JsonProperty("Message") String message,
			@JsonProperty("CustomerDetails") CustomerDetails customerDetails) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		this.CustomerDetails = customerDetails;
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	public Response() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public CustomerDetails getCustomerDetails() {
		return CustomerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		CustomerDetails = (com.customer.entities.CustomerDetails) customerDetails;
	}
	@Override
	public String toString() {
		return "Response [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType + ", Message="
				+ Message + ", CustomerDetails=" + CustomerDetails + "]";
	}
	
	

}
