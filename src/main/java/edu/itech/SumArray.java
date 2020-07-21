package edu.itech;

import java.util.Scanner;

public class SumArray {
    int a[],n,s;
    float avg;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        { System.out.println("Enter"+(i+1)+"ele:");
            a[i]= sc.nextInt();
        }
    }
    void process()
    {
        s=0;
        for(int i=0;i<n;i++)
            s=s+a[i];
        avg=(float)s/n;
    }
    void output()
    {
        System.out.println("Sum="+s);
        System.out.println("Avg="+avg);
    }
}
