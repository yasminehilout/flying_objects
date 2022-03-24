package opters;
// -----------------------------------------------------
// Assignment #2
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * Quadcopter class is a Helicopter which is an Airplane: 
 * It is the child class of Helicopter and the grandchild class of Airplane.
 * @author Yasmine Hilout & Suha Abubakr
 * @version 1.1
 *
 */
public class Quadcopter extends Helicopter{
	
	private int maxFlyinSpeed;
	
	/**
	 * Default constructor, it sets a Quadopter object with random values and
	 * refers to superclass default constructor
	 */
	public Quadcopter() {
		super();
		this.maxFlyinSpeed=14500;
	}
	
	/**
	 * Parameterized constructor, it sets a Multirotor object with inputted values.
	 * @param numCylinders number of cylinders is a characteristic inherited from the Helicopter class
	 * @param creationYear the creation year is a characteristic inherited from the Helicopter class
	 * @param passCapacity the passenger capacity is a characteristic inherited from the Helicopter class
	 * @param brand the brand is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param price the price is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param horsepower the engine's horsepower is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param maxFlyinSpeed the maxFlyinSpeed of the Quadcopter
	 */
	public Quadcopter(int numCylinders, int creationYear, int passCapacity, 
			String brand, double price, int horsepower, int maxFlyinSpeed){
		super(numCylinders, creationYear, passCapacity, brand, 
				price, horsepower);
		this.maxFlyinSpeed=maxFlyinSpeed;
	}
	/**
	 * Copy constructor, it instantiates object attributes with values of the object passed attributes
	 * @param q q is the Quadcopter object passed 
	 */
	public Quadcopter(Quadcopter q){
		this.brand = new String(q.brand);
		this.price = q.price;
		this.horsepower = q.horsepower;
		this.numCylinders = q.numCylinders;
		this.creationYear = q.creationYear;
		this.passCapacity = q.passCapacity;
		this.maxFlyinSpeed = q.maxFlyinSpeed;
	}
	/**
	 * Clone method, it returns a deep copy of calling object: 
	 * it uses the class copy constructor and is overridden from superclass.
	 * @return an object which is the exact copy of calling object
	 */
	public Quadcopter clone() {
		return new Quadcopter(this);
	}
	/**
	 * getMaxFlyinSpeed is a getter method of the class attribute maxFlyinSpeed.
	 * @return value of maxFlyinSpeed
	 */
	public int getMaxFlyinSpeed() {
		return maxFlyinSpeed;
	}
	/**
	 * setMaxFlyinSpeed is a setter method of the class attribute maxFlyinSpeed.
	 * @param maxFlyinSpeed value of the maximum flying speed
	 */
	public void setMaxFlyinSpeed(int maxFlyinSpeed) {
		this.maxFlyinSpeed = maxFlyinSpeed;
	}
	/**
	 * The toString method is overridden from superclass.
	 * @return the information of the Quadcopter object
	 */
	public String toString() {
		return "This Quadcopter is manufactured by "+ this.brand+"."
				+ " It's price is "+this.price+" and has a "
				+ this.horsepower+" horsepower. It was created in "+
				creationYear+", has "+numCylinders+"cylinders, it can"+
				"accomodate "+passCapacity+"passangers at a time and"
						+ "has maximum flying speed of "+maxFlyinSpeed+".";
	}
	/**
	 * The equals method is overridden from superclass, it verifies
	 * if passed object is equal to calling object.
	 * @param q q is the passed Quadcopter object
	 * @return a boolean value; true if all attributes and class is equal, 
	 * false if not.
	 */
	public boolean equals(Quadcopter q){
		if(q==null)
			return false;
		else if(getClass()!=q.getClass())
			return false;
		else {
			return this.numCylinders == q.numCylinders &&
					this.creationYear==q.creationYear &&
					this.passCapacity == q.passCapacity &&
					this.brand.equals(q.brand) &&
					this.price== q.price&&
					this.horsepower == q.horsepower;
		}
	}
	
	

}
