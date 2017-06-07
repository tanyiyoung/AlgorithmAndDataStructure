
import java.util.Arrays;

/*
 * 基数排序;
 * */

public class RadixSort {

	public static void main(String[] args) {
		
		int[] arr = {100, 37, 77, 97, 2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};;
		System.out.println(Arrays.toString(arr));
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void radixSort(int[] arr){
		
		int n, i, j, m, k;
		for(n = 1; n <= 100; n = n * 10){
			
			int[][] tmp = new int[10][100];
			for(i = 0; i < arr.length; i++){
				m = (arr[i] / n) % 10;         //m为n位数的值,比如36取十位数(36/10)%10 = 3;
				
				tmp[m][i] = arr[i];          //把data[i]的值暂存在tmp里;
			}
			
			k = 0;
			for(i = 0; i < 10; i++){
				for(j = 0; j < arr.length; j++){
					if(tmp[i][j] != 0){   //因一开始设定tmp = {0},故不为0者即为
						//data暂存在tmp里的值,把tmp里的值放回data[]里,
						arr[k] = tmp[i][j];
						k++;
					}
				}
			}	
		}
	}
	
}
