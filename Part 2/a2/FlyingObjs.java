package a2;
// -----------------------------------------------------
// Assignment #2, part II
// Written by: Yasmine Hilout (40214158) and Suha Abubakr (40120785)
// -----------------------------------------------------

/**
 * FlyingObjs class is used to group the Airplane and UAV classes
 * under one superclass
 */
public abstract class FlyingObjs {

   /**
    * copyMethod is an abstract method that calls the copy constructor of
    * the corresponding child class according to how it is overridden
    * @param objs the flying object to be coppied
    * @return a copy of the flying object passed
    */
   protected abstract FlyingObjs copyMethod(FlyingObjs objs);

}
