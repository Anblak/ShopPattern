package com.shopPattern.dto;

public class CatalogDTO {
	
	private int id;
	
	private String name;
	
	public CatalogDTO() {
		// TODO Auto-generated constructor stub
	}

	public CatalogDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
