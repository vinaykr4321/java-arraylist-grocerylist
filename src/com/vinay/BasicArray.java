package com.vinay;

import java.util.Scanner;

public class BasicArray {
    private static int[] basearray = new int[10];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please Enter 10 numbers : ");
        getInput();
        printArray(basearray);
        resizeArray();
//        System.out.println("Now you can enter 12 numbers : ");
//        getInput();
        System.out.println("Enter 11th number : ");
        basearray[10] = scanner.nextInt();
        System.out.println("Enter 12th number : ");
        basearray[11] = scanner.nextInt();
        printArray(basearray);
    }

    private static void getInput(){
        for (int i = 0; i < basearray.length; i++){
            basearray[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print("Data on array number "+(i+1)+" is = "+array[i]+" \n");
        }
    }

    private static void resizeArray(){
        int[] orignal = basearray;

        basearray = new int[12];
        for (int i = 0; i < orignal.length; i++){
            basearray[i] = orignal[i];
        }
    }
}
