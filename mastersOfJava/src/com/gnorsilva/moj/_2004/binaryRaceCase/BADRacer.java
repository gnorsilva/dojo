package com.gnorsilva.moj._2004.binaryRaceCase;

public class BADRacer implements Racer {
	
	@SuppressWarnings("unused")
	private int initialPosition;
	private int targetPosition;
	
	@Override
	public void start(int initialPosition, int targetPosition){
		this.initialPosition = initialPosition;
		this.targetPosition = targetPosition;
	}
	
	@Override
	public int decide(int currentPosition, int speed, int fuel) {
		int distanceToTarget = targetPosition - currentPosition;
		int distanceToStop = calculateDistanceToStop(speed);
		int fuelToStop = getFuelToStop(speed);
		
		if (fuel < fuelToStop 
				| currentPosition + distanceToStop > MINES_RIGHT
				| currentPosition + distanceToStop < MINES_LEFT) {
			return GIVEUP;
		}
		
		if ((fuel - 1) < fuelToStop) {
			return speed < 0 ? AHEAD : REVERSE;
		}
		
		
		if ( speed > 0 ){
			if (distanceToStop > (distanceToTarget - speed) ) {
				return REVERSE;
			}	
		}
		
		if (speed < 0) {
			if (distanceToStop > (distanceToTarget - speed)
					& fuel - 2 > fuelToStop + 2) {
				return REVERSE;
			}

			if (distanceToStop > (distanceToTarget - speed)
					& fuel - 2 < fuelToStop + 2) {
				return DONOTHING;
			}

			if (fuel - 2 >= fuelToStop - 1) {
				return AHEAD;
			}
		}
		
		if (calculateDistanceToStop(speed * 2) >= distanceToTarget - (speed * 2) ||
				fuel - 2 < fuelToStop + 2) {
			return DONOTHING;
		}
		
		if (calculateDistanceToStop(speed * 2) <= distanceToTarget - (speed * 2)) {
			return AHEAD;
		}
		
		return -1;
	}
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}
	
	protected int calculateDistanceToStop(int speed) {
		int distance = 0;
		speed /= 2;
		while (speed != 0) {
			distance += speed;
			speed /= 2;
		}
		return distance;
	}
	
	protected int log2(double num) {
		return (int) (Math.log(num) / Math.log(2));
	}

	public int getFuelToStop(int speed) {
		speed = speed < 0 ? speed * -1 : speed;
		return (log2(speed * 2)) * 2;
	}
	
}		
