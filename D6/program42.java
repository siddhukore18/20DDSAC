import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		int count =0,n=0;
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i)==' '){
				if(n%2==0) count++;
			}else n++;	
		}

		System.out.println("even length words in sentence is :"+count);



	
	}

}
