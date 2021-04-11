package com.salesforce.model;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Content {

	private String name;
	private List<Content> subContent;
	private Directory parentDirectory;
	
	
	
	public Directory(String name, Directory parentDirectory) {
		super();
		this.name = name;
		this.subContent = new ArrayList<Content>();
		this.parentDirectory = parentDirectory;
	}
	
	
	
	public String getFullPath() {
		if(parentDirectory != null) {
			return parentDirectory.getFullPath()+ this.name;			
		}
		else {
			return this.name;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Content> getSubContent() {
		return subContent;
	}
	public void setSubContent(List<Content> subContent) {
		this.subContent = subContent;
	}
	public Directory getParentDirectory() {
		return parentDirectory;
	}
	public void setParentDirectory(Directory parentDirectory) {
		this.parentDirectory = parentDirectory;
	}
	
}
