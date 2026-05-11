import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();

		System.out.println("Enter a string 1:");
                String str2 = sc.nextLine();
		
		boolean flag =  true ;
		
		if(str1.length()!=str2.length()) flag = false ;
		else for(int i =0 ; i < str1.length() ; i++ ){
		
			for(int j =0 ; j < str2.length() ; j++ ){

				if(str1.charAt(i)==str1.charAt(j)&&str2.charAt(i)!=str2.charAt(j))  {
					flag = false ;
					break;
				}
			}
			if(!flag ) break ;
		}

		
		if(flag ){
		
			System.out.println("given string are lexigraphicall   str1 : "+ str1 +" str2 : "+str2);
		}else  System.out.println("given string are not lexigraphicall   str1 : "+ str1 +" str2 : "+str2);
	}

}
