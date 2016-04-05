// You can delete the comments in competition code. Don't forget to describe the code though!

package com.team1389.robot.subsystems;

import com.team1389.base.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.CANTalon;

public class Drivetrain extends Subsystem {

	// Each motor that spins the wheels will be symbolized with a final field of the type Jaguar/CANJaguar/CANTalon/TalonSRX/Victor. All of these classes are in the edu.wpi.first.wpilibj package
	// Example with a two-motor drivetrain that uses CANTalons to control the motors (one motor per side):
	// import edu.wpi.first.wpilibj.CANTalon;
	// ...
	// final CANTalon leftMotor;
	// final CANTalon rightMotor;
	//
	// I'll call this "Basic"
	
	public Drivetrain(SpeedController...replaceThisVarargWithOneSpeedControllerPerField_makeSureTheTypesMatch) {// Example with Basic: public Drivetrain(CANTalon leftMotor, CANTalon rightMotor)
		// TODO Auto-generated constructor stub
		// Example with Basic:
		// 	this.leftMotor = leftMotor;
		// 	this.rightMotor = rightMotor;
	}
	
	public void drive(double...replaceThisVarargWithOneDoublePerSpeedControllerField){// Example with Basic: public void drive(double leftPower, double rightPower)
		// TODO Hand-made method stub
		// Example with Basic:
		// 	leftMotor.set(leftPower);
		// 	rightMotor.set(rightPower);
	}
}
