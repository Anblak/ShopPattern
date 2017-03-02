package com.shopPattern.dto;

public class BookDTO {

	private String title;
	private String pages;
	
	public BookDTO() {
	}

	public BookDTO(String title, String pages) {
		super();
		this.title = title;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", pages=" + pages + "]";
	}
	
	
	
}