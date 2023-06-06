package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp2")
private Address address;

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp(Address address) {
	super();
	this.address = address;
	System.out.println("Inside constructor");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
}
