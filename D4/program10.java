import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();

		if((str1.trim()).length()==0){
		
			System.out.print("given string is empty ");
		}else{
			System.out.print("given string not is empty ");
		}
	}

}
