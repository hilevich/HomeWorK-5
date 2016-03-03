package greenhouse;

public class onOffControl {	
		
	/**
	 * 
	 * @param temIndicator – the temperature indicator, if true – enabled, if false – disabled
	 * @param humIndicator – the humidity indicator, if true – enabled, if false – disabled
	 * @param ligIndicator – the lights indicator, if true – enabled, if false – disabled
	 */
	public void checkIndicator(boolean temIndicator, boolean humIndicator, boolean ligIndicator) {	
		boolean[] indicatorStatus = new boolean[3];
		
		indicatorStatus[0] = temIndicator;
		indicatorStatus[1] = humIndicator;
		indicatorStatus[2] = ligIndicator;	
		
		new onOffControl.message().messageSMS(indicatorStatus);
		
		System.out.println("SMS sent!");
	}	
	/**
	 * This class send SMS according to the indicator status 
	 */
	public class message {		
		void messageSMS(boolean[] indicatorStatus) {
			String[] sensor = new String[3];
			sensor[0] = "The temperature sensor is ";
			sensor[1] = "The humidity sensor is ";
			sensor[2] = "The lights sensor is ";
			for (int i = 0; i < indicatorStatus.length; i++) {
				if (indicatorStatus[i]) {
					System.out.println(sensor[i] + "ON");
				} else {
					System.out.println(sensor[i] + "OFF");
				}
			}			
		}
	}

	
	public double changeValeTemperature(double temperature, double minTemperature, double maxTemperature) {
		if (temperature>maxTemperature||temperature<minTemperature){
			System.out.println("Temperature is too high \n We start normalizing temperature...");
			
			double temperature1 = minTemperature+maxTemperature/2;
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
			
			double humidity1 = minHumidity+maxHumidity/2;
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
			
			double lights1 = minLights+maxLights/2;
			System.out.println("The lights is normilized!");
			return lights1;
			
		} else		{
			System.out.println("System failed to change lights");
			return lights;
		}
		
         		
		
	}



}
