package inheritance_09;

/**
 * Created by User on 19-11-2016.
 */
public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee bm = new BasePlusCommissionEmployee("Shweta","Rajguru","BQNQM4213H",9000,0.5,15000);

        System.out.printf("Employee information is %s%n",bm.toString());
        System.out.printf("Employee earnings INR %.5f%n",bm.earnings());


        BasePlusCommissionEmployee1 bm1 = new BasePlusCommissionEmployee1("Nagesh","Palekar","CWMPM4826K",6000,0.9);

        System.out.printf("Employee information is %s%n",bm1.toString());
        System.out.printf("Employee earnings INR %.5f%n",bm1.earnings());
    }
}
