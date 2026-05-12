import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String rstr = "";
		int index = 0 ;
                for(int i = 0; i<str.length() ; i++){
		
			if((int)str.charAt(i)>=48  && (int)str.charAt(i)<=57) {
				int k = i -1 ;
				while(k>index-1){
					rstr +=str.charAt(k);
					k--;
				}
				rstr +=str.charAt(i);
				index = i+1;
			}
		}
		System.out.println(rstr);
	
	}

}
