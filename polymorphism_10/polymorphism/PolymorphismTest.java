package polymorphism_10.polymorphism;

import inheritance_09.BasePlusCommissionEmployee;
import inheritance_09.BasePlusCommissionEmployee1;
import inheritance_09.CommissionEmployee;

/**
 * Created by User on 04-12-2016.
 */
public class PolymorphismTest {

    public static void main(String[] args) {

        //assign superclass reference to superclass variable
        CommissionEmployee cm = new CommissionEmployee("Amar","tomar",
                "ASWDM2356G",25000.0,0.15);

        //assign subclass reference to subclass variable
        BasePlusCommissionEmployee1 bm = new BasePlusCommissionEmployee1("Deep","Tiwari",
                "ZXCVB5674S",36000,0.36);

        //invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n","Call commissionEmployee's toString with superclass reference ","to superclass object",
                cm.toString());

        //invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:%n%s%n%n","Call BasePlusCommissionEmployee's toString with subclass","reference to subclass object",
                bm.toString());

        //invoke toString on subclass object using superclass variable
        CommissionEmployee cm2 = bm;
        System.out.printf("%s %s:%n%s%n%n","Call BasePlusCommissionEmployee's toString with superclass","reference to subclass object",
                cm2.toString());
    }//end main
}

/*
* The example demonstrates three ways to use superclass and subclass variables to store references
* Lines 31-32 form the interesting part of this example.
* Here we assign the reference of the subclass object bm to a superclass cm2 variable. Line 33 invokes the toString()
* method. When a superclass variable contains a reference to a subclass object, and that reference is used to call a
* method, the subclass version of that method is called. The java compiler allows this "crossover" because an object of
* a subclass is an object of its superclass (but not vice-versa). When the compiler encounters a method call made through a
* variable, the compiler determines if the method can be called by by checking the variable's class type. If that class
* contains that proper method declaration (or inherits one) the call is compiled.
* At execution time, the type of the object to which the variable refers determines the actual method to use.
* This process is called dynamic binding.
* */

