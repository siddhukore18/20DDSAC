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
		int index= 0;
		boolean flag = false ;
		for(int i = 0 ; i < n ; i++ ){
		
			if(arr[i]==ele){
				index = i;
			       	flag = true ;
			
			}

		}

		if(flag){

			System.out.println(ele + " is present in array at last occ : "+ index);

		}
		else  System.out.println(ele + " is not present in array ");
	}
}
