package inheritance_09;

/**
 * Created by User on 20-11-2016.
 */
public class BaseCommissionEmployee3 extends CommissionEmployee {

    private double baseSalary;//base salary per week

    public BaseCommissionEmployee3(String firstName, String lastName,
                                   String panCardNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, panCardNumber, grossSales, commissionRate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be greater than or equal to zero");

        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be greater than or equal to zero");

        this.baseSalary = baseSalary;
    }

    @Override //indicates that this overrides a superclass method
    public double earnings(){
        return baseSalary + super.earnings();
    }

    //returns the string representation of the employee
    @Override
    public String toString(){

        return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f%n%s: %.2f ",
                "commission employee",getFirstName(),getLastName(),
                "pan number",getPanCardNumber(),"gross sales",getGrossSales(),
                "commission rate",getCommissionRate(),"base salary",getBaseSalary());
    }
}
/*
* We declared superclass instance variables
*
* */