package com.dsa;

import java.util.Scanner;

public class Utils {

    /**
     * Takes two input
     * 1. No of elements in array
     * 2. Elements
     *
     * and returns integer array.
     * */
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int[] input = new int[n];
        for (int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }

        return  input;
    }
}
