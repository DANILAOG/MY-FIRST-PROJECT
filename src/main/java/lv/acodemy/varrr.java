package lv.acodemy;

import java.util.Arrays;

public class varrr {
    public static void main(String[] args) {
        //byte data_type
        byte myCurrentAge = 22;
        System.out.println(myCurrentAge);

        //short data_type
        short salaryPreMonth = 1000;
        System.out.println(salaryPreMonth);

        // char data_type
        char firstNameLetter = 'D' ;
        System.out.println(firstNameLetter);

        // int data_type
        int dateOfBirth = 121200 ;
        System.out.println(dateOfBirth);

        //long data_type
        long populationOfLatvia = 180000;
        System.out.println("LOOSERS " + populationOfLatvia);

        //float data_type
        float LapTime = 32.07F;
        System.out.println("O4ENJ BISTRO" + LapTime);

        //double data_type
        double weight = 87.2;
        System.out.println("My weight " + weight);

        //boolean is; has
        boolean isWinter = false;
        boolean isSpring = true;
        boolean AreUGAy = true;
        System.out.println(AreUGAy);

        //String
        String name = "DanilaOG ";
        String surname = "Cajevskis";

        // Concatenation
        String fullname = name + "" + surname;
        System.out.println(fullname);

        String fullNameWithAge = fullname +" "+ myCurrentAge;
        //System.out.println(DanilaOG);
        //Danila Cajevskis22

        System.out.printf("My full name is: %s. Iam %d years old ", fullname, myCurrentAge);

        // *
        int a = 10;
        int b = 4;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println(20 * 10);
        // /
        double result = (double) a / b;
        System.out.println(c);

        //%
        int number = 10 % 9;
        System.out.println(number);

        int[] numberrs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString( numberrs));
    }
}
