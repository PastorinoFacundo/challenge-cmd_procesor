package com.salesforce.commands;

import java.io.IOException;

import com.salesforce.model.Content;
import com.salesforce.model.Directory;

public class ListContentsCommand implements Command {

	@Override
	public String getName() {
		return "list contents";
	}

	@Override
	public String getCommandInstruction() {
		return "ls";
	}

	@Override
	public void execute(Directory directory, String parameter) throws IOException {
		if(directory.getSubContent().size() > 0) {
			for(Content subContent: directory.getSubContent()) {
				System.out.println(subContent.getName());
			}			
		}else {
			System.out.println("");
		}
		
	}

}
