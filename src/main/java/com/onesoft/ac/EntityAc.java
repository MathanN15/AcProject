package com.onesoft.ac;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
//@Table(name="")
public class EntityAc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private String color;
private int wings;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getWings() {
	return wings;
}
public void setWings(int wings) {
	this.wings = wings;
}

}
