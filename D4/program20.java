import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		
		int count = 0 ;
		if(str1.charAt(str1.length()-1)=='s'  ||  str1.charAt(str1.length()-1)=='S' ) count =1;
		for(int i= 1 ; i<str1.length() ; i++){
			if(str1.charAt(i)==' ' && (str1.charAt(i-1)=='s'  || str1.charAt(i-1)=='S')) count ++;

		}
		System.out.println(count);
	}

}
