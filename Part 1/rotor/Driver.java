package rotor;


import UAVchild.AgriculturalDrone;
import UAVchild.MAV;
import UAVs.UAV;
import a1.Airplane;
import opters.Helicopter;
import opters.Quadcopter;

// -----------------------------------------------------
// Assignment #2, part I
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------
/**
 * Driver class
 * @author Yasmine Hilout and Suha Abubakr
 * @version 1.1
 */

public class Driver {

    /**
     * main method handles the initialization of
     * 21 objects and the calling of other methods
     * @param args
     */
    public static void main(String[] args) {

        // Declaration and initialization of 21 flying objects
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane("Airbus",5500000.00,31);
        Airplane a3 = new Airplane("Embraer",6000000.76,27);
        Airplane a4 = new Airplane(a3);
        Helicopter h1 = new Helicopter(45,1987,10,"Boeing",7000000.0,50);
        Helicopter h2 = new Helicopter(50,2001,20,"Airbus",8000000.88,60);
        Helicopter h3 = new Helicopter(h1);
        Quadcopter q1 = new Quadcopter();
        Quadcopter q2 = new Quadcopter(10,1999,25,"Boeing",5010000.87,55,67);
        Quadcopter q3 = new Quadcopter(20,2003,10,"Airbus",5010025.87,30,87);
        Quadcopter q4 = new Quadcopter(q3);
        Multirotor m1 = new Multirotor(30,1978,15,"Embraer",6000000.78,70,10);
        Multirotor m2 = new Multirotor(23,1977,10,"Airbus",5000000.77,45,6);
        Multirotor m3 = new Multirotor(32,1988,34,"Boeing",5700000.65,50,8);
        Multirotor m4 = new Multirotor(m1);
        UAV u1 = new UAV(5,5000);
        UAV u2 = new UAV(8,7000);
        AgriculturalDrone ag1 = new AgriculturalDrone(2,5600,"Delair",10);
        AgriculturalDrone ag2 = new AgriculturalDrone(ag1);
        MAV ma1 = new MAV(6,8000,"TF-IN220",16);
        MAV ma2 = new MAV(7,9000,"TQ-IG20",13);

        // three Object arrays
        // Objects1 holds 15 objects, Objects2 holds no UAV objects, and ObjectsAll
        // holds all 21 objects
        Object [] objects1 = {a1,a2,a3,h1,h2,q1,q2,m1,m2,u1,u2,ag1,ag2,ma1,ma2};
        Object [] objects2 = {a1,a2,a3,a4,h1,h2,h3,q1,q2,q3,q4,m1,m2,m3,m4};
        Object [] objectsAll = {a1,a2,a3,a4,h1,h2,h3,q1,q2,q3,q4,m1,m2,m3,m4,u1,u2,ag1,ag2,ma1,ma2};

        // Welcome message
        System.out.println("----------------------------------");
        System.out.println("     COMP 249 Assignment 2");
        System.out.println("  Yasmine Hilout & Suha Abubakr");
        System.out.println("----------------------------------");
        System.out.println("This program has 21 flying objects\nTheir information is presented below:\n");
        // displaying the information of all 21 flying objects
        for(Object drone: objectsAll)
        {
            System.out.println(drone.toString() + "\n");
        }

        // Testing the equality of objects
        System.out.println("----------------------------------");

        // Two objects from different classes
        System.out.println("Now the program will test the equality of:\n" + "Two objects from different classes (Airplane 1 and Helicopter 1):");
        System.out.println("Are Airplane 1 and Helicopter 1 equal? " + (a1.equals(h1) ? "yes" : "no"));

        // Two objects from the same class with different values
        System.out.println("Two Objects from the same class with different values (Quadcopter 1 and 2):");
        System.out.println("Are Quadcopter 1 and Quadcopter 2 equal? " + (q1.equals(q2) ? "yes" : "no"));

        // Two objects from the same class with similar values
        System.out.println("Two Objects from the same class with similar values (Quadcopter 3 and 4):");
        System.out.println("Are Quadcopter 3 and Quadcopter 4 equal? " + (q3.equals(q4) ? "yes" : "no"));
        System.out.println("----------------------------------");

        // findLeastAndMostExpensiveUAV method on objects1 and objects2
        System.out.println("Now the program will execute the findLeastAndMostExpensiveUAV method with arrays 1 and 2");

        // Passing objects1 as a parameter
        System.out.println("The method with array 1 as a parameter:");
        findLeastAndMostExpensiveUAV(objects1);
        System.out.println();

        // Passing objects2 as a parameter
        System.out.println("The method with array 2 as a parameter:");
        findLeastAndMostExpensiveUAV(objects2);
        System.out.println();

        // Closing Message
        System.out.println("----------------------------------");
        System.out.println(" This is the end of the program!");
        System.out.println("     COMP 249 Assignment 2");
        System.out.println("  Yasmine Hilout & Suha Abubakr");
        System.out.println("----------------------------------");

    }

    /**
     * findLeastAndMostExpensiveUAV() takes an object array
     * and prints the information of the most and least expensive UAVs if found
     * @param objects an array of type Object
     */
    public static void findLeastAndMostExpensiveUAV(Object[] objects)
    {
        // count variable to count number of UAVs in the given array
        int count = 0;
        for(int i = 0; i < objects.length;i++)
        {
            if(objects[i] instanceof UAV)
            count++;
        }
        if(count == 0)
        {
            System.out.println("No UAVs found");
        }
        else if (count == 1)
        {
            UAV [] UAVs = new UAV[1]; // Initializing array for the UAV object
            for(int j = 0; j < objects.length; j++)
            {
                if(objects[j] instanceof UAV)
                {
                    UAVs[0] = (UAV) objects[j];
                }
            }
            System.out.println("The Information of the most and least expensive UAV:\n" + UAVs[0].toString());
        }
        else
        {
            int mostExpensiveIndex = 0;
            int CheapeastIndex = 0;
            int num = 0;
            UAV[] UAVs = new UAV[count]; // Initializing array for the UAV objects
            for(int j = 0; j < objects.length; j++)
            {
                if(objects[j] instanceof UAV)
                {
                    UAVs[num] = (UAV) objects[j];
                    num++;
                }
            }

            // Finding the indices of the least and most expensive UAV
            for(int k = 0; k < UAVs.length; k++)
            {
                if(UAVs[k].getPrice() > UAVs[mostExpensiveIndex].getPrice())
                    mostExpensiveIndex = k;
                if(UAVs[k].getPrice() < UAVs[CheapeastIndex].getPrice())
                    CheapeastIndex = k;
            }

            // Printing the information of the least and most expensive UAV
            System.out.println();
            System.out.println("The Information of the most expensive UAV:\n" + UAVs[mostExpensiveIndex].toString());
            System.out.println();
            System.out.println("The Information of the least expensive UAV:\n" + UAVs[CheapeastIndex].toString());
            System.out.println();
        }
    }
}
