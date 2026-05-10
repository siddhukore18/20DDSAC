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

		

		for(int i=0 ; i<arr1.length;i++){
			
			for(int j=0; j< arr2.length ;j++){
			
				if(arr1[i]==arr2[j]) {
				
					System.out.print(arr1[i]"\t") ;
					

				}
			}
		
		}

		

	}
}
