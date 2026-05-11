import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		int count = 0 ;
		boolean flag = true ;

		for(int i = 0 ; i < str.length() ; i++){
		
			if(str.charAt(i)==' ') flag = true ;
			else if(flag){
				count++;
				flag = false ;
			}
		}
		
		System.out.println(count+" words contain in sentence");
	
	}

}
