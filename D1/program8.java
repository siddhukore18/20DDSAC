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
		
		int index=0;

		for(int i = 0 ; i < num ; i++){

                        if(arr[i]> arr[index] )   index = i ;
			
                }	
	
		System.out.println("index of  max ele : "+ index);
	}
}
