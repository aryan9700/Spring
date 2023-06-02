package com.springcore.collections;
import java.util.*; 

public class Emp {
private String name;
private List <String> phones;//list duplicate allowed order maintain/ when you have only 1 element then don't 
//need to mention <list> it take list automatically directly write <value> in xml
//we can also create empty list
private Set <String> addresses;//no duplicates no order
private Map<String,String> courses;
private Properties spec;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List <String> getPhones() {
	return phones;
}
public void setPhones(List <String> phones) {
	this.phones = phones;
}
public Set <String> getAddresses() {
	return addresses;
}
public void setAddresses(Set <String> addresses) {
	this.addresses = addresses;
}
public Map<String,String> getCourses() {
	return courses;
}
public void setCourses(Map<String,String> courses) {
	this.courses = courses;
}
public Properties getSpec() {
	return spec;
}
public void setSpec(Properties spec) {
	this.spec = spec;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties spec) {
	super();
	this.name = name;
	this.phones = phones;
	this.addresses = addresses;
	this.courses = courses;
	this.spec = spec;
}
}
