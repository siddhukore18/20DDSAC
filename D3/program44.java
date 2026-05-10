import java.util.*;
class ArrayDemo{

	public static void main(String [] args ){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array 1: ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("enter array elements :");
		for(int i = 0 ; i < n1 ; i++){

			arr1[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);

		System.out.println("second smallest element in array is:"+arr1[1]);
	}
}
