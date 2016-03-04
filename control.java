package greenhouse;


import java.util.Scanner;



public class control {
	
	//Scanner scan= new Scanner(System.in);
	
	
	public double changeTemperature(double minTemperature, double maxTemperature, double temperature) {
		int exit = 1;
		Scanner scan= new Scanner(System.in);
		double vale = temperature;
		while (exit!=0){
		
		
		System.out.println("enter your vale of temperature (max = "+maxTemperature+" min = "+minTemperature+" )");
		
			if (scan.hasNextDouble()){
			vale = scan.nextDouble();
			if ((maxTemperature>=vale)&&(vale>=minTemperature)){
				System.out.println("your new temperature is - "+vale);
				exit=0;
			}
			else
			{
				System.out.println("your vale of temperature is not true plase change your vale");
			}
			
			}else{
				System.out.println("your enter not true vale");
				
				exit=0;
			}
		
	}
	
			
		return vale;
		// TODO Auto-generated method stub
		
	}

	public double changeHumidity(double minHumidity, double maxHumidity, double humidity) {
		int exit = 1;
		Scanner scan= new Scanner(System.in);
		double vale = humidity;
		while (exit!=0){
		
		
		System.out.println("enter your vale of temperature (max = "+maxHumidity+" min = "+minHumidity+" )");
		
			if (scan.hasNextDouble()){
			vale = scan.nextDouble();
			if ((maxHumidity>=vale)&&(vale>=minHumidity)){
				System.out.println("your new temperature is - "+vale);
				exit=0;
			}
			else
			{
				System.out.println("your vale of temperature is not true plase change your vale");
			}
			
			}else{
				System.out.println("your enter not true vale");
				
				exit=0;
			}
		
	}
	
			
		return vale;
		// TODO Auto-generated method stub
		
	}

	public double changeLights(double minLights, double maxLights, double lights) {
		int exit = 1;
		Scanner scan= new Scanner(System.in);
		double vale = lights;
		while (exit!=0){
		
		
		System.out.println("enter your vale of temperature (max = "+maxLights+" min = "+minLights+" )");
		
			if (scan.hasNextDouble()){
			vale = scan.nextDouble();
			if ((maxLights>=vale)&&(vale>=minLights)){
				System.out.println("your new temperature is - "+vale);
				exit=0;
			}
			else
			{
				System.out.println("your vale of temperature is not true plase change your vale");
			}
			
			}else{
				System.out.println("your enter not true vale");
				
				exit=0;
			}
		
	}
	
			
		return vale;
		// TODO Auto-generated method stub
		
	}

	
	public class sensorsPrint {
		
		public void valeTemperature(double temperature) {
			System.out.println("Temperature is changed to  " + temperature + "  degree" );
			
			// TODO Auto-generated method stub
			
		}

		public void valeHumidity(double humidity) {
			System.out.println("Humidity is changed to  " + humidity + "  %");
			
			// TODO Auto-generated method stub
			
		}

		public void valeLights(double lights) {
			System.out.println("Lights is changed to  " + lights + "  1 mol/m2");
			
			// TODO Auto-generated method stub
			
		}
		
		
	}
	

}
