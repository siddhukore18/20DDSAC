import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
	
		if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i)==' '){
				if(str.charAt(i-1)==' ') continue;
				else System.out.println();
			}else System.out.print(str.charAt(i));	
		}

		System.out.println();



	
	}

}
