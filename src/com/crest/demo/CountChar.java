package com.crest.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//here we are counting number of chars
public class CountChar {

	public static void main(String[] args) {
		 Map<Character, Integer>  mp = countChar("Manjunath");
		 for (Map.Entry<Character, Integer> mp2 : mp.entrySet() ) {
			 System.out.println(mp2.getKey() +"--"+mp2.getValue());
			
		}
		
	}

	private static Map<Character, Integer> countChar(String str) {
		
		
		Map<Character, Integer> cMap = new HashMap<>();
		
		for(int i =0;i<str.length();i++)
		{
			if(cMap.containsKey(str.charAt(i)))
			{
				int j =cMap.get(str.charAt(i));
				cMap.put(str.charAt(i), ++j);
			}
			else
			{
				cMap.put(str.charAt(i), 1);
			}
		}
		return cMap;
		
		
	}
}
