import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		int count = 0;
		boolean flag = true ;
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i)==' ') flag = true ;
			else if((str.charAt(i)=='a'||str.charAt(i)=='A')&&flag){
				count ++;
				flag = false;
			}

				
			
		}

		System.out.println(count);
		
			
	}

}
