package com.springcore.lifecycle;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean //ctrl+space
{
 private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	//init
	System.out.println("taking pepsi: init");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Going to put bottle back to shop after drinking: destroy");
	
}
}
