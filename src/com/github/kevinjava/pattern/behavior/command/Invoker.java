package com.github.kevinjava.pattern.behavior.command;

import java.util.ArrayList;

public class Invoker {
	ArrayList<Command> commands = new ArrayList<>();
	
	public void add(Command command){
		commands.add(command);
	}
	
	public void takeOrder(){
		for (Command command : commands) {
			command.execue();
		}
	}
}
