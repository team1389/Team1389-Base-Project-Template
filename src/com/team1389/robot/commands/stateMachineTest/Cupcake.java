package com.team1389.robot.commands.stateMachineTest;

import com.team1389.base.commands.statemachine.State;

public class Cupcake extends State{

	@Override
	public String nextState() {
		return "carrot";
	}

	@Override
	public String getName() {
		return "cupcake";
	}

	@Override
	protected void initialize() {
		System.out.println("cupcake is running");
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
