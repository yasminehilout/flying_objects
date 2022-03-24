package UAVchild;
import UAVs.*;
// -----------------------------------------------------
// Assignment #2
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * AgriculturalDrone class
 * @author Yasmine Hilout and Suha Abubakr
 * @version 1.1
 */

public class AgriculturalDrone extends  UAV {
    private String brand;
    private int carryCapacity;

    /**
     * Default constructor sets the brand to DJI
     * and the carryCapacity to 16. It also calls the
     * default constructor of its super class (UAV).
     */
    public AgriculturalDrone()
    {
        super();
        this.brand = "DJI";
        this.carryCapacity = 16;
    }

    /**
     * Parametrized constructor that initializes the brand
     * and carry capacity to the ones given. Since it doesn't take
     * any parameters for the super constructor, the default super
     * constructor is called.
     * @param brand the brand of the Agricultural Drone
     * @param carryCapacity the maximum amount (in kg) that the drone can carry
     */
    public AgriculturalDrone(String brand, int carryCapacity)
    {
        super();
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    /**
     * Parametrized constructor that initializes the weight, price, brand,
     * and carry capacity. It calls the super constuctor to initialize the weight
     * and price.
     * @param weight the weight (in kg) of the drone
     * @param price the price (in CAD) of the drone
     * @param brand the brand of the drone
     * @param carryCapacity the maximum amount (in kg) that the drone can carry
     */
    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity)
    {
        super(weight,price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    /**
     * Parametrized constructor that initializes the weight, brand, and carry capacity
     * of the object. It calls the corresponding super constructor (which takes the weight)
     * @param weight the weight (in kg) of the drone
     * @param brand the brand of the drone
     * @param carryCapacity the maximum amount (in kg) that the drone can carry
     */
    public AgriculturalDrone(double weight, String brand, int carryCapacity)
    {
        super(weight);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    /**
     * Copy constuctor that uses accessors since the variables
     * of Agricultural drones are set to private
     * @param drone the Agricultural Drone object to be copied
     */
    public AgriculturalDrone(AgriculturalDrone drone)
    {
        super(drone.weight,drone.price);
        this.brand = new String(drone.getBrand());
        this.carryCapacity = drone.getCarryCapacity();
    }

    /**
     * Accessor method for the String brand
     * @return a String representing the brand
     */
    public String getBrand()
    {
        return brand;
    }

    /**
     * Accessor method for integer carryCapacity
     * @return an integer representing the carry Capacity
     */
    public int getCarryCapacity()
    {
        return carryCapacity;
    }

    /**
     * Setter method for the String brand
     * @param brand the new brand
     */
    public void  setBrand(String brand)
    {
        this.brand = brand;
    }

    /**
     * Setter method for the int carryCapacity
     * @param carryCapacity the new carry capacity
     */
    public void setCarryCapacity(int carryCapacity)
    {
        this.carryCapacity = carryCapacity;
    }

    /**
     * toString returns the information of the Agricultural drone
     * @return String representation of the information of the drone
     */
    public String toString()
    {
        return "This Agricultural Drone is manufactured by " + brand + ", weighs " + this.getWeight() + "kg, can carry up to "
                + this.carryCapacity + "kg, and costs $" + this.getPrice();

    }

    /**
     * equals method checks if two Agricultural drones are equal
     * @param drone the object to be compared to
     * @return true or false based on whether the attributes of the two drones are equal or not
     */
    public boolean equals(AgriculturalDrone drone)
    {
        if(drone == null) return false;
        else if (getClass()!=drone.getClass()) return false;
        else return super.equals(drone) && this.brand.equalsIgnoreCase(drone.getBrand()) && this.carryCapacity == drone.getCarryCapacity();
    }


}
