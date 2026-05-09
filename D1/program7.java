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
		
		int p = 0 , n = 0;

		for(int i = 0 ; i < num ; i++){

                        if(arr[i]%2==0) p++;
			else n++;
                }	
	
		System.out.println("even :"+p+"\todd : "+n);
	}
}
