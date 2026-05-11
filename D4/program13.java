import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

		int uChar=0 , lChar = 0;
		for(int i = 0 ; i < str1.length() ; i++){
		
			char ch = str1.charAt(i);
			
			if(65<=(int)ch  && 90>=(int)ch) uChar ++;
			
			else if(97<=(int)ch && 122>=(int)ch ){
				lChar++;
			}

		}

		System.out.println("uppercase chars  : " +uChar +"\nlowercase chars : "+lChar);
	}

}
