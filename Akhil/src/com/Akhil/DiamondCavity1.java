package com.Akhil;

public class DiamondCavity1 {
	public static void main()
    {
        int i,j;
        for(i=0;i<=4;i++)
        {
            for(j=5-i;j>=1;j--)
            System.out.print("*");
            for(j=0;j<2*i;j++)
            System.out.print(" ");
            if(i==0)
            for(j=0;j<5;j++)
            System.out.print("*");
            else
            for(j=5-i;j>=1;j--)
            System.out.print("*");
            System.out.println();
        }
        for(i=4;i>=0;i--)
        {
            for(j=5-i;j>=1;j--)
            System.out.print("*");
            for(j=0;j<2*i;j++)
            System.out.print(" ");
            if(i==0)
            for(j=0;j<=4;j++)
            System.out.print("*");
            else
            for(j=5-i;j>=1;j--)
            System.out.print("*");
            System.out.println();
        }
    }

}
