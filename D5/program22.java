import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String rstr= "";
		int index =0;

		for(int j=0;j<str.length();j++){

			if(str.charAt(j)==' ' || j==str.length()-1){
				
				for(int i = j ; i>=index ;i--){
					rstr += str.charAt(i);
				}
				index = j;
			}
		}
		System.out.println("reverse word sentence is :"+rstr);
	
	}

}
