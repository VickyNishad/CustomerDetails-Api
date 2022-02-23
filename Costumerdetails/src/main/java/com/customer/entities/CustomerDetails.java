package com.customer.entities;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 * 
 * @author 33000014
 *
 */



@Entity
@Table
@SqlResultSetMapping(name = "CustomerDetails" , classes = @ConstructorResult(targetClass = CustomerDetails.class ,columns = {
		@ColumnResult(name = "SocialClientId"  , type = String.class),
		@ColumnResult(name = "FirstName" , type = String.class),
		@ColumnResult(name = "MiddleName" , type = String.class),
		@ColumnResult(name = "LastName" , type = String.class),
		@ColumnResult(name = "Gender" , type = String.class),
		@ColumnResult(name = "DateOfBirth" , type = String.class),
		@ColumnResult(name = "EmailId" , type = String.class),
		@ColumnResult(name = "MobileNo" , type = String.class),
		@ColumnResult(name = "AddressLine1" , type = String.class),
		@ColumnResult(name = "AddressLine2" , type = String.class),
		@ColumnResult(name = "AddressLine3" , type = String.class),
		@ColumnResult(name = "Pincode" , type = String.class),
		@ColumnResult(name = "Country" , type = String.class),
		@ColumnResult(name = "City" , type = String.class),
		@ColumnResult(name = "State" , type = String.class),
		@ColumnResult(name = "AddressType" , type = String.class),
		@ColumnResult(name = "MFUcc" , type = String.class),
}))
public class CustomerDetails {
	
	@Id
	private String SocialClientId;
	
	private String firstName;
	
	private String MiddleName;
	
	private String LastName;
	
	private String Gender;
	
	private String DateOfBirth;
	
	private String EmailId;
	
	private String MobileNo;
	
	private String AddressLine1;
	
	private String AddressLine2;
	
	private String AddressLine3;
	
	private String Pincode;
	
	private String Country;
	
	private String City;
	
	private String State;
	
	private String AddressType;
	
	private String MFUcc;

	/**
	 * 
	 * @param socialClientId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param emailId
	 * @param mobileNo
	 * @param addressLine1
	 * @param addressLine2
	 * @param addressLine3
	 * @param pincode
	 * @param country
	 * @param city
	 * @param state
	 * @param addressType
	 * @param mFUcc
	 */
	
	public CustomerDetails(String socialClientId, String firstName, String middleName, String lastName, String gender,
			String dateOfBirth, String emailId, String mobileNo, String addressLine1, String addressLine2,
			String addressLine3, String pincode, String country, String city, String state, String addressType,
			String mFUcc) {
		super();
		SocialClientId = socialClientId;
		this.firstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		EmailId = emailId;
		MobileNo = mobileNo;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		AddressLine3 = addressLine3;
		Pincode = pincode;
		Country = country;
		City = city;
		State = state;
		AddressType = addressType;
		MFUcc = mFUcc;
	}
	
	/**
	 * 
	 * 
	 */

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	
	public String getSocialClientId() {
		return SocialClientId;
	}

	public void setSocialClientId(String socialClientId) {
		SocialClientId = socialClientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return AddressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getAddressType() {
		return AddressType;
	}

	public void setAddressType(String addressType) {
		AddressType = addressType;
	}

	public String getMFUcc() {
		return MFUcc;
	}

	public void setMFUcc(String mFUcc) {
		MFUcc = mFUcc;
	}
	
	/**
	 * 
	 */

	@Override
	public String toString() {
		return "CustomerDetails [SocialClientId=" + SocialClientId + ", firstName=" + firstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", Gender=" + Gender + ", DateOfBirth=" + DateOfBirth
				+ ", EmailId=" + EmailId + ", MobileNo=" + MobileNo + ", AddressLine1=" + AddressLine1
				+ ", AddressLine2=" + AddressLine2 + ", AddressLine3=" + AddressLine3 + ", Pincode=" + Pincode
				+ ", Country=" + Country + ", City=" + City + ", State=" + State + ", AddressType=" + AddressType
				+ ", MFUcc=" + MFUcc + "]";
	}
	
	
}
	