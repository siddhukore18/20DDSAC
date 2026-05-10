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
		
		System.out.println("normal array : ");
                for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");

		for(int i=0 ; i< n/2 ; i++){
		
			
			int temp = arr[i];
                	arr[i]=arr[arr.length-1-i];
                	arr[arr.length-1-i] = temp ;
			
		}
/*
		int temp = arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1] = temp ;
*/		System.out.println();

		System.out.println("reveresesd  array : ");
		for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");
		
		System.out.println();

		

	}
}
