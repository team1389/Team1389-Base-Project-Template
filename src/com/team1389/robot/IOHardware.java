package com.team1389.robot;

import org.strongback.hardware.Hardware;

import edu.wpi.first.wpilibj.CANTalon;

public class IOHardware extends IOLayout{
	public IOHardware() {
		wheel1 = Hardware.Motors.talonSRX(new CANTalon(0));
	}
}
