package com.training.exceptionhandling;
import java.util.ArrayList;
import java.util.List;



/**
 * Our Inventory has two Nissan cars and Two Toyota Cars
 * @author junaidpasha
 *
 */
public class CarDB {
	
	
	/**
	 * 
	 * get Nissan cars
	 */
	public List<Nissan> getNissancars() { 
		
		List<Nissan> nissanCars = new ArrayList<Nissan>();
		
		//Create two Nissan Objects 
		Nissan nissanCarUSA = new Nissan();
		nissanCarUSA.setCompanyName("Nissan UK");
		nissanCarUSA.setHeadquarters("London");
		String nissanModels[] = { "Altima","370z","Maxima"};
		nissanCarUSA.setModels(nissanModels);
		
		//Add the Nissan car to the List
		nissanCars.add(nissanCarUSA);
		
		Nissan nissanCarMiddleEast = new Nissan();
		nissanCarMiddleEast.setCompanyName("Nissan DOH");
		nissanCarMiddleEast.setHeadquarters("Doha");
		String nissanModelsMiddlesEast[] = { "380z","Z Nismo","Z Roaster"};
		nissanCarMiddleEast.setModels(nissanModelsMiddlesEast);
		
		//Add the Nissan car to the List
		nissanCars.add(nissanCarMiddleEast);
		
		return nissanCars;
		
	}

	
	
	
	
	
	
	
	/**
	 * 
	 * get Toyota cars
	 */
	public List<Toyota> getToyotacars() { 
		
		List<Toyota> toyotaCars = new ArrayList<Toyota>();
		
		//Create two Nissan Objects 
		Toyota toyotaCarUSA = new Toyota();
		toyotaCarUSA.setCompanyName("Toyota UK");
		toyotaCarUSA.setHeadquarters("London");
		String toyotaModelsUSA[] = { "Camry","Lexus","Odyssey","prius","mirae"};
		toyotaCarUSA.setModels(toyotaModelsUSA);
		
		//Add the Nissan car to the List
		toyotaCars.add(toyotaCarUSA);
		
		Toyota toyotaCarMiddleEast = new Toyota();
		toyotaCarMiddleEast.setCompanyName("Nissan DOH");
		toyotaCarMiddleEast.setHeadquarters("Doha");
		String toyotaModelsMiddlesEast[] = { "camry","Lexus","Tacoma"};
		toyotaCarMiddleEast.setModels(toyotaModelsMiddlesEast);
		
		
		//Add the Nissan car to the List
		toyotaCars.add(toyotaCarMiddleEast);
		
		return toyotaCars;
		
		
	}

	
	
}
