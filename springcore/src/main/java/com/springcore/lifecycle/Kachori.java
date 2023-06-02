package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Kachori() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Kachori [subject=" + subject + "]";
}

@PostConstruct
public void start() {
	System.out.println("Starting Making Kachori");
}
@PreDestroy
public void end() {
	System.out.println("Kachori is prepared");
}

}
