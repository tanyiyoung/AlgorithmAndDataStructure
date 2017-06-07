
import java.util.Arrays;

/*
 * ��������;
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
				m = (arr[i] / n) % 10;         //mΪnλ����ֵ,����36ȡʮλ��(36/10)%10 = 3;
				
				tmp[m][i] = arr[i];          //��data[i]��ֵ�ݴ���tmp��;
			}
			
			k = 0;
			for(i = 0; i < 10; i++){
				for(j = 0; j < arr.length; j++){
					if(tmp[i][j] != 0){   //��һ��ʼ�趨tmp = {0},�ʲ�Ϊ0�߼�Ϊ
						//data�ݴ���tmp���ֵ,��tmp���ֵ�Ż�data[]��,
						arr[k] = tmp[i][j];
						k++;
					}
				}
			}	
		}
	}
	
}
