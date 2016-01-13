package com.team1389.robot.commands.stateMachineTest;

import com.team1389.base.commands.statemachine.State;

public class Carrot extends State{

	@Override
	public String nextState() {
		return null;//this is the last state
	}

	@Override
	public String getName() {
		return "carrot";
	}

	@Override
	protected void initialize() {
		System.out.println("carrot running");
	}

	@Override
	protected void execute() { }

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() { }

	@Override
	protected void interrupted() { }

}
