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

		System.out.println(val + "s digits added = " + total);
		return total;
		
	}
	

	static String[] ones = {
		"one",
		"two",
		"three",
		"four",
		"five",
		"six",
		"seven",
		"eight",
		"nine",
		"ten",
		"eleven",
		"twelve",
		"thirteen",
		"fourteen",
		"fifteen",
		"sixteen",
		"seventeen",
		"eighteen",
		"nineteen"
	};
	
	static String[] tens = {
			"ten",
			"twenty",
			"thirty",
			"fourty",
			"fifty",
			"sixty",
			"seventy",
			"eighty",
			"ninty"
	};
	
	
	static String hundred = "hundred";
	
	
	static String thousand = "thousand";
	
	
	public String toWords(int val) {
		
		String output = "";
		
		if (val <= 19) {
			output = ones[val-1];
		} else {
			
			int numOnes = getCharacter(val, 1);
			output = ones[numOnes - 1];
			
			if (stringLength(val) >= 1) {
				int numTens = getCharacter(val, 1);
				output = tens[numTens - 1] + " " + output;
			} 
			
			if (stringLength(val) >= 2) {
				int numHundred = getCharacter(val, 1);
				output = ones[numHundred - 1] + " " + hundred + " " + output;
			}
			
			if (stringLength(val) >= 3) {
				int numThousand = getCharacter(val, 0);
				output = ones[numThousand - 1] + " " + thousand + " " + output;
				
			}
			
		}
		
		System.out.println(output);
		return output;
		
	}
	
	
}
