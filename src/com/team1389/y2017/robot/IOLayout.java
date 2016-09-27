package com.team1389.y2017.robot;

import edu.wpi.first.wpilibj.CANTalon;

public class IOLayout{
	//put inputs and outputs here, but don't initialize anything. For example:[
	CANTalon drivetrain_motor1, drivetrain_motor2;
	public IOLayout() {
		//Initialize motors and sensors here
		drivetrain_motor1 = new CANTalon(RobotMap.drivetrain_motor1ID);
		drivetrain_motor2 = new CANTalon(RobotMap.drivetrain_motor2ID);
	}
}
