package com.training.exceptionhandling;
import java.util.List;


/**
 * Get the Latest Nissan Car Model in MiddleEast and then Print the Name of the
 * sales Agent working on this Car
 * 
 * @author junaidpasha
 *
 */


public class ShowLatestModels {
	
	public static String agentName = "Omar";
	public static String customerName = "Sam";
	
	public static void main(String args[]) { 
		
		CarDB carDb = new CarDB();
		List<Nissan> nissanCars = carDb.getNissancars();
		//Get the First Nissan Market ( Its either USA or MiddleEast) 
		Nissan nissanMiddleEast = nissanCars.get(1);
		//Get the Models for that market
		String nissanModels[] = nissanMiddleEast.getModels();
		System.out.println("The latest Model are " + nissanModels[3]);
		System.out.println("The Agent who is working on this Car is" +agentName);
		System.out.println("The Customer name is" + customerName);
		
		
}
}