package com.Akhil;

public class Calender {
	
	{
	    public static void main()
	    {
	        Scanner ss=new Scanner(System.in);
	        int yr,i,j=7,k,f;
	        System.out.println("Enter yr");
	        yr=ss.nextInt();
	        for(i=1990;i<=yr;i++)
	        {
	            if(i%400==0)
	            {
	                if(j==7)
	                j=2;
	                else if(j==6)
	                j=1;
	                else 
	                j++;
	            }
	            else if(i%4==0 && i%100==0)
	            {
	                if(j==7)
	                j=1;
	                else 
	                j++;
	            }
	            else if(i%4==0)
	            {
	                if(j==7)
	                j=2;
	                else if(j==6)
	                j=1;
	                else 
	                j++;
	            }
	            else
	            {
	                if(j==7)
	                j=1;
	                else 
	                j++;
	            }
	        }
	        for(i=1;i<12;i++)
	        {
	            if(i==1 || i==3 || i==5 || i==7  || i==8 || i==10 || i==12)
	            {
	                for(k=1;k<j;k++)
	                System.out.print("    ");
	                for(k=1;k<=31;k++)
	                {
	                    if(j==7)
	                    {
	                        j=1;
	                        System.out.print(" "+k+" ");
	                        System.out.println();
	                    }
	                    else 
	                    {
	                        j++;
	                        System.out.print(" "+k+" ");
	                    }
	                }
	                System.out.println();
	                System.out.println();
	            }
	            else if(i==4 || i==6 || i==9 || i==11)
	            {
	                for(k=1;k<j;k++)
	                System.out.print("    ");
	                for(k=1;k<=30;k++)
	                {
	                    if(j==7)
	                    {
	                        j=1;
	                        System.out.print(" "+k+" ");
	                        System.out.println();
	                    }
	                    else 
	                    {
	                        j++;
	                        System.out.print(" "+k+" ");
	                    }
	                }
	                System.out.println();
	                System.out.println();
	            }
	            else
	            {
	                for(k=1;k<j;k++)
	                System.out.print("    ");
	                if(yr%4==0 && yr%100!=0)
	                f=29;
	                else 
	                f=28;
	                for(k=1;k<=f;k++)
	                {
	                    if(j==7)
	                    {
	                        j=1;
	                        System.out.print(" "+k+" ");
	                        System.out.println();
	                    }
	                    else 
	                    {
	                        j++;
	                        System.out.print(" "+k+" ");
	                    }
	                }
	                System.out.println();
	                System.out.println();
	            }
	            }
	        }
	    }

}
