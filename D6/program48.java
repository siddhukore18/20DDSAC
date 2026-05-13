import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String rstr="";
		//System.out.println((int)str.charAt(0));
		if((int)str.charAt(0)>=97&&(int)str.charAt(0)<=122)  rstr+=(char)(str.charAt(0)-32);
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i-1)==' '&&str.charAt(i)>=97&&str.charAt(i)<=122){
			
				rstr+=(char)(str.charAt(i)-32);
			}else rstr+=str.charAt(i);



				
			
			
		
		}
		System.out.println(rstr);
	}

}
