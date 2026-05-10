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
		
		Arrays.sort(arr1);
		int count = 0 , avg=0;
		
		for(int i = 0 ; i<arr1.length; i++){
		
			avg+=arr1[i];
		}	

		avg= avg/arr1.length;
		for(int j=0;j<arr1.length;j++){
			
			if(avg<arr1[j]) count ++;
		
			
		}

		System.out.println("there are :"+count+" element have more than avarage" );
	}
}
