package UAVchild;
import UAVs.*;
import a2.FlyingObjs;

// -----------------------------------------------------
// Assignment #2, part II
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * MAV class
 * @author Suha Abubakr and Yasmine Hilout
 * @version 1.1
 */

public class MAV extends UAV{
    private String model;
    private double size;

    
    /**
	 * copyMethod overrides the superclass method, it 
	 * calls the copy constructor of the class and 
	 * typecasts the Flying Object to the class type MAV type.
	 * @param drone is the object in the original array that we'd like to copy
	 * @return MAV object which is the copy of the inputed object
	 */
	public MAV copyMethod(FlyingObjs drone) {
		return new MAV((MAV)drone);
	}
    
    
    /**
     * Default constructor sets the model to TQ-IG270
     * and the size to 5cm. It also calls the
     * default constructor of its super class (UAV).
     */
    public MAV()
    {
        super();
        this.model = "TQ-IG270";
        this.size = 5;
    }

    /**
     * Parametrized constructor initializes the model and size to
     * the ones given and calls the default super constructor since
     * no variables for it have been passed.
     * @param model the model of the MAV
     * @param size the size/diameter (cm) of the MAV
     */
    public MAV(String model, double size)
    {
        super();
        this.model = model;
        this.size = size;
    }

    /**
     * Parametrized constructor calls the super constructor to
     * initialize the weight and price and initializes the model and
     * size.
     * @param weight the weight of the drone (kg)
     * @param price the price of the drone (CAD)
     * @param model the model of the MAV
     * @param size the size/diameter (cm) of the MAV
     */
    public MAV (double weight, double price, String model, double size)
    {
        super(weight,price);
        this.model = model;
        this.size = size;
    }

    /**
     * Parametrized constructor that initializes the weight, model, and size
     * of the object. It calls the corresponding super constructor (which takes the weight)
     * @param weight the weight of the drone (kg)
     * @param model the model of the MAV
     * @param size the size/diameter (cm) of the MAV
     */
    public MAV (double weight, String model, double size)
    {
        super(weight);
        this.model = model;
        this.size = size;
    }

    /**
     * Copy constructor
     * @param drone the MAV to be copied
     */
    public MAV (MAV drone)
    {
        super(drone.getWeight(),drone.getPrice());
        this.model = drone.getModel();
        this.size = drone.getSize();
    }

    /**
     * Accessor method for the model variable
     * @return the model (String) of the MAV
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Accessor method for the size variable
     * @return the size (double) of the MAV
     */
    public double getSize()
    {
        return size;
    }

    /**
     * Mutator method for the model variable
     * @param model the new model (String) of the MAV
     */
    public void setModel(String model)
    {
        this.model = model;
    }

    /**
     * Mutator method for the model variable
     * @param size the new size (double) of the MAV
     */
    public void setSize(double size)
    {
        this.size = size;
    }

    /**
     * toString returns the information of the MAV drone
     * @return String representation of the information of the drone
     */
    public String toString()
    {
        return "This " + this.model + " MAV is " + this.size + "meters in diameter. It weighs " + this.getWeight() + " kgs and costs $" + this.getPrice() + ".";
    }

    /**
     * equals method checks if two MAV drones are equal
     * @param drone the object to be compared to
     * @return true or false based on whether the attributes of the two drones are equal or not
     */
    public boolean equals(MAV drone)
    {
        if(drone == null) return false;
        else if (getClass()!=drone.getClass()) return false;
        else return super.equals(drone) && this.model.equalsIgnoreCase(drone.getModel()) && this.size == drone.getSize();
    }

}
