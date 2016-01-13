package com.team1389.robot.commands.stateMachineTest;

import java.util.ArrayList;
import java.util.List;

import com.team1389.base.commands.statemachine.State;
import com.team1389.base.commands.statemachine.StateMachine;

public class PrintState extends StateMachine{

	@Override
	public List<State> getStates() {
		List<State> states = new ArrayList<State>();
		
		states.add(new Cupcake());
		states.add(new Carrot());
		
		return states;
	}

	@Override
	public String startState() {
		return "cupcake";
	}

}
