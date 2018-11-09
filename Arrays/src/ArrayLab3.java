import java.util.Arrays;

public class ArrayLab3 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(sum(arr1,arr2)));
		System.out.println(Arrays.toString(append(arr1,1)));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum1 = new int[arr1.length];
			for(int i = 0; i < arr1.length; i ++) {
				 sum1[i] = arr1[i] + arr2[i];
			}
			return sum1;
	}
	
	public static int[] append(int[] arr, int num) { 
		int[] arr3 = new int[arr.length + num];
			for(int i = 0; i < arr.length; i++) { 
				arr3[i] = arr3 [i+1];
			}
			return arr3;
	}
}
