package org.programmingInterview;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class PrintFQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("*********************");
		for(int i=0;i<3;i++)
		{
			String s1=sc.next();
			int st=sc.nextInt();
			System.out.printf("%-100s%03d%n",s1,st); // -15 ---- string to the left  from the integer
			//0 padding added 
			//3d--3 minimum values for digits
			//n new line
		}
		
		
		
	}

}
