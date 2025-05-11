package com.learning.dsa.sortAlgprithm;

import java.util.Arrays;

public class BubbleSortExample {
    public void printArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }

    public void sort(){
        int [] array = {5, 7, 8, 1, 3, 8};

        for(int i = 0; i < array.length; i++){
            boolean swapped = false; // Reset at the start of each iteration

            for (int j=0; j<array.length-i-1;j++){

                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]= array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
        printArray(array);
    }
    public static void main(String[] args) {
        BubbleSortExample example = new BubbleSortExample();
        example.sort();
    }
}