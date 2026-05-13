import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		int maxi =0,m=0,n=0,ci=0;
		//if(str.charAt(0)!=' ') System.out.print(str.charAt(0));
		for(int i=1 ; i<str.length(); i++){
			if(str.charAt(i)==' '){
				if(n>m){

					m=n;
					maxi=ci;
				}
				ci=i+1;
				n=0;
				
			}else ++n;	
		}

		System.out.print("max length word is :");
		boolean flag = true;
		while(flag){

			if(str.charAt(maxi)==' ') break;

			System.out.print(str.charAt(maxi));

			maxi++;
		}
		 System.out.println();

	
	}

}
