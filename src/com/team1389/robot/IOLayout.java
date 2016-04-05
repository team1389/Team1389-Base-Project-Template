package com.team1389.robot;

//import org.strongback.components.TalonSRX;
//import edu.wpi.first.wpilibj.CANTalon;

import edu.wpi.first.wpilibj.SpeedController;

public class IOLayout{
	//put inputs and outputs here, but don't initialize anything. For example:[
//	TalonSRX leftDrive;
//	TalonSRX rightDrive;
	
	SpeedController[] drivetrainMotors;
	// You MUST replace the above array with one TalonSRX/CANTalon/Jaguar/CANJaguar/Victor instance per corresponding field in the subsystem
	// Example with Basic:
	// CANTalon leftMotor;
	// CANTalon rightMotor;
	public IOLayout() {
		//Initialize motors and sensors here
	}
}
