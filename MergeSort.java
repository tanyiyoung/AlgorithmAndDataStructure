package com.ty.mergeSort;

/*
 * �鲢����;
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
		
		int mid = low + (high - low) / 2;		//��ֹ���;
		if(low < high){
			mergeSort(arr, low, mid);          //�ݹ飬���ź���ߵ�˳��;
			mergeSort(arr, mid + 1, high);		//���ź��ұߵ�˳��;
			
			merge(arr, low, mid, high);		//merge����;
		}
		
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		
		int[] tmp = new int[high - low + 1];
		//��ָ��;
		int left = low;
		//��ָ��;
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
		
		for(int i = 0; i < tmp.length; i++) {  		//����ʱ���������arr���飬���к����Ĵ���;
	            arr[i + low] = tmp[i];  
	    }  
	
	}
}
