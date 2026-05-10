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

		int count = 0;

		for( int i = 0  ; i< n ; i++){
		
			if( arr[i]%3==0 && arr[i]%5==0){
			
				count ++;

			}
		}
		 
		System.out.println(count );
	}
}
