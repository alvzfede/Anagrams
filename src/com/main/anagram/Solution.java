package com.main.anagram;

public class Solution {
	
	public static boolean isAnagram(String str1, String str2){
		boolean isAnagram=false;
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		char[] arr1= str1.toCharArray();
		char[] arr2= str2.toCharArray();
		
		for(int i=0;i<arr1.length;i++){
			
			char letter= arr1[i];
			boolean foundIt= false;
			for(int j=0;j<arr2.length;j++){
				char letter2 = arr2[j];
				if(letter==letter2)
					foundIt=true;
				
			}
			if(foundIt){
				isAnagram = true;
			}
			else{
				isAnagram = false;
				break;
				 
			}
			
		}
	
		return isAnagram;
		
		
	}
	

}
