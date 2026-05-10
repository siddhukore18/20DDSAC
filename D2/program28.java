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
		int temp=arr[arr.length-1];
		for(int i=n-1 ; i>0 ; i--){
		
			
			arr[i]=arr[i-1];
                	

			
		}

/*
		int temp = arr[0];
		arr[0]=arr[arr.length-1]; */
		arr[0] = temp ;
		System.out.println();

		System.out.println("left   array : ");
		for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");
		
		System.out.println();

		

	}
}
