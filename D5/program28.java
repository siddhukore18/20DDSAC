import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
                for(int i = 1; i<str.length()-1 ; i++){
		
			System.out.print(str.charAt(i));
		}
		System.out.println();
	
	}

}
