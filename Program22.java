package com.niit;

public class Program22 {
	public static int commonElements(int[] a,int[] b){
		int c=0;
		for(int i=0;i<a[i];i++)
			for(int j=0;j<b[i];j++)
				if(a[i]==b[j]){
					c++;
				}
		return (2*c);
	}
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		int b[]={3,4,5,6,7};
		System.out.println(commonElements(a,b));
	}
}
