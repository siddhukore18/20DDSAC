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

		for(int i=0 ; i< n ; i++){
		
			
			if(arr[i]<0) arr[i]= 0;
			else arr[i] = 1;
			
		}
		System.out.println();

		System.out.println("updated  array : ");
		for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");
		
		System.out.println();

		

	}
}
