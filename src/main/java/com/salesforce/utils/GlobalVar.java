package com.salesforce.utils;

import java.util.HashMap;
import java.util.Map;

import com.salesforce.commands.Command;
import com.salesforce.commands.CurrentDirectoryCommand;
import com.salesforce.commands.ListContentsCommand;
import com.salesforce.commands.MakeDirCommand;
import com.salesforce.commands.QuitCommand;
import com.salesforce.model.Directory;

public class GlobalVar {

	private static GlobalVar instance;
	private Directory root;
	private boolean keepGoing;
	private Map<String, Command> commands;
	
	
	
	private GlobalVar(){
		this.root = new Directory("/root", null);
		this.keepGoing = true;
		
		this.commands = new HashMap();
		QuitCommand quitCommand = new QuitCommand();
		commands.put(quitCommand.getCommandInstruction(), quitCommand);
		CurrentDirectoryCommand currentDirectoryCommand = new CurrentDirectoryCommand();
		commands.put(currentDirectoryCommand.getCommandInstruction(), currentDirectoryCommand);
		ListContentsCommand listContentsCommand = new ListContentsCommand();
		commands.put(listContentsCommand.getCommandInstruction(), listContentsCommand);
		MakeDirCommand makeDirCommand = new MakeDirCommand();
		commands.put(makeDirCommand.getCommandInstruction(), makeDirCommand);
		
	}
	
	
	
	public static GlobalVar getInstance() {
		if(instance == null) {
			instance = new GlobalVar();
		}
		return instance;
	}

	public Directory getRoot() {
		return root;
	}
	public boolean getKeepGoing() {
		return keepGoing;
	}
	public void setKeepGoing(boolean keepGoing) {
		this.keepGoing = keepGoing;
	}
	public Map<String, Command> getCommands() {
		return commands;
	}
	
}
