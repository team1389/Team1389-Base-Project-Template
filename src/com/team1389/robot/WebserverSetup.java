package com.team1389.robot;


import com.team1389.base.RobotCode;
import com.team1389.base.webserver.WebServer;

public class WebserverSetup {
	public static WebServer initiateWebserver(RobotCode code){
		WebServer server = new WebServer(code);
		return server;
	}
}
