package ie.atu.week4;

public class arraydemo {
    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        myNumbers[0] = 100;
        myNumbers[1] = 200;
        myNumbers[2] = 300;
        myNumbers[3] = 400;
        myNumbers[4] = 500;
        myNumbers[5] = 600;
        myNumbers[6] = 700;
        myNumbers[7] = 800;
        myNumbers[8] = 900;
        myNumbers[9] = 1000;

        for(int i = 0; i < myNumbers.length; i++){

            System.out.printf("index %d : %d \n" ,i, myNumbers[i]);// printf instead of println

        }
    }

}
