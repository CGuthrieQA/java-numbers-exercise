package com.qa.main;

public class StringMethods {
	
	public static String toString(int val) {
		
		String stringVal = "";
		stringVal = stringVal + val;
		
		return stringVal;
		
	}
	
	
	public static int stringLength(int val) {
		
		String output = toString(val);
		
		return output.length();
		
	}
	
	
	public static int getCharacter(int val, int charnum) {
		
		String stringVal = toString(val);
		
		char output = stringVal.charAt(charnum);
		
		return Character.getNumericValue(output);
		
	}
	

	public int addDigits(int val) {
		
		int total = 0;
		
		int i;
		
		for (i = 0; i < stringLength(val); i++) {
			
			total += getCharacter(val, i);
			
		}

		System.out.println(total);
		return total;
		
	}
	
}
