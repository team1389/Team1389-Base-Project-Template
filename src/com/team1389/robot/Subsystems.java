package com.team1389.robot;

import com.team1389.robot.subsystems.*; // Without this we'd write a different import declaration for each subsystem

/**
 * Put subsystems in this class 
 */
public class Subsystems {
	//for example:
	//public final DriveTrain drive;
	public final Drivetrain drivetrain;
	public Subsystems(IOLayout io) {
		//for example:
		//drive = new DriveTrain(io.leftMotor, io.rightMotor);
		drivetrain = new Drivetrain(io.drivetrain_motor1, io.drivetrain_motor2);
	}
}
