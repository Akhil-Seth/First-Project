package com.Akhil;

public class Rainbow {
	public static void main()
    {
        Scanner ss= new Scanner (System.in);
        int t=ss.nextInt();
        int i,n,j,arr[],c=0,out[]=new int[t],max=0,h=0,f=0;
        for(i=0;i<t;i++)
        {
            n=ss.nextInt();
            arr=new int[n];
            for(j=0;j<n;j++)
            arr[j]=ss.nextInt();
            c=0;
            max=0;
            f=0;
            h=0;
            for(j=0;j<n;j++)
            {
                if(h<arr[j])
                {
                    h=arr[j];
                    max=j;
                }
            }
            for(j=0;j<(max-1);j++)
            if(arr[j+1]!=arr[j] && arr[j+1]!=(arr[j]+1))
            f++;
            for(j=max;j<n-1;j++)
            if(arr[j+1]!=arr[j] && arr[j+1]!=(arr[j]-1))
            f++;
            for(j=0;j<n;j++)
            if(arr[j]!=arr[n-j-1])
            c++;
            if(c>0 || f>0)
            out[i]=0;
            else
            out[i]=1;
        }
        for(i=0;i<t;i++)
        {
            if(out[i]==1)
            System.out.println("yes");
            else
            System.out.println("no");
    }
}
}
