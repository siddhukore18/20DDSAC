import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("first char is : "+str.charAt(0)+"  and last char is : "+str.charAt(str.length()-1));
	
	}

}
