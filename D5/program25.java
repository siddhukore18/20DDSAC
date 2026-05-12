import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

		System.out.println("Enter a string 2:");
                String str2 = sc.nextLine();

		boolean flag = true ;

		if(str1.length()!=str2.length()) flag = false ;

		else for(int j=0; j < str1.length() ;j++){

			if(str1.charAt(j)!=str2.charAt(str1.length()-1-j)){
				
				flag = false ;
				break ;
			}
		}
		if(flag)System.out.println("given two string is reverse equal :");
		else System.out.println("given two string is reverse not equal :");
	
	}

}
