package com.ashokit.in;

public class Car  {
	private Iengine eng;
	
	public void drive() {
		int status= eng.start();
		if(status>=1) {
			System.out.println("journey started");
		}
		else {
			System.out.println("failure on engine");
		}
		
	}

}
 