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
				
		if (temIndicator && humIndicator && ligIndicator) {
			indicatorStatus[0] = true;
			indicatorStatus[1] = true;
			indicatorStatus[2] = true;			
		} else if (temIndicator && humIndicator && !ligIndicator) {
			indicatorStatus[0] = true;
			indicatorStatus[1] = true;
			indicatorStatus[2] = false;
		} else if (temIndicator && !humIndicator && !ligIndicator) {
			indicatorStatus[0] = true;
			indicatorStatus[1] = false;
			indicatorStatus[2] = false;
		} else if (!temIndicator && !humIndicator && !ligIndicator) {
			indicatorStatus[0] = false;
			indicatorStatus[1] = false;
			indicatorStatus[2] = false;
		} else if (!temIndicator && !humIndicator && ligIndicator) {
			indicatorStatus[0] = false;
			indicatorStatus[1] = false;
			indicatorStatus[2] = true;
		} else if (!temIndicator && humIndicator && ligIndicator) {
			indicatorStatus[0] = false;
			indicatorStatus[1] = true;
			indicatorStatus[2] = true;
		} else if (temIndicator && !humIndicator && ligIndicator) {
			indicatorStatus[0] = false;
			indicatorStatus[1] = true;
			indicatorStatus[2] = false;
		} else if (!temIndicator && humIndicator && !ligIndicator) {
			indicatorStatus[0] = false;
			indicatorStatus[1] = true;
			indicatorStatus[2] = false;
		}	
		new onOffControl.message().messageSMS(indicatorStatus);
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
			System.out.println("SMS sent!");
		}
	}


	public double changeValeTemperature(double temperature) {
		// TODO Auto-generated method stub	
		return temperature;
	}


	public double changeValeHumidity(double humidity) {
		// TODO Auto-generated method stub
		return humidity;
	}


	public double changeValeLights(double lights) {
		// TODO Auto-generated method stub
		return lights;
	}



}
