package com.team1389.y2017.robot;

import com.team1389.base.RobotLayoutType;

public class RobotLayout implements RobotLayoutType{
	public final IOLayout io;
	public final Subsystems subsystems;
	
	public RobotLayout(IOLayout io, Subsystems subsystems) {
		this.io = io;
		this.subsystems = subsystems;
	}
}
