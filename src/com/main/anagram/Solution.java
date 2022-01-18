package com.main.anagram;

public class Solution {
	
	public static boolean isAnagram(String str1, String str2){
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		for(int i=0;i<str1.length();i++){
			boolean foundIt= false;
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j))
					foundIt=true;
			}
			if(!foundIt){
				return false;
			}
			
		}
	
		return true;
		
		
	}
	

}
