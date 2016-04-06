package com.team1389.robot;

import com.team1389.robot.subsystems.Drivetrain;

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
		drivetrain = new Drivetrain(io.drivetrainMotors); // Note that you should replace the array with individual SpeedControllers
	}
}
