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
		int count = 0 , k;
		System .out.println("enter k : ");
		k= sc.nextInt();
		for(int i = 0 ; i<arr1.length; i++){

			for(int j=i+1;j<arr1.length;j++){
			
				if(arr1[i]+arr1[j]==k)  count ++;
			}
		
			
		}

		System.out.println("there are :"+count+" pair have sum is equal to :"+k );
	}
}
