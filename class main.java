package greenhouse;


import java.util.Scanner;

import javax.swing.JOptionPane;



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
		 
		    onOffСontrol.massege onOffControlMassage = newControl.new massege(); 
		 
		 if (((maxTemperature > temperature)&&(minTemperature<temperature))&&((maxHumidity>humidity)&&(minHumidity<humidity))&&((maxLights>lights)&&(minLights<lights))){
			System.out.println("vale of greenhouse is:");
			 sens.valeTemperature();
			 sens.valehumidite();
			 sens.valeLight();
			
			 
		 }
		 else
		 {
			
			 temperature = newControl.changeValeTemperature(temperature);
			 humidity =newControl.changeValeHumidity(humidity);
			 lights = newControl.changeValeLights(lights);
			 onOffControlMassage.message1();
		 }
		
		
		System.out.println("1 - change temperature; 2 - change humidity; 3 - change lights; 4 - exit ");
		System.out.println("take your chose:");
		int exit = 1;
		while(exit!=0){
			try{
		Scanner scan= new Scanner(System.in);
        int vik=scan.nextInt();
			if (vik>4||vik <0)
			{
				System.out.println("your chose don't true");
			}
    
        switch (vik){
		
        			case 1:{System.out.println("1 - your chose change temperatur:");
        				change.changeTemperature(temperature);
			
        				break;
        			}
				
        				case 2:{System.out.println("2 - your chose change humidity");
        				change.changeHumidity(humidity);
        				break;
        			}
			
        				case 3:{System.out.println("3 - your chose change lights");
        				change.changeLights(lights);
		
        				break;
        			}
			
        			    case 4:{System.out.println("4 - your chose exit");
		
        			    exit = 0;
        			    break;
        			 }

        		}
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "your enter not true vale");
			}
		
		}
		
			
		}
		
	
	
	}


