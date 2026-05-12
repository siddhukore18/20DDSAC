import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		str = str.replaceAll("[aAiIeEuUoO]","");

		System.out.println(str);



	
	}

}
