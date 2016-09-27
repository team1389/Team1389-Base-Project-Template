package com.team1389.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	/*
	 * Note: You MUST declare everything to be public (all classes may access
	 * them), static (they belong to the RobotMap class, not to a RobotMap
	 * instance) and final (they're constants). The order of the words doesn't
	 * matter though
	 */

	/**
	 * If there's one controller (not necessarily a joystick), it's ID will be
	 * this.
	 */
	public static final int controller = 0;

	/** This is something about the joysticks. */
	public static final int xAxis = 0, yAxis = 1, rotationalAxis = 2, knob = 3;
	
	// Values for Logitech Extreme 3D
	
//	/** [Use with Logitech Extreme 3D] This is the button that gets under your fore finger at the moment you hold the joystick. */
//	public static final int gunTrigger = 1;
//	/** [Use with Logitech Extreme 3D] This is the button that gets under your thumb at the moment you hold the joystick. */
//	public static final int defaultButtonForThumb = 2;
//	/** [Use with Logitech Extreme 3D] This button is somewhere around the, um, joystickie located on the top of the joystick. */
//	public static final int 
//		button3 = 3,
//		button4 = 4,
//		button5 = 5,
//		button6 = 6;
//	/** [Use with Logitech Extreme 3D] This button is on the side of the joystick. <b>Never ever try to press it while holding the joystick with your dominant hand!</b> */
//	public static final int
//		button7 = 7,
//		button8 = 8,
//		button9 = 9,
//		button10 = 10,
//		button11 = 11,
//		button12 = 12;
	
	// Values for drivetrain motors
	
	public static final int
		drivetrain_motor1ID = 0,
		drivetrain_motor2ID = 1;
}
