package inheritance_09;

/**
 * Created by User on 20-11-2016.
 */
public class BaseCommissionEmployee2 extends CommissionEmployee1 {

    private double baseSalary;//base salary per week

    public BaseCommissionEmployee2(String firstName, String lastName,
                                   String panCardNumber, double grossSales, double commissionRate,double baseSalary) {
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
        return baseSalary + (commissionRate*commissionRate);
    }

    //returns the string representation of the employee
    @Override
    public String toString(){

        return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f%n%s: %.2f ","commission employee",firstName,lastName,
                "pan number",panCardNumber,"gross sales",grossSales,"commission rate",commissionRate,"base salary",baseSalary);
    }
}
/*
* We declared superclass instance variables
*
* */