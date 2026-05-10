import java.util.*;
class ArrayDemo{

	static boolean is_Prime(int n){
	
		boolean flag = true ;

		for(int i = 2 ; i < n/2+1 ; i++){
			
			if(n%i==0) {
			
				flag = false ;
				break;
			}

		}
		return flag ;

	} 

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
		
			if(is_Prime(arr[i])){
			       	sum += arr[i];
			        	
	                       
			}

		}

		

		System.out.println("sum of all prime number is : "+sum);

		

	}
}
