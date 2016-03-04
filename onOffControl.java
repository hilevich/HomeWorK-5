package greenhouse;

import java.util.Scanner;

public class onOffСontrol {

	
	
	public class massege{

		public void messageTemperature(double outTemperature, double temperature) {
			System.out.println("Failed!\nThe temperature " + outTemperature + " - unacceptable.\nIt was changed to the optimum temperature - " + temperature);
		}

		public void messageHumidity(double outHumidity, double humidity) {
			System.out.println("Failed!\nThe Humidity " + outHumidity + " - unacceptable.\nIt was changed to the optimum humidity - " + humidity);
		}

		public void messageLights(double outLights, double lights) {
			System.out.println("Failed!\nThe Lights " + outLights + " - unacceptable.\nIt was changed to the optimum lights - " + lights);
		}
	}

	public double changeValeTemperature(double temperature, double minTemperature, double maxTemperature) {
		if (temperature>maxTemperature||temperature<minTemperature){
			System.out.println("Temperature is too high \n We start normalizing temperature...");
			
			double temperature1 = (minTemperature+maxTemperature)/2;
			System.out.println("The temperature is normilized!");
			return temperature1;
			
		} else		{
			System.out.println("System failed to change temperature");
			return temperature;
		}
		
         		
		
	}


	public double changeValeHumidity(double humidity, double minHumidity, double maxHumidity) {
		if (humidity>maxHumidity||humidity<minHumidity){
			System.out.println("Humidity is too high \n We start normalizing humidity...");
			
			double humidity1 = (minHumidity+maxHumidity)/2;
			System.out.println("The humidity is normilized!");
			return humidity1;
			
		} else		{
			System.out.println("System failed to change humidity");
			return humidity;
		}
		
         		
		
	}


	public double changeValeLights(double lights, double maxLights, double minLights) {
		if (lights>maxLights||lights<minLights){
			System.out.println("Lights is too high \n We start normalizing humidity...");
			
		   lights = (minLights+maxLights)/2;
			System.out.println("The lights is normilized! ");
			return lights;
			
		} else		{
			System.out.println("System failed to change lights");
			return lights;
		}


}
}
