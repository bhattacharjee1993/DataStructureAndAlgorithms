package Algorithms.sorting;

import com.dsa.Utils;

public class SelectionSort {

    //This method makes use of the Utils class to get the input from the user.
    public static void process(){
        int[] input =Utils.takeInput();
        sortElements(input);
    }

    //used for sorting the elements
    public static void sortElements(int[] input){

        int n = input.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (input[j] < input[min_idx])
                    min_idx = j;


            int temp = input[min_idx];
            input[min_idx] = input[i];
            input[i] = temp;
        }
        printOutput(input);
    }

    //prints the sorted element
    public static void printOutput(int sorted[])
    {
        int n = sorted.length;
        for (int i=0; i<n; ++i)
            System.out.print(sorted[i]+" ");
        System.out.println();
    }
}
