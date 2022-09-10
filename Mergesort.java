

import java.util.Random;

public class Mergesort{
    public static void sort(int a[],int low,int high)
    {
        int n=high-low;
        if(n<=1)
        return;
        int mid=low+n/2;
        sort(a,low,mid);
        sort(a,mid,high);
        int temp[]=new int[n];
        int i=low,j=mid;
        for(int k=0;k<n;k++)
        {
            if(i==mid)
            temp[k]=a[j++];
            else if(j==high)
            temp[k]=a[i++];
            else if(a[j]<a[i])
                temp[k]=a[j++];
            else{
                temp[k]=a[i++];
            }
        }
            for(int k=0;k<n;k++)
            {
                a[low+k]=temp[k];
            }


        }
        public static void main(String[] args) {
            System.out.println("Random no generated are");
            Random r=new Random();
            int []arr=new int[10];
            for(int i=0;i<5;i++)
            {
               arr[i]=r.nextInt(1000);
               System.out.println(arr[i]);
            }
            long Startime=System.nanoTime();
            sort(arr,0,5);
            double Endtime=System.nanoTime();
            double time=((Endtime-Startime)/(1000000));
            System.out.println("Elements afer sort is");
            for(int i=0;i<5;i++)
            {
                System.out.println(arr[i]);
            }
            System.out.println("total time to complete is "+ time+" miliseconds");
            
            
        }

    }