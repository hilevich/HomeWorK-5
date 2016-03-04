package greenhouse;

public class onOffСontrol {

	
	
	public class massege{
		
		

		public void messageTemperature(double outTemperature, double temperature) {
			
			
			
			// TODO Auto-generated method stub
			
		}

		public void messageHumidity(double outHumidity, double humidity) {
			
			
			
			// TODO Auto-generated method stub
			
		}

		

		public void messageLights(double outLights, double lights) {
			
			
			// TODO Auto-generated method stub
			
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
