
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {100,37,77, 97,2, 4, 6, 1, 7, 3, 1, 3, 10, 10, 5, 6, 7, 12, 90, 64, 54, 67, 21, 23, 32, 46, 63, 25, 56, 42, 21, 15};
		//bubbleSorting(arr);
		//bubbleSorting2(arr);
		
		bubbleSorting3(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	//ð������;
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
	 * �Ľ���ð�������㷨һ,
	 * ����һ��ѭ����ĳ��ɨ����û��ִ�н�������˵����ʱ�����Ѿ�ȫ�������У�������ɨ���ˡ�
	 * ��ˣ�����һ����ǣ�ÿ�η����������ͱ�ǣ����ĳ��ѭ����û�б�ǣ���˵���Ѿ��������
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
			
			if(!bSwaped){      //���bSwapedΪfalse,˵���Ѿ����������;
				break;
			}
		}
	}
	
	/*
	 * �Ľ���ð�������㷨2;
	 *�ڵ�һ���Ż��Ļ����Ϸ���һ��˼�������R[i..n]�����������䣬�ϴε�ɨ��������R[0..i]��
	 *���ϴ�ɨ��ʱ���һ��ִ�н�����λ��ΪendPos����endPos��0��i֮�䣬
	 *���ѷ���R[endPos...n]����Ҳ������ģ������������Ҳ�ᷢ��������
	 *�����´�ɨ������Ϳ�����R[0..i] ������[0..endPos]��
	 * */
	public static void bubbleSorting3(int[] arr){
	
     	boolean bSwaped = false;
		int endPos = arr.length - 1;  //���һ��δ�����Ԫ���±�;
		while(endPos > 0){

			bSwaped = false;
			int pos = 0;
			for(int j = 0; j < endPos; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					
					bSwaped = true;    //˵������ľ�����;
					pos = j;
				}
			}
			
			if(!bSwaped){
				break;        //�Ѿ��ź��򣬲���Ҫ���к��������������;
			}
			
			endPos = pos;
		}	
	}
	
}
