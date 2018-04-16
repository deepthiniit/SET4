package com.niit;

public class Program24 {
	public static int squaringAndCubingOfElements(int[] a){
		int n1=0,n2=0;
		for(int i=0;i<a[i];i++)
			if(i%2==0)
				n1+=(a[i]*a[i]*a[i]);
			else
				n2+=(a[i]*a[i]);
		return (n1+n2);
	}
	public static void main(String[] args) {
			int a[]={1,2,3,4,5,6};
			System.out.println(squaringAndCubingOfElements(a));
		}
}
