package inheritance_09;

/**
 * Created by User on 19-11-2016.
 * This class BasePlusCommissionEmployee represents an employee who receives a base salary in addition to
 * commission.
 */
public class BasePlusCommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String panCardNumber;
    private double grossSales;//gross weekly sales
    private double commissionRate; //commission percentage
    private double baseSalary;//base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String panCardNumber,
                                      double grossSales, double commissionRate,double baseSalary) {

        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
        setBaseSalary(baseSalary);
        this.firstName = firstName;
        this.lastName = lastName;
        this.panCardNumber = panCardNumber;
    }

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

        //if gross sales is invalid throw exception
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        //if base salary less than zero throw exception
        if(baseSalary < 0.0)
            throw  new IllegalArgumentException("base salary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    public double earnings(){
        return getBaseSalary() + (getCommissionRate() * getGrossSales());
    }

    @Override
    public String toString(){

        return String.format("%s: %s %s%n%s : %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","commission employee",firstName,lastName,
                "pan number",panCardNumber,"gross sales",grossSales,"commission rate",commissionRate,"base salary",baseSalary);
    }

}
