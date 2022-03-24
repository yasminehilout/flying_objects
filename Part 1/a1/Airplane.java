package a1;
// -----------------------------------------------------
// Assignment #2
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * Airplane class.
 * @author Yasmine Hilout & Suha Abubakr
 * @version 1.1
 *
 */
public class Airplane {
	protected String brand;
	protected Double price;
	protected int horsepower;
	
	/**
	 * Default constructor, it sets an Airplane object with random values.
	 */
	public Airplane() {
		this.brand ="boeing";
		this.price = 123500690.00;
		this.horsepower = 1341;
	}
	
	/**
	 * Parameterized constructor, it sets an Airplane object with inputed values.
	 * @param brand the brand is a characteristic of the Airplane class
	 * @param price the price is a characteristic of the Airplane class
	 * @param horsepower the engine's horsepower is a characteristic of the Airplane class
	 */
	public Airplane(String brand, double price, int horsepower) {
		this.brand=brand;
		this.price=price;
		this.horsepower = horsepower;
	}
	
	/**
	 * Copy constructor, it instantiates object attributes with values of the object passed attributes
	 * @param a1 a1 is the object passed 
	 */
	public Airplane(Airplane a1){
		this.brand = new String(a1.brand);
		this.price = a1.price;
		this.horsepower=a1.horsepower;		
	}
	/**
	 * Clone method, it returns a deep copy of calling object: 
	 * it uses the class copy constructor.
	 * @return an object which is the exact copy of calling object
	 */
	public Airplane clone() {
		return new Airplane(this);
	}
	/**
	 * getBrand is a getter method of attribute brand.
	 * @return value of brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * setBrand is a setter method of attribute brand.
	 * @param brand the string of the Airplane brand name
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * getPrice is a getter method of attribute price.
	 * @return value of price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * setPrice is a setter method of attribute price.
	 * @param price is the double value of Airplane price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * getBrand is a getter method of attribute horsepower.
	 * @return value of horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	/**
	 * setHorsepower is a setter method of attribute horsepower.
	 * @param horsepower is the integer value of the Airplane's horsepower
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * The toString method supplies information of Airplane object.
	 * @return the information of the Airplane object
	 */
	public String toString() {
		return "This Airplaine is manufactured by "+ this.brand+"."
				+ " It's price is "+this.price+" and has a "
				+ this.horsepower+" horsepower.";
	}
	
	/**
	 * The equals method verifies if passed object is equal to calling object.
	 * @param a a is the passed object
	 * @return a boolean value; true if all attributes and class is equal, 
	 * false if not.
	 */
	public boolean equals(Airplane a){
		if(a==null)
			return false;
		else if(getClass()!=a.getClass())
			return false;
		else {
			return this.brand.equals(a.brand)&&
					this.price==a.price&&
					this.horsepower == a.horsepower;
		}
	}
	
	

}
