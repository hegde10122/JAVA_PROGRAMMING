package inheritance_09;

/**
 * Created by User on 19-11-2016.
 */
public class BasePlusCommissionEmployee1 extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee1(String firstName, String lastName,
                                       String panCardNumber, double grossSales, double commissionRate) {
        //explicit call to superclass CommissionEmployee constructor
        super(firstName, lastName, panCardNumber, grossSales, commissionRate);


        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        //if base salary less than zero throw exception
        if(baseSalary < 0.0)
            throw  new IllegalArgumentException("base salary must be greater than zero");

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + (getGrossSales()*getCommissionRate());
    }

    @Override
    public String toString(){

        //private superclass memebers cannot be accessed in a subclass

        /* return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f","commission employee",firstName,lastName,
                "pan number",panCardNumber,"gross sales",grossSales,"commission rate",commissionRate);*/

        return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f","commission employee",getFirstName(),getLastName(),
                "pan number",getPanCardNumber(),"gross sales",getGrossSales(),"commission rate",getCommissionRate());
    }
}
/*
* Each subclass constructor must implicitly or explicitly call one of its superclass's constructors to
* initialise the instance variables inherited from the superclass. Keyword "super" is used for this call. super is
* followed by a set of parentheses containing the superclass constructor arguments, which are used to
* instantiate the superclass instance variables. If the subclass does not invoke the constructor of teh superclass
* explicitly then the compiler would attempt to insert a call to the superclass's default or no-argument
 * constructor. The explicit superclass constructor call must be the first line in the constructor of the sub-class.
 * When a superclass contains a no-argument constructor, you can use super() to call that constructor explicitly but that
 * is rarely done.
* */