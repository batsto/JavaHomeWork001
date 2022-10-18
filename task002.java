package javaHomeWorks.JawaHomeWorks001;

import java.util.Random;

//Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class task002 {
    public static void Sort(int[] arr){
        int len = arr.length;
        for(int i = len/2-1; i >= 0; i--){
            Heap(arr, len, i);
        }
        for(int i = len-1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heap(arr, i, 0);
        }
    }
    public static void Heap (int arr[], int len, int i){
        int largest  = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left < len && arr[left] > arr[largest]) largest = left;
        if(right < len && arr[right] > arr[largest]) largest = right;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heap(arr, len, largest);
        }
    }
    public static void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ", ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  r.nextInt(100);
        }
        printArray(arr);
        Sort(arr);
        printArray(arr);
        
    }
}
