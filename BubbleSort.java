
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		//bubbleSorting(arr);
		//bubbleSorting2(arr);
		
		bubbleSorting3(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	//冒泡排序法;
	public static void bubbleSorting(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	/*
	 * 改进的冒泡排序算法一,
	 * 里面一层循环在某次扫描中没有执行交换，则说明此时数组已经全部有序列，无需再扫描了。
	 * 因此，增加一个标记，每次发生交换，就标记，如果某次循环完没有标记，则说明已经完成排序
	 * 
	 * */
	public static void bubbleSorting2(int[] arr){
		
		boolean bSwaped = true;
		for(int i = 0; i < arr.length - 1; i++){
			
			bSwaped = false;
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					
					bSwaped = true;
				}
			}
			
			if(!bSwaped){      //如果bSwaped为false,说明已经完成排序了;
				break;
			}
		}
	}
	
	/*
	 * 改进的冒泡排序算法2;
	 *在第一步优化的基础上发进一步思考：如果R[i..n]已是有序区间，上次的扫描区间是R[0..i]，
	 *记上次扫描时最后一次执行交换的位置为endPos，则endPos在0与i之间，
	 *不难发现R[endPos...n]区间也是有序的，否则这个区间也会发生交换；
	 *所以下次扫描区间就可以由R[0..i] 缩减到[0..endPos]。
	 * */
	public static void bubbleSorting3(int[] arr){
	
     	boolean bSwaped = false;
		int endPos = arr.length - 1;  //最后一个未排序的元素下标;
		while(endPos > 0){

			bSwaped = false;
			int pos = 0;
			for(int j = 0; j < endPos; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					
					bSwaped = true;    //说明排序还木有完成;
					pos = j;
				}
			}
			
			if(!bSwaped){
				break;        //已经排好序，不需要进行后续的排序操作了;
			}
			
			endPos = pos;
		}	
	}
	
}
