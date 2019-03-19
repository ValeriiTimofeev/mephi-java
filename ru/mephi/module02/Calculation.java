package ru.mephi.module02;

import java.util.Scanner;

public class Calculation{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Input first number:");
        double x = read.nextDouble();
        
        System.out.print("Input second number:");
        double y = read.nextDouble();

        System.out.printf("Sum = %.2f\nDifference = %.9f\nProduct =  %f\n", x+y, x-y, x*y);
        
        if(y==0){
            System.out.printf("Impossible to calculate a quotient: division by zero!\n");
        }
        else{
            System.out.printf("Quotient =  %f\n", x/y);
        }
    
    }
}