package com.crest.demo;

public class Demo1 {
public static void main(String[] args) {
	System.out.println("hello");
	
	String inputString ="9590533043";
	String str =String.format("(%s)%s-%s-%s",inputString.substring(0,3),inputString.substring(3,4),inputString.substring(4,7),inputString.substring(7));
System.out.println(str);
	System.out.println("Hello Crest");
}
}
