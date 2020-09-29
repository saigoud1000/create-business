package com.event.business.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName= "Customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String customerId;

	@NotNull(message = "phoneNumber is mandatory")
	private String phoneNumber;

  private String extension;	
	
	@NotNull(message = "userName is mandatory")
	private String userName;
	
	@NotNull(message = "firstName is mandatory")
	private String firstName;
	
	@NotNull(message = "lastName is mandatory")
	private String lastName;
	
	@NotNull(message = "email is mandatory")
	private String email;
	
	private TransactionDetails transaction;
	
	@NotNull(message = "password is mandatory")
	private String password;

	@DynamoDBHashKey(attributeName = "customerId")
    @DynamoDBAutoGeneratedKey
    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	@DynamoDBAttribute
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@DynamoDBAttribute
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@DynamoDBAttribute
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TransactionDetails getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionDetails transaction) {
		this.transaction = transaction;
	}
	
	@DynamoDBAttribute
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@DynamoDBAttribute
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@DynamoDBAttribute
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@DynamoDBAttribute
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
				
}
