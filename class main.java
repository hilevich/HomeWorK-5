package greenhouse;


import java.util.Scanner;



public class main {
	public static void main(String[] args) {
		
		double temperature, humidity, lights;
		
		double maxTemperature = 60, maxHumidity= 100, maxLights=500;
		
		double minTemperature = 18, minHumidity= 60, minLights=300;
		
		 temperature = 40;
		 humidity = 90;
		 lights = 600;
		 
		 sensors sens = new sensors();
		 onOffСontrol newControl = new onOffСontrol();
		 control change = new control();
		 
		    onOffСontrol.massege query = newControl.new massege(); 
		 
		 if (((maxTemperature > temperature)&&(minTemperature<temperature))&&((maxHumidity>humidity)&&(minHumidity<humidity))&&((maxLights>lights)&&(minLights<lights))){
			sens.outSensor();
			
			 
		 }
		 else
		 {
			 newControl.error();
			 query.message1();
		 }
		
		
		
		System.out.println("виберете что хотите зделать");
		int exit = 1;
		while(exit!=0){
		Scanner scan= new Scanner(System.in);
        int vik=scan.nextInt();
		
       switch (vik){
		
		case 1:{change.chengeTemperature(temperature);
				
		
		
		break;
		}
				
		case 2:{System.out.println("виберете пункт 2");
		change.chengeHumidity(humidity);
		break;
		}
			
		case 3:{System.out.println("виберете пункт 3");
		change.chengeLights(lights);
		
		break;
		}
			
		case 4:{System.out.println("вихід");
		
		exit = 0;
		break;
		}

       }
		
		}
	
	
	
	}

}
