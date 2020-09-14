package io.javabrains.springbootstarter.hello;

public class Topic {
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	
	public Topic(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return description;
	}
	

}
