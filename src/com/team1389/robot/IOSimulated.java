package com.team1389.robot;

import org.strongback.mock.Mock;

public class IOSimulated extends IOLayout{
	public IOSimulated() {

		//initialize inputs and outputs with simulators
		leftDrive = Mock.stoppedTalonSRX();
		rightDrive = Mock.stoppedTalonSRX();
	}
}
