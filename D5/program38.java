import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		String rstr = "";
		rstr +=str.charAt(0);

		for(int i=0 ; i<str.length(); i++){

			if(str.charAt(i)!=rstr.charAt(rstr.length()-1)){
				rstr+=str.charAt(i);
			}
		}

		System.out.println(rstr);



	
	}

}
