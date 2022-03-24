package rotor;

import opters.Helicopter;
// -----------------------------------------------------
// Assignment #2
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * Multirotor class is a Helicopter which is an Airplane.
 * @author yasmine hilout  soha 
 * @version 1.1
 *
 */
public class Multirotor extends Helicopter{
	
	private int numOfRotors;
	
	/**
	 * Default constructor, it sets a Multirotor object with random values and
	 * refers to superclass default constructor
	 */
	public Multirotor() {
		super();
		this.numOfRotors = 2;
	}
	
	/**
	 * Parameterized constructor, it sets a Multirotor object with inputted values.
	 * @param numCylinders number of cylinders is a characteristic inherited from the Helicopter class
	 * @param creationYear the creation year is a characteristic inherited from the Helicopter class
	 * @param passCapacity the passenger capacity is a characteristic inherited from the Helicopter class
	 * @param brand the brand is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param price the price is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param horsepower the engine's horsepower is a characteristic inherited from superclass Helicopter which inherited it from its superclass Airplane
	 * @param numOfRotors the numOfRotors is a Multirotor class attribute.
	 */
	public Multirotor(int numCylinders, int creationYear, int passCapacity, 
			String brand, double price, int horsepower, int numOfRotors){
		super(numCylinders, creationYear, passCapacity, brand, 
				price, horsepower);
		this.numOfRotors=numOfRotors;
	}
	
	/**
	 * Copy constructor, it instantiates object attributes with values of the object passed attributes
	 * @param m m is the object passed 
	 */
	public Multirotor(Multirotor m){
		this.brand = new String(m.brand);
		this.price = m.price;
		this.horsepower = m.horsepower;
		this.numCylinders = m.numCylinders;
		this.creationYear = m.creationYear;
		this.passCapacity = m.passCapacity;
		this.numOfRotors = m.numOfRotors;
	}
	/**
	 * Clone method, it returns a deep copy of calling object: 
	 * it uses the class copy constructor and is overridden from superclass.
	 * @return an object which is the exact copy of calling object
	 */
	public Multirotor clone() {
		return new Multirotor(this);
	}
	/**
	 * The toString method is overridden from superclass.
	 * @return the information of the Multirotor object
	 */
	public String toString() {
		return "This Multirotor is manufactured by "+ this.brand+"."
				+ " It's price is "+this.price+" and has a "
				+ this.horsepower+" horsepower. It was created in "+
				creationYear+", has "+numCylinders+"cylinders, it can"+
				"accomodate "+passCapacity+"passangers at a time and"
						+ "has "+numOfRotors+" rotors.";
	}
	/**
	 * The equals method is overridden from superclass, it verifies
	 * if passed object is equal to calling object.
	 * @param m m is the passed object
	 * @return a boolean value; true if all attributes and class is equal, 
	 * false if not.
	 */
	public boolean equals(Multirotor m){
		if(m==null)
			return false;
		else if(getClass()!=m.getClass())
			return false;
		else {
			return this.numCylinders == m.numCylinders &&
					this.creationYear==m.creationYear &&
					this.passCapacity == m.passCapacity &&
					this.brand.equals(m.brand) &&
					this.price== m.price&&
					this.horsepower == m.horsepower&&
			        this.numOfRotors == m.numOfRotors;
		}
	}
	
    /**
     * getNumOfRotors is a getter method of the attribute numOfRotors
     * @return value of numOfRotors
     */
	public int getNumOfRotors() {
		return numOfRotors;
	}
    /**
     * setNumOfRotors is a setter method for the attribute numOfRotors
     * @param numOfRotors value of numOfRotors
     */
	public void setNumOfRotors(int numOfRotors) {
		this.numOfRotors = numOfRotors;
	}
	

}
