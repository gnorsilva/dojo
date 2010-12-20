package com.gnorsilva.moj._2004.binaryRaceCase;

public class BADRacer implements Racer {
	
	private int initialPosition;
	private int targetPosition;
	
	@Override
	public void start(int initialPosition, int targetPosition) {
		this.initialPosition = initialPosition;
		this.targetPosition = targetPosition;
	}
	
	@Override
	public int decide(int currentPosition, int speed, int fuel) {
		int distanceRemaining = targetPosition - currentPosition;
		int distanceToStop = calculateDistanceToStop(speed);
		int fuelToStop = (log2(speed * 2)) * 2;
		
		if (fuel < fuelToStop) {
			return GIVEUP;
		}
		
		if (distanceToStop > (distanceRemaining - speed) || (fuel - 1) <= fuelToStop) {
			return REVERSE;
		}
		
		if (calculateDistanceToStop(speed * 2) > distanceRemaining - (speed * 2) || fuel - 2 < fuelToStop + 2) {
			return DONOTHING;
		}
		
		if (calculateDistanceToStop(speed * 2) <= distanceRemaining - (speed * 2)) {
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
	
}
