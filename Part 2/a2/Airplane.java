package a2;

//-----------------------------------------------------
//Part: (II)
//Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
//-----------------------------------------------------

/**
 * Airplane class.
 * @author Yasmine Hilout and Suha Abubakr 
 * @version 1.1
 *
 */
public class Airplane extends FlyingObjs{
	protected String brand;
	protected double price;
	protected int horsepower;
	
	/**
	 * copyMethod overrides the superclass method, it 
	 * calls the copy constructor of the class and 
	 * typecasts the Flying Object to the class type Airplane type.
	 * @param drone is the object in the original array that we'd like to copy
	 * @return an Airplane object which is the copy of the object passed
	 */
	protected Airplane copyMethod(FlyingObjs drone)
	{   return new Airplane((Airplane) drone);
	}
	
	
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
		this.horsepower= a1.horsepower;	
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
