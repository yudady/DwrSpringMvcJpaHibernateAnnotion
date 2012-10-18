package com.tommy.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "apple")
public class Apple implements Serializable{

	private String appleName;
	private int quality;

	public Apple() {
		System.out.println("constructor----Apple");
	}

	public Apple(String appleName, int quality) {
		System.out.println("constructor----Apple");
		this.appleName = appleName;
		this.quality = quality;
	}

	public String getAppleName() {
		return appleName;
	}
	
	@XmlElement
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public int getQuality() {
		return quality;
	}

	@XmlElement
	public void setQuality(int quality) {
		this.quality = quality;
	}

}