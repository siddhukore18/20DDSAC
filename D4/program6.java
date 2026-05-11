import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		int count = 0 ;
		for(int i = 0 ; i < str.length() ; i++){
		
			if(str.charAt(i)==' ') count ++;
		}
		int charl = str.length() - count;
		System.out.println("int this string contain "+charl+" charaters excluding spaces");
	
	}

}
