package corejava;

/*
OUTPUT:

2
33
444
5555
66666

*/

import java.math.BigDecimal;

public class NumberSeries {


    public static void main(String args[]) {

         // Method 1: With System.out.print
         method1();

         // Method 2: Apply Mathematical Formula
         method2();
    }

    public static void method1(){

        for(int i = 2; i <= 5; i++) {

            for(int j = 1; j < i; j++) {

                System.out.print(i);

            }

            System.out.println();
        }
    }

    public static void method2(){

        double finalTotal = 0;

        for(int i = 2; i<= 5; i++){

            for(int j = i-1; j > 0; j--) {

                finalTotal = finalTotal + appendFormula(i, Math.pow(10,j-1));

            }

            System.out.println(new BigDecimal(finalTotal).stripTrailingZeros());
            finalTotal = 0;
        }

    }

    public static double appendFormula(int value, double times){

     return (value*times);

    }
}
