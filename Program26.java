package com.niit;

public class Program26 {
	public static int noOfnonRepeatedCharacters(String s1){
		StringBuffer sb=new StringBuffer(s1);
		int n=0;
		for(int i=0;i<sb.charAt(i);i++)
			for(int j=0;j<sb.charAt(j);j++)
				if(sb.charAt(i)==sb.charAt(j)){
					sb.deleteCharAt(j);
					n++; }
				if(n>0){
					sb.deleteCharAt(n);
					}		
		return sb.length();
	}
public static void main(String[] args) {
		String s1="preethi";
		System.out.println(noOfnonRepeatedCharacters(s1));
	}
}
