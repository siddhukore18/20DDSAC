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

		System.out.println("enter your element :");
		int ele = sc.nextInt();
		boolean flag = false ;
		for(int i = 0 ; i < n ; i++ ){
		
			if(arr[i]==ele){
			       	flag = true ;
				break;
			}

		}

		if(flag){

			System.out.println(ele + " is present in array ");

		}
		else  System.out.println(ele + " is not present in array ");
	}
}
