package a2;

import UAVchild.AgriculturalDrone;
import UAVchild.MAV;
import UAVs.UAV;
import opters.Helicopter;
import opters.Quadcopter;
import rotor.Multirotor;


//-----------------------------------------------------
//Assignment #2, part II
//Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
//-----------------------------------------------------
/**
* Driver class  
* @author Yasmine Hilout and Suha Abubakr
* @version 1.1
*
*/

public class Driver2 {
	
	
	/**
     * The copyFlyingObjects method takes an Object array
     * containing different flying objects (UAVs, Helicopters, etc...), 
     * it should copy every object from that array into a new array of the same length.
     * @param objectsAll  the object array to be copied
     * @return an Object array, copyObjectsAll, with the same length as the given array and containing a copy of each object
     * returns null if the array is empty or null
     */
    public static FlyingObjs [] copyFlyingObjects(FlyingObjs[] objectsAll)
    {
        if(objectsAll == null || objectsAll.length == 0) return null;
        FlyingObjs[] copyObjectsAll = new FlyingObjs[objectsAll.length];
        for(int i = 0; i < objectsAll.length;i++)
        {
            copyObjectsAll[i] = objectsAll[i].copyMethod(objectsAll[i]);
        }
        return copyObjectsAll;
    }
    
    /**
     * The main method creates an array of 15 objects from the 7 classes, 
     * the copyFlyingObjects() method is then called.
     * @param args
     */
    public static void main(String[] args) {

        // Declaring and Initializing the flying objects
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane("Airbus",5500000.54,31);
        Airplane a3 = new Airplane("Embraer",6000000.54,27);
        Airplane a4 = new Airplane(a3);
        Helicopter h1 = new Helicopter(45,1987,10,"Boeing",70000.00,50);
        Helicopter h2 = new Helicopter(50,2001,20,"Airbus",8000.000,60);
        Helicopter h3 = new Helicopter(h1);
        Quadcopter q1 = new Quadcopter();
        Quadcopter q2 = new Quadcopter(10,1999,25,"Boeing",50100.00,55,67);
        Quadcopter q3 = new Quadcopter(20,2003,10,"Airbus",50100.25,30,87);
        Quadcopter q4 = new Quadcopter(q3);
        Multirotor m1 = new Multirotor(30,1978,15,"Embraer",60000.00,70,10);
        Multirotor m2 = new Multirotor(23,1977,10,"Airbus",50000.00,45,6);
        Multirotor m3 = new Multirotor(32,1988,34,"Boeing",57000.00,50,8);
        Multirotor m4 = new Multirotor(m1);
        UAV u1 = new UAV(5,5000);
        UAV u2 = new UAV(8,7000);
        AgriculturalDrone ag1 = new AgriculturalDrone(2,5600,"Delair",10);
        AgriculturalDrone ag2 = new AgriculturalDrone(ag1);
        MAV ma1 = new MAV(6,8000,"TF-IN220",16);
        MAV ma2 = new MAV(7,9000,"TQ-IG20",13);

        //Array of FlyingObjects
        FlyingObjs [] objectsAll = {a1,a2,a3,a4,h1,h2,h3,q1,q2,q3,q4,m1,m2,m3,m4,u1,u2,ag1,ag2,ma1,ma2};

        // Copying objectsAll into a new array copyObjectsAll
        FlyingObjs [] copyObjectsAll = copyFlyingObjects(objectsAll);
        
        //Prints the content of copyObjectsAll using toString
        for(FlyingObjs drone : copyObjectsAll)
        {
            System.out.println(drone.toString());
        }
    }

}
