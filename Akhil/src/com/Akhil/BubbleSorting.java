package com.Akhil;
import java.util.*;
public class BubbleSorting {
    public static void main(String[] argsn)
    {
    	Scanner ss=new Scanner (System.in);
    	int n,ar[],i,j,c;
    	System.out.println("Enter limit");
    	n=ss.nextInt();
    	ar=new int[n];
    	for(i=0;i<n;i++)
    		ar[i]=ss.nextInt();
    	for(i=0;i<n-1;i++)
    	{
    		for(j=0;j<n-1-i;j++)
    			if(ar[j]>ar[j+1])
    			{
    				c=ar[j];
    				ar[j]=ar[j+1];
    				ar[j+1]=c;
    			}
    	}
    	for(i=0;i<n;i++)
    		System.out.println(ar[i]);
    }
	
}
