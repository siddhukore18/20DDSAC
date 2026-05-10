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

		
		System.out.println("Enter size of an array 2: ");
                int n2 = sc.nextInt();
                int arr2[] = new int[n2];
                System.out.println("enter array elements :");
                for(int i = 0 ; i < n2 ; i++){

                        arr2[i] = sc.nextInt();
                }

		int arr3[] = new int[arr1.length+arr2.length];

		for(int i=0 ; i<arr1.length;i++){
		
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
		
			arr3[arr1.length+i]= arr2[i];
		}
		for(int i=0;i<arr3.length;i++){
		
			System.out.print(arr3[i]+"\t");
		}
		System.out.println();
	}
}
