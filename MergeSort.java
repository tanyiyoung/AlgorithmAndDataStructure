package com.ty.mergeSort;

/*
 * 归并排序;
 * */

import java.util.Arrays;


public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {10, 2, 8, 6, 4, 7, 3, 9, 1, 5};   
	    System.out.println(Arrays.toString(arr));  
	    mergeSort(arr, 0, arr.length-1);  
	    System.out.println(Arrays.toString(arr));  

	}

	public static void mergeSort(int[] arr, int low, int high) {
		
		int mid = low + (high - low) / 2;		//防止溢出;
		if(low < high){
			mergeSort(arr, low, mid);          //递归，先排好左边的顺序;
			mergeSort(arr, mid + 1, high);		//再排好右边的顺序;
			
			merge(arr, low, mid, high);		//merge操作;
		}
		
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		
		int[] tmp = new int[high - low + 1];
		//左指针;
		int left = low;
		//右指针;
		int right = mid + 1;
		int k = 0;
		
		while(left <= mid && right <= high){
			if(arr[left] < arr[right]){
				tmp[k++] = arr[left++];
			}else{
				tmp[k++] = arr[right++];
			}
		}
		
		while(left <= mid){
			tmp[k++]  = arr[left++];
		}
		
		while(right <= high){
			tmp[k++] = arr[right++];
		}
		
		for(int i = 0; i < tmp.length; i++) {  		//将临时数组规整导arr数组，进行后续的处理;
	            arr[i + low] = tmp[i];  
	    }  
	
	}
}
