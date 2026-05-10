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

		
		
		int sum =0;
		for(int i = 0 ; i < n ; i++ ){
		
			if(arr[i]%2!=0){
			       	sum += arr[i];
			        	
	                       
			}

		}

		

		System.out.println("sum of all odd number is "+sum);

		

	}
}
