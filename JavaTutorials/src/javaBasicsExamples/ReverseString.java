package javaBasicsExamples;

public class ReverseString {


	public static void main(String[] args) {

		String Name="GOKUL";
		
		int Namelenth=Name.length();
		String reverse="";

		for (int i=Namelenth-1; i>=0; i--) {

			reverse=reverse+Name.charAt(i); 
		}
		System.out.print(reverse);
		
         }
	
	
}
