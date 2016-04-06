package com.team1389.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  public static final int
    firstControllerID = 0,
    secondControllerID = 1;
    
  // These will be useful in auton
  public static final double
    wheelDiameterInInches = 0, // TODO Find this out when the robot is ready
    wheelCircumferenceInInches = Math.PI * wheelDiameterInInches;
}
