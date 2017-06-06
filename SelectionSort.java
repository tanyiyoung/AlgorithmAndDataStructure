import java.util.Arrays;

/*
 * ѡ������;
 * 
 * */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		
		int k = 0;    //k���ڼ�¼�ų�ǰ(i + 1)��Ԫ��ʣ�µ�Ԫ�ص���Сֵ;
		for(int i = 0; i < arr.length; i++){
			k = i;
			
			//��ܴ����֮��,Ȼ���������Ҫ���ҳ��ų�ǰ(k+1)��ʣ�µ�Ԫ�ص���Сֵ;
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