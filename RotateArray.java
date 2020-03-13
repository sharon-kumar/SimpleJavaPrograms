
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int brr[] = new int[arr.length];
		rotation(arr, brr, d, arr.length, 0, 0, true, 0);
		for(int k=0;k<brr.length;k++) {
			System.out.println(brr[k]);
		}
	}

	private static void rotation(int[] arr, int[] brr, int elementsToRotate, int length, int i, int j, boolean flag, int reset) {
		 if((i+elementsToRotate)<length && flag) {
			 rotateOperation(arr[i+elementsToRotate], brr, length, j);
			 i++;
			 j++;
			 rotation(arr, brr, elementsToRotate, arr.length, i, j, flag,reset);
		 }else {
			 flag = false;
			 if(reset<elementsToRotate) {
				 rotateOperation(arr[reset], brr, length, j);
				 reset++;
				 j++;
				 rotation(arr, brr, elementsToRotate, arr.length, reset, j, flag,reset);
			 }
		 }
	}

	private static void rotateOperation(int i, int[]brr, int length, int j) {
		brr[j]=i;
		
	}

}
