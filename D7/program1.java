import java.util.*;

class Solution{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of an array  :");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter an array elements :");
		for(int i = 0 ; i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter k : ");

		int k = sc.nextInt();


		for(int i = 0 ; i< arr.length ; i++){
			
			for(int j= i+1 ;j<arr.length ;j++){
				

				if(arr[i]+arr[j]==k)  System.out.println("["+i+","+j+"]");
			}

		}
		   

	}

}
