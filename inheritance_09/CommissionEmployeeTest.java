package inheritance_09;

public class CommissionEmployeeTest{

    public static void main(String[] args) {

        //instantiates CommissionEmployee object
        CommissionEmployee cm = new CommissionEmployee("Sagar","mahadev","AJMPM4872F",5001,0.7);

        System.out.printf("%s %s %s %n","Name is",cm.getFirstName(),cm.getLastName());
        System.out.printf("%s earnings received INR %.2f%n",cm.getFirstName()+" "+cm.getLastName(),cm.earnings());

        cm.setCommissionRate(0.3);
        cm.setGrossSales(8000);

        System.out.printf("%s %s %n%s %.2f","Update information is ",cm.toString(),"Earnings INR ",cm.earnings());

    }

}