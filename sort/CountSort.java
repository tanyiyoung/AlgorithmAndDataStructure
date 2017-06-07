
import java.util.Arrays;

/*
* 计数排序;
*
*/

public class CountSort {

	public static void main(String[] args) {
		
		int[] arr = {37, 77, 97, 2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};;
		System.out.println(Arrays.toString(arr));
		int[] sortArr = countSort(arr, 100);
		System.out.println(Arrays.toString(sortArr));
	}
	
	public static int[] countSort(int[] arr, int range){
		
		int count[] = new int[range];
		for(int i = 0; i < arr.length; i++){
			
			count[arr[i]]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		int sortArr[] = new int[arr.length];
		for (int i = 0; i < sortArr.length; i++) {
			count[arr[i]]--;
			sortArr[count[arr[i]]] = arr[i];
		}
		return sortArr;
			
		}

	}
