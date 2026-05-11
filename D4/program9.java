import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();

		for(int i = 0 ; i < str1.length() ; i++){
		
			System.out.print((int)str1.charAt(i)+" ");
		}
	}

}
