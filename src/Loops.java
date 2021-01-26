public class Loops {

    public static void main(String[] args) {
        // write your code here
        double moneyInWallet = 4.50;

        double costOfMilk = 1.99;

        if (moneyInWallet >= costOfMilk * 2) {

            System.out.println("Let's buy two gallons.");

        } else if (moneyInWallet >= costOfMilk) {

            System.out.println("Let's buy one gallon.");

        } else {

            System.out.println("Way too expensive!");

        }

//        int x = 0;
//        while (x <= 100)
//        {
//            System.out.println("The value of x is:" + x);
//            x+=2;
//        }
//int y = 100;
//        while (y >= 0)
//        {
//            System.out.println("The value of y is:" + y);
//            y-=3;
//        }

//        for (int z = 1; z < 101; z+=2) {
//            System.out.println("The value of z is:" + z);
//        }

        for (int h = 1; h <= 100; h++) {
            if (h%2 != 0) {
//                System.out.println("Hello");
                System.out.println("The value of h is:" + h);

            }
//            System.out.println("The value of h is:" + h);

        }

//        if (h % 5 == 0) {
//            System.out.println("World");
//        }
//        if (h % 5 == 0 && h % 3 == 0) {
//            System.out.println("HelloWorld");
//        }

    }
}
