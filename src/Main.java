import java.util.Date;

public class Main {



    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {

        return numberOne * numberTwo;
    }

    public static int multiplyTreeNumbers(int numberOne, int numberTwo, int numberTree) {

        return numberOne * numberTwo * numberTree;

    }

    public static double divisionTwoNumbers(double numberOne, double numberTwo) {
        return numberOne / numberTwo;

    }


    public static  void getCurrentDateTime ( ) {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    public static void main(String[] args) {




        int sum = multiplyTwoNumbers(3, 5);
        System.out.println(sum);
        int sum2 = multiplyTreeNumbers(2, 6, 8);
        System.out.println(sum2);

        double sum3 = divisionTwoNumbers(3, 2);
        System.out.println(sum3);
    getCurrentDateTime();

    }

}