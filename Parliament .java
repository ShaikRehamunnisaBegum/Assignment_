







import java.util.*;

import java.lang.*;

import java.io.*;





class Parliament 

{

	public static void main (String[] args) throws java.lang.Exception
	{

		

		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();

		

		for(int i=0; i<testCases; i++) {

		    int totalVoters = sc.nextInt();

		    int favourVoters = sc.nextInt();

		    

		    if(favourVoters >= (totalVoters - favourVoters)) {

		        System.out.println("YES");

		    } else {

		        System.out.println("NO");

		    }

		}

	}

} 
