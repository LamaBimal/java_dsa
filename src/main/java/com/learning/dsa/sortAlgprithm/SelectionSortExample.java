package com.learning.dsa.sortAlgprithm;

import java.util.Arrays;

public class SelectionSortExample {
    public void printArray(int []array){
        System.out.println(Arrays.toString(array));
    }

    public void sort(){
        int [] array = {5, 7, 8, 1, 3, 8};

        for(int index = 0; index<array.length; index++){
            int minIndex = index;

            for (int loop=index+1;loop<array.length-1; loop++){
                if(array[loop]< array[minIndex]){
                    minIndex = loop;
                }
            }

            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;
        }

        printArray(array);
    }

    public static void main(String[] args){
        System.out.println("Selection Sorting Algorithm");
        SelectionSortExample object = new SelectionSortExample();
        object.sort();
    }
}
