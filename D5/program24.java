import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		boolean flag = true ;


		for(int j=0; j < str.length() ;j++){

			if(str.charAt(j)!=str.charAt(str.length()-1-j)){
				
				flag = false ;
				break ;
			}
		}
		if(flag)System.out.println("given string is palindrome :"+str);
		else System.out.println("given string is not palindrome :"+str);
	
	}

}
