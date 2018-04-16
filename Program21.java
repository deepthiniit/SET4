package com.niit;

import java.util.StringTokenizer;

public class Program21 {
	public static String extstr(String s1){
		StringTokenizer t=new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
	public static void main(String[] args) {
		String s1="hello.jpeg";
		System.out.println(extstr(s1));
	}
}
