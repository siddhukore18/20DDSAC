import java.util.*;
class ArrayDemo{

	public static void main(String [] args ){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements :");
		for(int i = 0 ; i < n ; i++){

			arr[i] = sc.nextInt();
		}

		int arr2[] = new int[arr.length]; 

		for(int i=0 ; i< arr2.length ; i++) arr2[i] = arr[i];

		System.out.println("normal array : ");
		for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");

		System.out.println("copy array : ");
                for(int i=0 ; i< arr2.length ; i++) System.out.print(arr2[i]+"\t");
	}
}
