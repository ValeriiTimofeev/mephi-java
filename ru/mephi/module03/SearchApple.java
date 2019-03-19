package ru.mephi.module03;

import java.util.Scanner;
import java.io.*;

public class SearchApple{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Input string:");
        String str = read.nextLine();
        int position = str.indexOf("apple");
        if(position == 0 || position == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        } 
        
    }
}