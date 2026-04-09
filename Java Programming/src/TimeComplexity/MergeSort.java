package TimeComplexity;

//Write a program to merge two sorted arrays in a sorted manner.(With TC of Big(O))
public class MergeSort {
    public static int[] divide(int [] arr) {//[18]
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2; //mid = 1
		
		int [] left = new int[mid];
		int [] right = new int[arr.length - mid];
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		for(int i=mid; i<arr.length; i++) {
			right[i-mid] = arr[i];
		}
		
		left = divide(left); 
		right = divide(right); 
		
		return merge(left,right,arr);
		
	}
	
	
	public static int [] merge(int [] arr1, int [] arr2, int[] res) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				k++;
				i++;
			}
			else {
				res[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < arr1.length) {
			res[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {
			res[k] = arr2[j];
			k++;
			j++;
		}
		return res;
	}

	public static void main(String[] args) {
		int [] arr = {32,18,17,15,6,4,5,2};
		int [] res = divide(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
}
