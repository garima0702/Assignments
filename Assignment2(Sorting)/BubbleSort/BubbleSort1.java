//package Sorting;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
		int[] arr = {5,3,7,1,9};
		
		System.out.println(Arrays.toString(BubbleSort1.bSort(arr)));
		
	}
	public static int[] bSort(int[] arr) {
		for(int i =0; i<arr.length-1;i++) {
			boolean b=false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					b=true;
				}
				
				}
			if(b==false) {
				break;
			}
		}
		return arr;
	}
}