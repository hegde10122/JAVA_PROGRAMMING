import java.util.Scanner;

/**
 * Created by User on 12-11-2016.
 */
public class MinimumValue {

    int y = 9;
    public static void main(String[] args) {

        //create scanner for input from command-window
        Scanner scanner = new Scanner(System.in);

        //prompt the user and read 4 input values as floting-point decimal values
        System.out.println("Enter 4 floating-point numbers separated by spaces");

        double x1 = scanner.nextDouble();//read first double
        double x2 = scanner.nextDouble();//read 2nd double
        double x3 = scanner.nextDouble();//read 3rd double
        double x4 = scanner.nextDouble();//read 4th double

        double result = minimum(x1,x2,x3,x4);
        System.out.println("The minimum value is "+result);

        //another possible infinite loop!! if the below line is uncommented and the program re-compiled and run!!!
        // new MinimumValue().main( new String[]{"12"});

    }

    /*
    method minimum is private meaning it cannot be accessed by another other class except MinimumValue
    the method is static which allows it to be called by the main method which is also static
    It returns a double value and accepts 4 arguments of type double each. The arguments are separated by commas.
    When the method minimum is called (line 21), the parameters a1,a2,a3 and a4 are initialised with copies of
    x1,x,x3 and x4 respectively.

    There must be one argument in the method call for each parameter in the method declaration. The type of arguments
    in the method call must exactly match the type of the corresponding parameter.

    To determine the minimum we initially assume that there is only one value a1. a1 is assigned to the "min" variable.
    Since we have only one value as per our initial assumption the min is a1 (line 40).

    Using the math class which provides the in-built min method we compare the min value with a2 and return the
    minimum of a1 and a2 back to min. Similar procedure is used on lines 46 and 47 that finally provides the
    minimum value amongst the 4 values.

    At line number 53, the minimum value is returned back to the mehod call at line 21. This minimum value is
    printed to the console at line 22.

    When the program control returns back to the point in the program where minimum was called, the paramaeters
    a1,a2,a3 and a4 no longer exist in memory.

    Methods can return atmost one value but it can also also return a reference to an object that consists of many
     values
    */

    private static double minimum(double a1,double a2,double a3,double a4){
        double min = a1;

        min = Math.min(a1,a2);
        min = Math.min(min,a3);
        min = Math.min(min,a4);

        //calling the main method --- possible --- infinite loop!!!
        //main(new String[] {"14","17"});
        return min;
    }
}//end class
