import java.util.*;

class StringDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		
		int count = 0 ;
		if((str1.charAt(0)=='A'  || str1.charAt(0)=='a'  || str1.charAt(0)=='E' || str1.charAt(0)=='e' || str1.charAt(0)=='O' || str1.charAt(0)=='o' || str1.charAt(0)=='I' || str1.charAt(0)=='i' || str1.charAt(0)=='U' || str1.charAt(0)=='u')) count =1;
		for(int i= 0 ; i<str1.length()-1 ; i++){
			if(str1.charAt(i)==' ' && (str1.charAt(i+1)=='A'  || str1.charAt(i+1)=='a'  || str1.charAt(i+1)=='E' || str1.charAt(i+1)=='e' || str1.charAt(i+1)=='O' || str1.charAt(i+1)=='o' || str1.charAt(i+1)=='I' || str1.charAt(i+1)=='i' || str1.charAt(i+1)=='U' || str1.charAt(i+1)=='u')) count ++;

		}
		System.out.println(count);
	}

}
