import java.security.SecureRandom;

public class RollDice{

private static final int DICE_TRHOWN = 6000000;


public static void main(String[] args){

SecureRandom sc = new SecureRandom();

//frequency of 1 to 6 rolled is stored in the array slots from 0 to 5
int[] frequency = new int[6]; //0 to 5 indices

for(int y = 0;y < DICE_TRHOWN;y++){
    int face = sc.nextInt(6);//produce a random number from 0 to 5 (first six indices)
    ++frequency[face];//increment the corresponding counter
}

System.out.println("Face\tFrequency");
System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
        frequency[0],frequency[1],frequency[2],frequency[3],frequency[4],frequency[5]);
}
}
