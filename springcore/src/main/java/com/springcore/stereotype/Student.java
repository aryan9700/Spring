package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component("obj")
@Scope("prototype") //by default singleton wahi object baar baar dega
public class Student {
	@Value("Aryan")
	private String name;
	@Value("Delhi")
	private String city;
	@Value("#{temp}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
