
import java.util.Arrays;

/*
 * 希尔排序;
 * */

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		
		shellSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(int[] arr){
		
		int h = 1;
		while(h < arr.length / 3){
			h = h * 3 + 1;			//初始化步长;
		}
		
		while(h > 0){      //直至步长降为1;

			for(int i = h; i < arr.length; i++){
				int tmp = arr[i];
				int j = i;
				while(j > h - 1 && arr[j - h] >= tmp){    //以步长往前"跳";
					arr[j] = arr[j - h];
					j = j - h;
				}
				
				arr[j] = tmp;
			}	
			
			h = (h - 1) / 3;		//调整步长;
		}
	}
	
}
