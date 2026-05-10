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
		
		int count =0;
		for(int i = 0; i< n ; i++) if(arr[i]%2==0 ) count ++;

		int evenarr[] = new int[count]; 

		int j=0;

		for(int i=0 ; i< n ; i++){
		
			if(arr[i]%2==0){
			
				evenarr[j]=arr[i];
				j++;

			}
		}
		

		System.out.println("normal array : ");
		for(int i=0 ; i< arr.length ; i++) System.out.print(arr[i]+"\t");
		
		System.out.println();

		System.out.println("even  array : ");
                for(int i=0 ; i< evenarr.length ; i++) System.out.print(evenarr[i]+"\t");

		System.out.println();
	}
}
