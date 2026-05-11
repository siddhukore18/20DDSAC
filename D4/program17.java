import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		

	
		int count1 = 0 , count2=0 ; 
		boolean flag = true ;
		for(int i = 0 ; i < str1.length() ; i++){
			if(((int)str1.charAt(i)>=65 && (int)str1.charAt(i)<=90)  || ((int)str1.charAt(i)>=97 && (int)str1.charAt(i)<=122)){
				if(str1.charAt(i)=='m' || str1.charAt(i)=='M')  flag = false ;
				else if(flag) count1++;
				else count2++;
			}
		}

		System.out.println("before m  : " +count1 + "\nafter m "+count2);
	}

}
