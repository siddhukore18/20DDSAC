import java.util.*;
class ArrayDemo{
	static boolean isPS(int num){
	
		double d = Math.sqrt(num);
		int n =(int)Math.sqrt(num);
		if (n*n == num){
		
			return true;

		}   
		return false ;	
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

		int count = 0;

		for( int i = 0  ; i< n ; i++){
		
			if( isPS(arr[i])){
			
				count ++;

			}
		}
		 
		System.out.println(count );
	}
}
