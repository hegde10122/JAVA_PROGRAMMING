package inheritance_09;

//this always extends Object class -- no need to mention explicitly -- added implicitly by JVM
public class CommissionEmployee1 extends Object {

protected final String firstName;
protected final String lastName;
protected final String panCardNumber;
protected double grossSales;//gross weekly sales
protected double commissionRate; //commission percentage

/*
* protected instance variables the subclass gets access to the instance variables
* but classes that are not subclasses and classes that are not in the same package
* cannot access these variables directly - recall that protected class members are also
* visible to other classes in the same package.
* */


public CommissionEmployee1(String firstName, String lastName, String panCardNumber,
                           double grossSales, double commissionRate){

  //implicit call to Object's default constructor occurs here

  //if gross sales is invalid throw exception
  if(grossSales < 0.0)
      throw new IllegalArgumentException("Gross sales must be greater than or equal to 0");

  //if commission Rate is invalid throw exception
      if(commissionRate <= 0.0 || commissionRate >= 1.0)
          throw new IllegalArgumentException("Commsiion rate must be between 0.0 and 1.0");

      this.firstName = firstName;
      this.lastName = lastName;
      this.panCardNumber = panCardNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
}//constructor ends

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {

        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be greater than or equal to 0");



        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {

        //if commission Rate is invalid throw exception
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commsiion rate must be between 0.0 and 1.0");

        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return commissionRate * grossSales;
    }

    //return string representation of commissionEmployee object
    @Override //indicates that this method overrides a superclass method
    public String toString(){

        return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f","commission employee",firstName,lastName,
                "pan number",panCardNumber,"gross sales",grossSales,"commission rate",commissionRate);
    }

}//class ends

/*
extends stands for inheritance.

Constructor's are not inherited, so the class CommissionEmployee does not inherit class Object's Constructor.
However a superclass's constructors are still available to be called by the subclasses.

Java requires that the first task of any subclass constructor is to call its direct superclass's constructor
either explicitly or implicitly to ensure that the instance variables inherited from the superclass are
initialised properly. The superclass Object's default no-argument constructor is called implicitly in this example.
We can use regular expressions to validate pan number and also check the names to be of reasonable lengths.
The method earnings() calculates the CommissionEmployee's earnings.
MEthod toString() has been overriden because the Object class also has its own definition of toString() which is a
placeholder. To override a superclass method, a subclass must declare a method with the same signature - method name,
number of parameters, parameter types and order of parameter types - as the superclass method. Since the Object class's
toString() has no parameters, the subclass's toString() method also has no input parameters.

IMPORTANT
-----------
It is a compilation error to override a method with a more restricted access modifier - a public superclass method
cannot become a protected or private subclass method; a protected superclass method cannot become a private subclass method.
Doing so would break the is-a relationship, which requires that all subclass objects be able to respond to method calls
made to public methods in the superclass. If a public method could be overriden as a protected or private method, the
subclass objects would not be able to respond to the same method calls as superclass objects. Once a method is declared
public in a superclass, the method remains public for all that class's direct and indirect subclasses.
*/
