import java.util.Arrays;

/*
 *øÏ≈≈;
 * */

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {0, 5, 6, 4, 1, 7, 2, 3};
		
		int left = 0;
		int right = arr.length - 1;
		
		quickSort(arr, left, right);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void quickSort(int[] arr, int left, int right){
		
		if(right <= left){
			return ;
		}else{
			int point = arr[right];
			int partition = partition(arr, left, right, point);
			quickSort(arr, left, partition - 1);
			quickSort(arr, partition + 1, right);
			
		}
		
	}
	
	public static int partition(int[] arr, int left, int right, int point){
		int leftPtr = left - 1;
		int rightPtr = right;
		
		while(true){
			
			while(leftPtr < rightPtr && arr[++leftPtr] < point);
			while(leftPtr < rightPtr && arr[--rightPtr] > point);
			
			if(leftPtr >= rightPtr){
				break;
			}else{
				int tmp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = tmp;
			}
		}
		
		int tmp = arr[leftPtr];
		arr[leftPtr] = arr[right];
		arr[right] = tmp;
		
		
		return leftPtr;
	}
}
