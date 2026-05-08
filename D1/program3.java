import java.util.*;
class ArrayDemo{

	public static void main(String [] args ){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array :");
		int n = sc.nextInt();

		int arr[] = new int[n];
	        System.out.println("Enter array elements:");
		for(int i = 0 ; i < n ; i++){
			
			arr[i] = sc.nextInt();
		}
		System.out.print("Avarage of Array :");
		int sum = 0;

		for(int i = 0 ; i < n ; i++){

                        sum += arr[i];
                }	
	
		System.out.println(sum/arr.length);
	}
}
