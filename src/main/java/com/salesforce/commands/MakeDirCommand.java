package com.salesforce.commands;

import java.io.IOException;

import com.salesforce.model.Directory;

public class MakeDirCommand implements Command {

	@Override
	public String getName() {
		return "make directory";
	}

	@Override
	public String getCommandInstruction() {
		return "mkdir";
	}

	@Override
	public void execute(Directory directory, String name) throws IOException {
		Directory newDirectory = new Directory("/" + name, directory);
		directory.getSubContent().add(newDirectory);
	}

}
