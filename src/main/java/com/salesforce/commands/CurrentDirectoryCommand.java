package com.salesforce.commands;

import java.io.IOException;

import com.salesforce.model.Directory;

public class CurrentDirectoryCommand implements Command {

	@Override
	public String getName() {
		return "CurrentDirectory";
	}
	
	@Override
	public String getCommandInstruction() {
		return "pwd";
	}


	@Override
	public void execute(Directory directory, String parameter) throws IOException {
		System.out.println(directory.getFullPath());
	}



	
	

}
