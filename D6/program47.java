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
			if(str.charAt(i)==' '||i==str.length()-1){

				if(str.charAt(i-1)==str.charAt(a))
					System.out.println(str.substring(a,i+1));
				a=i+1;

				
			}	
		}
		
			
	}

}
