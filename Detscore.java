



import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Detscore

{

	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while( t-->0){

		    int x = sc.nextInt(); //total points

		    int y = sc.nextInt(); //No. of test cases

		    

		    int eachTestPoint = x/10;

		    int score = eachTestPoint*y;

		    System.out.println(score);

		}

	}

}
