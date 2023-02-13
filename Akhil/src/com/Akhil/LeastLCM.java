package com.Akhil;

public class LeastLCM {
	Scanner ss=new Scanner (System.in);
    int t=ss.nextInt();
    int n,i,LCM[],j,a,b,hcf,k,aout[]=new int[t],bout[]= new int[t],ind,aa[],bb[],llcm;
    for(i=0;i<t;i++)
    {
        n=ss.nextInt();
        bb=new int[(n/2)];
        aa=new int[(n/2)];
        LCM=new int[(n/2)];
        for(j=0;j<(n/2);j++)
        {
            a=j;
            b=n-j;
            hcf=1;
            for(k=1;k<=Math.min(a,b);k++)
            if(a%k==0 && b%k==0)
            hcf=k;
            LCM[j]=(a*b)/hcf;
            aa[j]=a;
            bb[j]=b;
        }
        LCM[0]=0;
        ind=1;
        llcm=LCM[1];
        for(j=2;j<(n/2);j++)
        if(llcm>LCM[j])
        {
            llcm=LCM[j];
            ind=j;
        }
        aout[i]=aa[ind];
        bout[i]=bb[ind];
    }
    for(i=0;i<t;i++)
    {
        System.out.println(aout[i]);
        System.out.println(bout[i]);
    }
}
}
