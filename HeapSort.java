
import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void heapSort(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			createMaxHeap(arr, arr.length - 1 - i);       //建立大根堆;
			swap(arr, 0, arr.length -1 - i);			//将堆顶元素置于最后;
		}
		
	}
	
	public static void createMaxHeap(int[] arr, int lastIndex){
		
		for(int i = (lastIndex - 1) / 2; i >=0; i--){     //最大的需要调整的位置为(lastIndex - 1) / 2;
			
			int k = i;
			while(2 * k + 1 <= lastIndex){
				
				int biggerIndex = 2 * k + 1;
				
				if(biggerIndex < lastIndex){
					if(arr[biggerIndex] < arr[biggerIndex + 1]){
						biggerIndex++;        //确定是当前节点的右边的元素大还是左边的元素大;
					}
				}
				
				if(arr[k] < arr[biggerIndex]){
					swap(arr, k, biggerIndex);
					k = biggerIndex;       //若当前节点值比子节点最大值小，则交换二者得值，交换后将biggerIndex值赋值给k;  
					
				}else{
					break;
				}
			}
			
		}
	}
	
	public static void swap(int[] arr, int left, int right){
		
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
	
}
