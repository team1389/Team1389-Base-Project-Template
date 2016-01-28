package com.team1389.robot;

import com.team1389.base.Mode;
import com.team1389.base.Simulator;

/**
 * The main method for running the program as a simulation. Change which mode is passed to simulate to simulate different modes.
 */
public class SimulationMain {
	public static void main(String[] args){
		IOLayout io = new IOSimulated();
		RobotLayout layout = new RobotLayout(io, new Subsystems(io));
		Simulator.simulate(new Robot(layout), Mode.TELEOP);
	}
}
