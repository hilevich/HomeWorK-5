package greenhouse;

import java.util.Scanner;

public class control {
	
public double changeTemperature(double minTemperature, double maxTemperature) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please, set temperature between " + minTemperature + " and " + 
	maxTemperature + "in decimal");
	
		while ((!sc.hasNextDouble()) || (sc.nextDouble() >  maxTemperature) || 
				(sc.nextDouble() < minTemperature)) {
			System.out.println("You entered invalid value, please, try again");
			sc.nextLine();
				}
		
	Double temperature = sc.nextDouble();
	return temperature;
	
			}



	public double changeHumidity(double minHumidity, double maxHumidity) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, set humidity between " + minHumidity + " and " + 
		maxHumidity + "in decimal");
		
		while ((!sc.hasNextDouble()) || (sc.nextDouble() > maxHumidity) 
				|| (sc.nextDouble() < minHumidity)) {
			System.out.println("You entered invalid value, please, try again");
			sc.nextLine();
		}
		Double humidity = sc.nextDouble();
		return humidity;
	}

	
	
	public double changeLights(double maxLights, double minLights) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, set the lights ratio between " + minLights + "and" + 
		maxLights + "in decimal");
		
		while ((!sc.hasNextDouble()) || (sc.nextDouble() > maxLights) 
				|| (sc.nextDouble() < minLights)) {
			System.out.println("You entered invalid value, please, try again");
			sc.nextLine();
		}
		Double lights = sc.nextDouble();
		return lights;
		
		
	}


}
