package com.shopPattern.dto;

import com.shopPattern.entity.Catalog;

public class CategoryDTO {
	
	private int id;
	private String name;
	private Catalog catalogs;
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(int id, String name, Catalog catalogs) {
		super();
		this.id = id;
		this.name = name;
		this.catalogs = catalogs;
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

	public Catalog getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(Catalog catalogs) {
		this.catalogs = catalogs;
	}
	
}
