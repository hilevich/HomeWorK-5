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
		
		
		System.out.println("1 - change temperature; 2 - change humidity; 3 - change lights; 4 - vale of greenhouse: 5 - exit ");
		System.out.println("take your chose:");
		
		
		int exit = 1;
		while(exit!=0){
			try{
		Scanner scan= new Scanner(System.in);
        int vik=scan.nextInt();
			if (vik>5||vik <=1)
			{
				System.out.println("your chose don't true");
			}
    
        switch (vik){
		
        			case 1:{System.out.println("1 - your chose change temperatur:");
        			temperature = change.changeTemperature(temperature);
			
        				break;
        			}
				
        				case 2:{System.out.println("2 - your chose change humidity");
        				humidity = change.changeHumidity(humidity);
        				break;
        			}
			
        				case 3:{System.out.println("3 - your chose change lights");
        				lights = change.changeLights(lights);
		
        				break;
        			}
			
        				case 4:{System.out.println("4 - vale of greenhouse:");
        				sens.valeTemperature();
        				sens.valehumidite();
        				sens.valeLight();
        				break;
        				}
        				
        			    case 5:{System.out.println("5 - your chose exit");
		
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
