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
		

		boolean flag = true ;
		if(arr1.length>1){ 
			for(int i = 1 ; i < arr1.length ; i++){
		
				if(arr1[i-1]<arr1[i]){
			
					flag = false ; 
			
					break ;
			
				}
			}
		}

		if(flag){
		
			System.out.println("given array is sorted in desending order");
		}
		else System.out.println("given array is not sorted in desending order");
	}
}
