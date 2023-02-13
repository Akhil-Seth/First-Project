package com.Akhil;
import java.util.*;
public class MergeSort 
{
      public static void mergeSort(int[] ar , int st, int end)
      {
    	  if((end-st)<2)
    		  return;
    	  int mid=(st+end)/2;
    	  mergeSort(ar,st,mid);
    	  mergeSort(ar,mid,end);
    	  merge(ar,st,mid,end);
      }
      public static void merge(int[] ar, int st, int mid, int end)
      {
    	  int i=st,j=mid+1,k=0,b[]=new int[end-st+1],d,c=0;
    	  while(i<=mid && j<=end)
    	  {
    		  if(ar[i]<ar[j])
    		  {
    			  b[k]=ar[i];
    			  k++;
    			  i++;
    		  }
    		  else
    		  {
    			  b[k]=ar[j];
    			  k++;
    			  j++;
    		  }
    	  }
    	  if(i>mid)
    		  while(j<=end)
    		  {
    			  b[k]=ar[j];
    			  k++;
    			  j++;
    		  }
    	  else
    		  while(i<=mid)
    		  {
    			  b[k]=ar[i];
    			  k++;
    			  i++;
    		  }
    	  for(d=st;d<=end;d++)
    	  ar[d]=b[c++];
      }
      public static void main(String[] args)
      {
    	  Scanner ss= new Scanner(System.in);
    	  int n,ar[],i;
    	  System.out.println("Enter limit");
    	  n=ss.nextInt();
    	  ar=new int[n];
    	  for(i=0;i<n;i++)
    	  ar[i]=ss.nextInt();
    	  mergeSort(ar,0,n-1);
    	  for(i=0;i<n;i++)
    		  System.out.println(ar[i]);
      }
}
