import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

    public static void insertSort(int[] arr) {
    	
    	for(int i = 1; i < arr.length; i++){
    		int j = i;
    		
    		int tmp = arr[i];
    		while(j > 0 && arr[j - 1] >= tmp){
    			
    			arr[j] = arr[j - 1];
    			j--;
    		}
    		
    		arr[j] = tmp;
    		
    	}
    	
    }
	
}
