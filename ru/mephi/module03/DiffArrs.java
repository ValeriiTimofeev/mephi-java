package ru.mephi.module03;

import java.util.*;

public class DiffArrs{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Input number of elements in array\n");
        int Size = read.nextInt();
        int[] array = new int[Size];

        for(int i=0; i<Size; i++){
            System.out.print("Input element of array and press 'enter'\n");
            array[i] = read.nextInt();
        }

        Arrays.sort(array);
        int Diff;
        Diff = array[Size-1] - array[0];
        System.out.printf("Difference between max and min elements is: %d\n", Diff);       
    }
}
