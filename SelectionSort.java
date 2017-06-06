import java.util.Arrays;

/*
 * 选择排序;
 * 
 * */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		
		int k = 0;    //k用于记录排除前(i + 1)个元素剩下的元素的最小值;
		for(int i = 0; i < arr.length; i++){
			k = i;
			
			//框架搭建起来之后,然后就是最主要的找出排除前(k+1)个剩下的元素的最小值;
			for(int j = i; j < arr.length; j++){
				if(arr[j] < arr[k]){
					k = j;
				}
				
			}
			
			int tmp = arr[k];
			arr[k] = arr[i];
			arr[i] = tmp;
			
		}
		
	}	
}