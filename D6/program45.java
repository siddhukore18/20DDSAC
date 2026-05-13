import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		int a=0,b=0;
		boolean flag = true ;
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i)==' '){
				if(flag){
					a = i;
					flag = false;
				}
				b= i;

				
			}	
		}
		
		String resStr = str.substring(b,str.length())+str.substring(a,b+1)+str.substring(0,a+1) ;
		System.out.print("result  :"+resStr);
		

	
	}

}
