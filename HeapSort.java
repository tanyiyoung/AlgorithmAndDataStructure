
import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void heapSort(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			createMaxHeap(arr, arr.length - 1 - i);       //���������;
			swap(arr, 0, arr.length -1 - i);			//���Ѷ�Ԫ���������;
		}
		
	}
	
	public static void createMaxHeap(int[] arr, int lastIndex){
		
		for(int i = (lastIndex - 1) / 2; i >=0; i--){     //������Ҫ������λ��Ϊ(lastIndex - 1) / 2;
			
			int k = i;
			while(2 * k + 1 <= lastIndex){
				
				int biggerIndex = 2 * k + 1;
				
				if(biggerIndex < lastIndex){
					if(arr[biggerIndex] < arr[biggerIndex + 1]){
						biggerIndex++;        //ȷ���ǵ�ǰ�ڵ���ұߵ�Ԫ�ش�����ߵ�Ԫ�ش�;
					}
				}
				
				if(arr[k] < arr[biggerIndex]){
					swap(arr, k, biggerIndex);
					k = biggerIndex;       //����ǰ�ڵ�ֵ���ӽڵ����ֵС���򽻻����ߵ�ֵ��������biggerIndexֵ��ֵ��k;  
					
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
