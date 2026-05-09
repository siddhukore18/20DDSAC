import java.util.*;
class ArrayDemo{

	public static void main(String [] args ){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array :");
		int num = sc.nextInt();

		int arr[] = new int[num];
	        System.out.println("Enter array elements:");
		for(int i = 0 ; i < num ; i++){
			
			arr[i] = sc.nextInt();
		}
		
		
		
		System.out.println("enter k :");
                int k = sc.nextInt();

		for(int i = 0 ; i < num ; i++){

                        if(arr[i]> k )   System.out.print(arr[i]+"\t");
			
                }
		System.out.println();	
	
	}
}
