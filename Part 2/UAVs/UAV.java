package UAVs;

import a2.FlyingObjs;

// -----------------------------------------------------
// Assignment #2, part II
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * UAV class
 * @author Suha Abubakr and Yasmine Hilout
 * @version 1.1
 */

public class UAV extends FlyingObjs{
    protected double weight;
    protected double price;

    /**
	 * copyMethod overrides the superclass method, it 
	 * calls the copy constructor of the class and 
	 * typecasts the Flying Object to the class type UAV type.
	 * @param drone is the object in the original array that we'd like to copy
	 * @return a UAV object which is the copy of the inputed
	 */
	public UAV copyMethod(FlyingObjs drone) {
		return new UAV((UAV)drone);
	}
    
    /**
     * Default constructor initializes the weight to 2 kg and
     * the price to 300 CAD
     */
    public UAV()
    {
        this.weight = 2.0;
        this.price = 300;
    }

    /**
     * Parametrized constructor that initializes the weight to what is given
     * and calculates the price
     * @param weight the weight of the drone (kg)
     */
    public UAV (double weight)
    {
        this.weight = weight;
        price = weight*500;
    }

    /**
     * Parametrized constructor that initializes the weight and price to what
     * is given
     * @param weight the weight of the drone (kg)
     * @param price the price of the drone (CAD)
     */
    public UAV (double weight, double price)
    {
        this.weight = weight;
        this.price = price;
    }

    /**
     * Copy Constructor
     * @param drone the UAV to be copied
     */
    public UAV (UAV drone)
    {
        this.weight = drone.weight;
        this.price = drone.price;
    }

    /**
     * Accessor method for the weight variable
     * @return double weight of the UAV
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Accessor method for the price variable
     * @return double variable representing the price of the UAV
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Mutator method for the weight of the UAV
     * @param weight the new weight of the UAV
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Mutator method for the price of the UAV
     * @param price the new price of the UAV
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * toString returns the information of the UAV drone
     * @return String representation of the information of the drone
     */
    public String toString()
    {
        return "This UAV weighs " + weight + " kg and costs $" + price + ".";
    }

    /**
     * equals method checks if two UAV drones are equal
     * @param drone the object to be compared to
     * @return true or false based on whether the attributes of the two drones are equal or not
     */
    public boolean equals(UAV drone)
    {
        if(drone == null) return false;
        else if (getClass()!=drone.getClass()) return false;
        else return this.weight == drone.getWeight() && this.price == drone.getPrice();
    }

	


}
