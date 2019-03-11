package ru.mephi.module02;

import java.util.Scanner;

public class BinaryCalc{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Input first binary number:");
        String x = read.nextLine();
        int xbin = Integer.parseInt(x,2);

        System.out.print("Input second binary number:");
        String y = read.nextLine();
        int ybin = Integer.parseInt(y,2);
        
        String productbin = Integer.toBinaryString(xbin*ybin);

        System.out.printf("Product = %s%n", productbin);
    
    }
}