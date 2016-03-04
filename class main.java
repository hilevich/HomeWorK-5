/**
 * Створити консольну систему управління домашньою оранжереєю;
 * 1. В oранжереї можна регулювати температуру, вологість, освітлення;
 * 2. Включення і виключення опалення, поливу і освітлення повинно бути автоматизовано;
 * 3. у випадку якщо відповідні датчики показують перевищення або пониження
заданих параметрів – повинно відправлятись відповідне повідомлення на
мобільний телефон власника оранжереї;
 * 4. Необхідна система підтримання життєзабезпечення саджанців має увімкнутися для відновлення
комфортного рівня;
 * 
 * @version 1.0
 * @author Yura
*/


package greenhouse;


import java.util.Scanner;






public class main {
	public static void main(String[] args) {
	
		// changes initialization
		double temperature, humidity, lights;
		
		double maxTemperature = 60, maxHumidity= 100, maxLights=500;
		
		double minTemperature = 18, minHumidity= 60, minLights=300;
		
		// random vale
		
		 temperature = 50;
		 humidity = 90;
		 lights = 1000;
		 
		 //constructor classes
		 
 		 
		 onOffСontrol newControl = new onOffСontrol();
		 control change = new control();
		 control.sensorsPrint sensorsPrintVale = change.new sensorsPrint();
		
		
		 
		 // massege vale of greenhouse else change vale and sent SMS 
		    onOffСontrol.massege onOffControlMassage = newControl.new massege(); 
		 
		    // if all vale be true sent vale to console
		 if ((maxTemperature > temperature)&&(minTemperature<temperature)&&(maxHumidity>humidity)&&(minHumidity<humidity)&&(maxLights>lights)&&(minLights<lights))
		 {
			 
			System.out.println("vale of greenhouse is:");
			sensorsPrintVale.valeTemperature(temperature);
			sensorsPrintVale.valeHumidity(humidity);
			sensorsPrintVale.valeLights(lights);
			
			 
		 }
		 else
		 { 
		 
			if (!(maxTemperature > temperature)&&(minTemperature<temperature)){
			double	outTemperature = temperature;
				temperature = newControl.changeValeTemperature(temperature, minTemperature, maxTemperature);
				onOffControlMassage.messageTemperature(outTemperature, temperature);
			
			}
			
			if(!(maxHumidity>humidity)&&(minHumidity<humidity)){
			double	outHumidity = humidity;
			 humidity = newControl.changeValeHumidity(humidity, minHumidity, maxHumidity);
			 onOffControlMassage.messageHumidity(outHumidity, humidity);
			 
			 
			 }
			
			if(!(maxLights>lights)&&(minLights<lights))
				{
				double	outLights = lights;
			 lights = newControl.changeValeLights(lights, minLights, maxLights);
			 onOffControlMassage.messageLights(outLights, lights);
			 
			}
			 
		 }
		
		
		 
		 // out menu to display
		 
		System.out.println("1 - change temperature; 2 - change humidity; 3 - change lights; 4 - vale of greenhouse: 5 - exit ");	
		System.out.println("take your chose:");
		
		
		int exit = 1;
		//do something while user not chose exit
		while(exit!=0){
		//	try{
			
		Scanner scan= new Scanner(System.in);
        int vik;
        if(scan.hasNextInt()){
        	vik=scan.nextInt();
			if (vik>5||vik <1)
			{
				System.out.println("your chose don't true");
			}
    
        switch (vik){
		//change vale of temperature 
        			case 1:{System.out.println("1 - your chose change temperatur:");
        			temperature = change.changeTemperature(minTemperature, maxTemperature, temperature);
        			System.out.println("\nteke your next chose");
        				break;
        			}
        //change vale of humidity
        				case 2:{System.out.println("2 - your chose change humidity");
        				humidity = change.changeHumidity(minHumidity, maxHumidity, humidity);
        				System.out.println("\nteke your next chose");
        				break;
        			}
        //change vale of lights
        				case 3:{System.out.println("3 - your chose change lights");
        				lights = change.changeLights(minLights, minLights, lights);
        				System.out.println("\nteke your next chose");
        				break;
        			}
		// show to display vale of temperature, humidity, lights;
        				case 4:{System.out.println("4 - your chose vale of greenhouse:");
        				sensorsPrintVale.valeTemperature(temperature);
        				sensorsPrintVale.valeHumidity(humidity);
        				sensorsPrintVale.valeLights(lights);
        				System.out.println("\nteke your next chose");
        				break;
        				}
        	// exit			
        			    case 5:{System.out.println("5 - your chose exit");
		
        			    exit = 0;
        			    break;
        			 }

        		}
        }else{
        	System.out.println("your enter not true vale");
        }
			}/*catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "your enter not true vale");
			}
		}*/
		
			
		}
		
	
	
	}


