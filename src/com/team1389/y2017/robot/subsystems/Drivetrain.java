package com.team1389.y2017.robot.subsystems;

import com.team1389.base.Subsystem;

import edu.wpi.first.wpilibj.CANTalon;

public class Drivetrain extends Subsystem {
	CANTalon motor1, motor2, motor3, motor4, motor5, motor6, motor7, motor8;
	// Swerve drives use 8 motors

	public Drivetrain(CANTalon... motors) {
		motor1 = motors[0];
		motor2 = motors[1];
		try {
			motor3 = motors[2];
			motor4 = motors[3];
			motor5 = motors[4];
			motor6 = motors[5];
			motor7 = motors[6];
			motor8 = motors[7];
		} catch (ArrayIndexOutOfBoundsException e) {
		} // Thrown when the drivetrain has less than 8 motors
	}

	/**
	 * Driving method for a drivetrain where one motor drives the left wheels
	 * and one other motor drives the right wheels.
	 * 
	 * @param left
	 *            power for the left motor
	 * @param right
	 *            power for the right motor
	 */
	public void awd2motors(double left, double right) {
		motor1.set(left);
		motor2.set(right);
	}
	
	/**
	 * Driving method for a drivetrain where two motors drive the left wheels and two other motors drive the right wheels.
	 * @param left power for the left motors
	 * @param right power for the right motors
	 */
	public void awd4motors(double left, double right){
		motor1.set(left);
		motor2.set(left);
		motor3.set(right);
		motor4.set(right);
	}

	/**
	 * Driving method for a four-wheel drivetrain where each wheel has its own
	 * motor.
	 * 
	 * This method can be used by mecanum and 4-wheel omni drivetrains as well
	 * as car-like drivetrains. Be careful though - calculations needed to
	 * figure out how much power does each motor need can vary wildly between
	 * drivetrains!
	 * 
	 * @param leftFront
	 *            power for the front left motor
	 * @param leftRear
	 *            power for the rear left motor
	 * @param rightFront
	 *            power for the front right motor
	 * @param rightRear
	 *            power for the rear right motor
	 */
	public void awd4motorsIndependent(double leftFront, double leftRear, double rightFront, double rightRear) {
		motor1.set(leftFront);
		motor2.set(leftRear);
		motor3.set(rightFront);
		motor4.set(rightRear);
	}
	
	/**
	 * Driving method for an omni drivetrain with 3 wheels.
	 * 
	 * Take a look at <a href="http://imgur.com/a/KGZ9T">this image</a> to figure out what do these parameter names mean.
	 * 
	 * @param leftFront power for the front left motor
	 * @param rightFront power for the front right motor
	 * @param rear power for the rear motor
	 */
	public void omni3motors(double leftFront, double rightFront, double rear){
		motor1.set(leftFront);
		motor2.set(rightFront);
		motor3.set(rear);
	}
	
	/**
	 * This method is for changing the directions of the wheels in a swerve drivetrain.
	 * @param leftFront power for the front left direction changer
	 * @param leftRear power for the rear left direction changer
	 * @param rightFront power for the front right direction changer
	 * @param rightRear power for the rear right direction changer
	 */
	public void swerveSteering(double leftFront, double leftRear, double rightFront, double rightRear){
		motor5.set(leftFront);
		motor6.set(leftRear);
		motor7.set(rightFront);
		motor8.set(rightRear);
	}
}
