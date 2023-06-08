



import java.util.*;

import java.lang.*;

import java.io.*;





class Ballons

{

	public static void main (String[] args) throws java.lang.Exception
	{

		

		Scanner in =new Scanner(System.in);

		int t=in.nextInt();

		while(t-->0)

		{

		    int n=in.nextInt();

		    int[] arr = new int[n];

		    int c=0,i=0;

		    for( i=0;i<n;i++)

		    {

		        arr[i]=in.nextInt();

		        if(arr[i]>=1 && arr[i]<=7)

		        {

		            c=i+1;

		        }

		    }

		    System.out.println(c);

		}

	}

}
