package com.tommy.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fruit")
public class Fruit {

	private String name;
	private int quality;

	
	public Fruit() {
		System.out.println("constructor----Fruit");
	}
	public Fruit(String name, int quality) {
		System.out.println("constructor----Fruit");
		this.name = name;
		this.quality = quality;
	}
	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getQuality() {
		return quality;
	}

	@XmlElement
	public void setQuality(int quality) {
		this.quality = quality;
	}




}