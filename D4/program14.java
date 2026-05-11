import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

		int arr[] = new int[26];

		for(int i = 0 ; i < str1.length() ; i++){
			
			if(90>=(int)str1.charAt(i)) arr[(int)str1.charAt(i)-65] ++;
			else arr[(int)str1.charAt(i)-97] ++;
		}


		for(int i = 0 ; i <arr.length ; i++){
			if(arr[i]>0) {
				System.out.println((char)(i+65)+" : "+arr[i]);
			}
		}
	}

}
