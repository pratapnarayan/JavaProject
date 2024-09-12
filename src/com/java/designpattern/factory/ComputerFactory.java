package com.java.designpattern.factory;

import com.java.designpattern.factorypattern.Computer;
import com.java.designpattern.factorypattern.PC;
import com.java.designpattern.factorypattern.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
}
}
