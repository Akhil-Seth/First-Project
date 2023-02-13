package com.Akhil;

import java.util.ArrayList;
import java.util.*;
public class AnshikAs5 
{
	ArrayList<String> data = new ArrayList<String>();
	int x,y,z;
	AnshikAs5()
	{
		x=0;
		y=0;
		z=0;
	}
	void compute(String s)
	{
		String op ="=+-*/",ne="";
	        char a;
		for(int i =0;i<s.length();i++)
		{
			if(op.indexOf(s.charAt(i))>-1)
				ne+=" "+s.charAt(i)+" " ;
			else
				ne+=s.charAt(i);
		}
		ne=ne.trim() ;
		a=ne.charAt(0);
		String ar[]=ne.split(" ");
		for(int i=0;i<ar.length;i++)
		data.add(ar[i]);
		
		data.remove(0);
		for(int i=0;i<ar.length -2;i++)
			System.out.println(data.get(i));
	}
	public static void main()
	{
		Scanner ss= new Scanner (System.in);
		AnshikAs5 as5 = new AnshikAs5();
		System.out.println("Enter");
		String s= ss.nextLine();
		as5.compute(s);
	}

}

