package org.learn.HalftonJavaTraning2018.assignment;

 public enum TrafficLight {
	
	RED("Stop",10),
	GREEN("Go",10),
	YELLOW("Slow",5);
	
	private  final String commands;
	private  final int time;
	
	TrafficLight(String commands,int time)
	{
		this.commands=commands;
		this.time=time;
	}
	
	public String getCommands()
	{
		return commands;
	}
	
	public int getTime()
	{
		return time;
	}
}
 

