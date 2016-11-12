public class CommonMath{

  /*
  There are methods that do not depend on an object. Such a method applies to the class in which it is declared as a whole
  and is known as a static method or a class method.
  "static" methods are used to perform common tasks. To declare a method as static we place the keyword "static" before the
  return type in the method's declaration. For any class imported into your program, you can call the class's static methods
  by specifying the name of the class in which the method is declared. followed by a dot (.) and the method name.

  ClassName.methodName(arguments)

  In the example below we will discuss the Math class from the java.lang package. We do not have to explicitly create an object
  for the Math class because its methods are static.
  */


public static void main(String[] args){

//square root method that accepts an argument of type double and returns a value of type double which is the square root
System.out.println(Math.sqrt(625.0));

//argument type - double and return type is double which is the absolute value
System.out.println(Math.abs(12.8));
System.out.println(Math.abs(-12.3));
System.out.println(Math.abs(-0.0)); //note -0.0 **

//pow method takes takes takes two double arguments x and y and returnes x raised to power of y
System.out.println(Math.pow(3,-8));
System.out.println(Math.pow(3.44,8.12));

//floor method - rounds x to the largest integer not greater than x
System.out.println(Math.floor(-12.6));
System.out.println(Math.floor(12.16));

//ceil method - rounds the argument x to the smallest integer not less than x
System.out.println(Math.ceil(12.8));
System.out.println(Math.ceil(-12.348));

//log -- calculates the natural logarithm of x (base e)
System.out.println(Math.log(14));

//max (x,y) - finds the larger value of x and y
System.out.println(Math.max(13.67,-14.55));

//min (x,y) - finds the smaller value of x and y
System.out.println(Math.min(10,11.22));

//calculates the sine value of x where x is in radians
System.out.println(Math.sin(0.0));

//calculates the triginometric cosine value of x where x is in radians
System.out.println(Math.cos(90.0));

//calculates the trigonometric tangent value of x where x is in radians
System.out.println(Math.tan(-90));

//calculates the exponential value e^x
System.out.println(Math.exp(3.6));

//calculates area of a circle whose radius is 15 units -- Math.PI is a high-precision approximation to the mathematical constant PI
System.out.println(Math.PI * 15 * 15);

//base value for natural logarithm is E
System.out.println(Math.E);

//The above two math constants are defined in the Math package with the modifiers public,static and final
//static declaration allows them to be used by using the Math class followed by the dot(.) operator and public makes them accessible in any class
//final means that they are constant values
}
}
