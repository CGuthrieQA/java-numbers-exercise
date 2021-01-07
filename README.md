# Numbers

1. Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
2. Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
3. Expand on the method you wrote in Numbers 2 to allow the input 1-999.
4. Expand the method you wrote in Numbers 2 to allow the input 1-9999

```java
package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		StringMethods sm = new StringMethods();
		
		int value = 15;
		
		sm.addDigits(value);
		sm.toWords(value);

	}
	
}

```

```java
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

```