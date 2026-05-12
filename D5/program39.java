import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		String rstr = "";

		for(int i=0 ; i<str.length(); i++){
			
			char ch = str.charAt(i);
			
			if(ch>=65&&ch<=90){
				rstr+=(char)(ch+32);
			}
	
			else if(ch>=97&&ch<=122){
                                rstr+=(char)(ch-32);
                        }

			else rstr+=ch;
		}

		System.out.println(rstr);



	
	}

}
