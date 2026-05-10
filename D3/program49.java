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
		

		int max = Integer.MIN_VALUE;


		for(int i =0 ;i<arr1.length; i++){
		
		
			if(arr1[i]>max){
			
				max = arr1[i];
			}
		}

		int farr[] = new int[max+1];


		for(int i =0 ;i<arr1.length; i++){
		
			farr[arr1[i]]++;
		}

		for(int i=0; i<farr.length;i++){
		
			if(farr[i]>0) System.out.println(i+" -> "+farr[i]);
		}
	}
}
