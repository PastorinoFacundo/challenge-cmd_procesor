package com.salesforce.commands;

import java.io.IOException;

import com.salesforce.model.Directory;

public interface Command {
	
	public String getName();
	public String getCommandInstruction();
	public void execute(Directory directory, String parameter) throws IOException;
	
}
