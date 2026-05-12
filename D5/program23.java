import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String rstr= "";
		int index =str.length()-1;

		for(int j=str.length()-1;j>=0;j--){

			if(str.charAt(j)==' ' || j==0){
				
				
				rstr += str.substring(j ,index+1);
				
				index = j;
			}
		}
		System.out.println("reverse order word sentence is :"+rstr);
	
	}

}
