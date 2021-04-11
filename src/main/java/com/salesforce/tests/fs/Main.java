package com.salesforce.tests.fs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.salesforce.commands.Command;
import com.salesforce.model.Directory;
import com.salesforce.utils.GlobalVar;

/**
 * The entry point for the Test program
 */
public class Main {

    public static void main(String[] args) throws IOException {
    	
    	Directory currentDir = GlobalVar.getInstance().getRoot();
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        while(GlobalVar.getInstance().getKeepGoing()) {
        	String[] line = bufferedReader.readLine().trim().split(" ");
        	String commandInstruction = line[0];
        	String parameter = null;
        	if(line.length > 1) {
        		parameter = line[1];
        	}
	        Command command = GlobalVar.getInstance().getCommands().get(commandInstruction);
	        if(command != null) {
	        	command.execute(currentDir, parameter);
	        }else {
	        	System.out.println("'" + commandInstruction +"' is not recognized as an internal or external command.");
	        }
        }
        
        bufferedReader.close();
        
        
    }
}
