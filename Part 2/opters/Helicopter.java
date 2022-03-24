package opters;

import a2.Airplane;
import a2.FlyingObjs;

// -----------------------------------------------------
// Assignment #2, part II
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * Helicopter class is a subclass of the Airplane class.
 * @author Yasmine Hilout and Suha Abubakr
 * @version 1.1
 *
 */
public class Helicopter extends Airplane {
	protected int numCylinders;
	protected int creationYear;
	protected int passCapacity;
	
	
	
	/**
	 * copyMethod overrides the superclass method, it 
	 * calls the copy constructor of the class and 
	 * typecasts the Flying Object to the class type Helicopter type.
	 * @param drone  is the object in the original array that we'd like to copy
	 * @return Helicopter object which is the copy of the inputed object
	 */
	protected Helicopter copyMethod(FlyingObjs drone) {
		return new Helicopter((Helicopter)drone);
	}
	
	
	/**
	 * Default constructor, it sets a Helicopter object with random values and
	 * refers to super default constructor.
	 */
	public Helicopter() {
		super( );
		this.numCylinders=4;
		this.creationYear=1995;
		this.passCapacity=3;
	}
	
	/**
	 * Parameterized constructor, it sets a Helicopter object with inputted values.
	 * @param numCylinders number of cylinders is an attribute of the class
	 * @param creationYear the creation year is an attribute of the class
	 * @param passCapacity the passenger capacity is an attribute of the class
	 * @param brand the brand is a an attribute inherited from its superclass Airplane
	 * @param price the price is an attribute inherited from superclass Airplane
	 * @param horsepower the engine's horsepower is an attribute inherited from superclassAirplane
	 */
	public Helicopter(int numCylinders, int creationYear, int passCapacity, 
			String brand, double price, int horsepower){
		super(brand, price, horsepower);
		this.numCylinders=numCylinders;
		this.creationYear=creationYear;
		this.passCapacity = passCapacity;
	}
	
	/**
	 * Copy constructor, it instantiates object attributes with values of the object passed attributes
	 * @param h h is the object of type Helicopter passed 
	 */
	public Helicopter(Helicopter h){
		this.brand = h.brand;
		this.price = h.price;
		this.horsepower = h.horsepower;
		this.numCylinders = h.numCylinders;
		this.creationYear = h.creationYear;
		this.passCapacity = h.passCapacity;
	}
	
	/**
	 * getNumCylinders is a getter method for the attribute numCylinders.
	 * @return value of numCylinders
	 */
	public int getNumCylinders() {
		return numCylinders;
	}
	/**
	 * setNumCylinders is a setter method for the attribute numCylinders.
	 * @param numCylinders passed value of numCylinders
	 */
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	/**
	 * getCreationYear is a getter method for the attribute creationYear.
	 * @return the value of creationYear
	 */
	public int getCreationYear() {
		return creationYear;
	}
	/**
	 * setCreationYear is a setter method for the attribute creationYear.
	 * @param creationYear passed value of creationYear
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * getPassCapacity is a getter method for attribute passCapacity.
	 * @return value of passenger Capacity
	 */
	public int getPassCapacity() {
		return passCapacity;
	}
	/**
	 * setPassCapacity is the setter method for attribute passCapacity
	 * @param passCapacity passed value of passenger capacity.
	 */
	public void setPassCapacity(int passCapacity) {
		this.passCapacity = passCapacity;
	}
	/**
	 * The toString method is overridden from superclass.
	 * @return the information of the Helicopter object
	 */
	public String toString() {
		return "This Helicopter is manufactured by "+ this.brand+"."
				+ " It's price is "+this.price+" and has a "
				+ this.horsepower+" horsepower. It was created in "+
				creationYear+", has "+numCylinders+"cylinders and can"+
				"accomodate "+passCapacity+"passangers at a time.";
	}
	/**
	 * The equals method is overridden from superclass, it verifies
	 * if passed object is equal to calling object.
	 * @param h h is the passed object
	 * @return a boolean value; true if all attributes and class is equal, 
	 * false if not.
	 */
	public boolean equals(Helicopter h){
		if(h==null)
			return false;
		else if(getClass()!=h.getClass())
			return false;
		else {
			return this.numCylinders == h.numCylinders &&
					this.creationYear==h.creationYear &&
					this.passCapacity == h.passCapacity &&
					this.brand.equals(h.brand) &&
					this.price== h.price&&
					this.horsepower == h.horsepower;
		}
	}

}
