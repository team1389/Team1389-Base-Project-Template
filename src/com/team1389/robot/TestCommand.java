package com.team1389.robot;

import org.strongback.command.Command;
import org.strongback.command.Requirable;

public class TestCommand extends Command{
	
	static Requirable r;
	static Requirable[] rs = {r, r, r};
	public TestCommand() {
		super(rs);
	}

	@Override
	public boolean execute() {
		return true;
	}

}
