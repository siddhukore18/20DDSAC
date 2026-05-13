import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		//System.out.println((int)str.charAt(0));
		boolean flag = false;
		String rstr  = "";
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=0 ; i<str.length(); i++){
			if(str.charAt(i)==' '&&flag){
				rstr+=str.charAt(i);
				flag=false;
			
				
			}else if(str.charAt(i)==' '&&!flag) continue;
			else {
				rstr+=str.charAt(i);
				flag = true;
			}


				
			
			
		
		}
		System.out.println(rstr);
	}

}
