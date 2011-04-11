package com.gnorsilva.moj._0_easypeasy.moonlandercase;


public class MoonLander {

	/**
	 * This method is called 10 times per second to reevaluate if the ship should engage its
	 * engines in order to land safely. 
	 * @param height in meters
	 * @param velocity in meters/sec
	 * @param fuel in litres (engines consume 10 litres of fuel per second when activated)
	 * @param gravity in meters/sec2
	 * @return true if the engines should be activated (accelerating with 10 meters/sec2)
	 */
	public boolean landShip(double height,double velocity,double fuel,double gravity) {
		boolean result = false;
		
		double accel = gravity/10;
		double thrust = 1 - accel;
		
		double distanceToStop = ( velocity * velocity ) / ( 2 * thrust); 
		double xtraDistance = ( velocity * velocity ) / ( 2 * accel);
		
		
		if( distanceToStop >= xtraDistance + height){
			result = true;
		}
		
		return result;
	}

}
