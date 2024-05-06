package BubleShorting;

public class InsertionSort {
public static void PrintArr(int arr[]) {
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
}
	public static void main(String[] args) {
		int arr[] = {7,8,9,1,2};
//		 time complexity is o (n^ 2)
		for(int i=1; i<arr.length;i++) {
			int current = arr[i];
//			7 = 7
			int j = i - 1;
//			j =  1 
			while(j >= 0 && current <arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
//			Placement
			arr[j+1] = current;
		}
		PrintArr(arr);
	}

}
