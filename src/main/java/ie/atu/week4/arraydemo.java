package ie.atu.week4;

import java.util.Scanner;
import java.util.ArrayList;

public class arraydemo {
    public static void main(String[] args) {
        Scanner index10  = new Scanner(System.in);
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(100);
        myNumbers.add(200);
        myNumbers.add(300);
        myNumbers.add(400);
        myNumbers.add(500);
        myNumbers.add(600);
        myNumbers.add(700);
        myNumbers.add(800);
        myNumbers.add(900);
        myNumbers.add(1000);

        for(int i = 0; i < myNumbers.size(); i++) {
            System.out.printf("index %d : %d \n", i, myNumbers.get(i) );// printf instead of println
        }

        System.out.println("enter a new number" );// prompt user for new number
        int scan = index10.nextInt();
        myNumbers.add(scan);// adds the users input to array list

        for(int i = 0; i < myNumbers.size(); i++) {
            System.out.printf("index %d : %d \n", i, myNumbers.get(i) );// printf instead of println
        }




        // when using set arrays
        /*for(int i = 0; i < myNumbers.length; i++){

            System.out.printf("index %d : %d \n" ,i, myNumbers[i]);// printf instead of println

        }
        System.out.println("enter a number");
        int number = index10.nextInt();
        myNumbers[10]=number;
        for(int i = 0; i < myNumbers.length; i++){

            System.out.printf("index %d : %d \n" ,i, myNumbers[i]);// printf instead of println

        }*/
    }

}
