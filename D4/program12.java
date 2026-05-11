import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

		int digit=0 , spchar=0 , chars = 0;
		for(int i = 0 ; i < str1.length() ; i++){
		
			char ch = str1.charAt(i);
			
			if(48<=(int)ch  && 57>=(int)ch) digit ++;
			else if((32<=(int)ch && 47>=(int)ch) ||(58<=(int)ch && 64>=(int)ch) || (91<=(int)ch && 96>=(int)ch)  || (123<=(int)ch && 126>=(int)ch)) spchar ++;
			else if((65<=(int)ch && 90>=(int)ch) ||(97<=(int)ch && 122>=(int)ch) ){
				chars++;
			}

		}

		System.out.println("digits  : " +digit +"\nspecial char : "+spchar+"\n char : "+chars);
	}

}
