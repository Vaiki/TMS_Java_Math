package com.company;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n//Task #1 Average\n");

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = Arrays.stream(arr).sum();
        int resultInt = sum / arr.length;
        double resultDouble = (double) sum / arr.length;
        double resultRemainder = resultDouble - resultInt;

        System.out.printf("Mean value of integer type = %d " +
                "\nMean value of double type =%.2f " +
                "\nRemainder = %.2f\n ", resultInt, resultDouble, resultRemainder);

        System.out.println("\n//Task #2 Math\n");

        double x = 0.25;
        double y = 0.9;

        double res1 = 10*x+y;
        double ySqrt = y*sqrt(x);
        double pow = Math.pow(x,y)-1;
        double sqrt = Math.sqrt(10.0);
        double hypotenuse = sqrt(Math.pow(5,2)+Math.pow(10,2));
        int abs = Math.abs(-30-40);
        System.out.printf("x = 0.25 y = 0.9\n10*x+y = %.2f\n" +
                "y*sqrt(x) = %.2f\n" +
                "Math.pow(x,y)-1 = %.2f\n" +
                "Math.sqrt(10) = %.2f\n" +
                "x = 5, y = 10, hypotenuse = %.2f\n" +
                "abs |-30-40| = %d\n",res1,ySqrt,pow,sqrt,hypotenuse,abs);

        System.out.println("\n//Task #3 Discount\n");



        int a = 1000;
        int b = 500;
        int discount = 10;
        double disPrice =a+b - percent(a,b,discount);
        System.out.println("#3.1\nDiscount price = "+disPrice+"\nDiscount = "+percent(a,b,discount));

        int a1 = 200;
        int a1Dis = 15;
        int countA1 = 10;
        int b1 = 30;
        int countB1 =2;

        double priceA1B1 = percent(a1,a1Dis,countA1,b1,countB1);
        System.out.println("\n#3.2\nA - 200, Dis - 15, B - 30, 10A+2B = "+priceA1B1);

        int a12 = 500;
        int a12Dis = 50;
        int countA12 = 7;
        int b12 = 50;
        int countB12 = 1;

        double priceA12B12 = percent(a12,a12Dis,countA12,b12,countB12);
        System.out.println("\n#3.3\nA - 500, Dis - 50, B - 50, 7A+1B = "+priceA12B12);

        int a13 = 300;
        int a13Dis = 10;
        int countA13 = 2;
        int b13 = 20;
        int countB13 = 3;

        double priceA13B13 = percent(a13,a13Dis,countA13,b13,countB13);
        System.out.println("\n#3.4\nA - 300, Dis - 10, B - 20, 2A+3B = "+priceA13B13);



    }

    public static double percent(int price1, int price2, int dis){
        return (double) (price1+price2)/100*dis;
    }
    public static double percent(int price1, int dis,int countA,int priceB,int countB){
        double x = (price1 -(double)price1/100*dis)*countA;
        double y = priceB*countB;
        return x+y;
    }
}
