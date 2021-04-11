package com.salesforce.commands;

import com.salesforce.model.Directory;
import com.salesforce.utils.GlobalVar;

public class QuitCommand implements Command {

	@Override
	public String getName() {
		return "quit";
	}

	@Override
	public String getCommandInstruction() {
		return "quit";
	}
	
	@Override
	public void execute(Directory directory, String parameter) {
		GlobalVar.getInstance().setKeepGoing(false);
	}
	
}
