/**
 * A Simplified model of a sheep.
 */
public interface Sheep {
    
	/** 
	 * describes the primary function of the brain of a sheep : think (somehow). 
	 */
    public interface Brain {
		public void think(Sheep.Body body,Sheep[] herd);
    }
    
    /**
     * describes the body of a sheep as it can be controlled from its brain.
     */
    public interface Body extends Sheep {
        /** sets the direction to steer to */
    	public void setDirection(double d);
        /** sets the direction to steer to based on the specified point */
    	public void setDirectionTo(double x,double y);
        /** sets the speed (0..1) */
		public void setSpeed(double d);
    }
    
    /** returns the x position of the sheep */
    public double getPositionX();
    /** returns the y position of the sheep */
    public double getPositionY();
    
    /** returns the direction of the sheep (0..360) */
    public double getDirection();
    /** returns the speed of the sheep (0..1) */
    public double getSpeed();
    
    /** returns the distance between this sheep and the other */
    public double range(Sheep s);
    /** returns the direction in which the other sheep lies (-180..180) */
    public double direction(Sheep s);
    
	/** returns the direction in which the specified point (-180..180) */
    public double direction(double x,double y);
	/** returns the distance between this sheep and the specified point */
    public double range(double x,double y);

}
