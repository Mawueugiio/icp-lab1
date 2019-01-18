package icp2019;


import java.util.Scanner;
/*
 * @author Mawuenya
 */
public class Lab1 {
	// default constructor 
	public Lab1() {
		
	}
	/*
	 * method 1
	 * @param input
	 */
	public int stringLength(String input) {
		
		int strLength = input.length();
		return strLength;
	}
	
	/*
	 * method2
	 * @param input
	 */
	public String reverseInput(String input) {
		String revStatement="";
		for(int i=input.length()-1;i>-1;i--) {
			revStatement=revStatement + input.charAt(i);
		}
		return revStatement;
	}
	
	/*
	 * method 3
	 */
	public void areaAndCircumference() {
		Scanner keyboard = new Scanner(System.in);
		
		
		double radius = keyboard.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		double circumference = 2* Math.PI* radius;
		System.out.format("area = %.2f", area);
		System.out.format(" circumference = %.2f", circumference);
		keyboard.close();
	}
	
	/*
	 * main method		
	 */
	public static void main (String[] args) {
		Lab1 lab = new Lab1();
		System.out.println(lab.stringLength("Tito"));
		System.out.println(lab.reverseInput("Tito"));
		lab.areaAndCircumference();
	}
 
}

