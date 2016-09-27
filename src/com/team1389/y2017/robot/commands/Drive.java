package com.team1389.y2017.robot.commands;

import org.strongback.command.Command;
import org.strongback.components.ui.InputDevice;

import com.team1389.y2017.robot.subsystems.Drivetrain;

public class Drive extends Command {

	final Drivetrain drivetrain;
	final InputDevice controller;
	
	public Drive(Drivetrain drivetrain, InputDevice controller) {
		this.drivetrain = drivetrain;
		this.controller = controller;
	}
	
	@Override
	public boolean execute() {
		// TODO Implement
		return false;
	}

}
