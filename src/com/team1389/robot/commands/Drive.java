package com.team1389.robot.commands;

import org.strongback.command.Command;
import org.strongback.components.ui.InputDevice;
import com.team1389.robot.subsystems.Drivetrain;

public class Drive extends Command {

	Drivetrain drivetrain;
	InputDevice controller;
	// These fields and the below constructor stay the same no matter how many motors the drivetrain has

	public Drive(Drivetrain drivetrain, InputDevice controller) {
		this.drivetrain = drivetrain;
		this.controller = controller;
	}

	@Override
	public boolean execute() { // Using the values returned from controller's methods, this method should calculate the parameters that'll be passed to drivetrain.drive(multiple doubles)
		// TODO Auto-generated method stub
		return false;
	}

}
