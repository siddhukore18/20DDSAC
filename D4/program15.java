import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

		System.out.println("enter your char : ");

		char ch = sc.next().charAt(0);
		int count = 0 ; 
		for(int i = 0 ; i < str1.length() ; i++){
			if(str1.charAt(i)==ch) count++;
		}

		System.out.println(ch + " : " +count);
	}

}
