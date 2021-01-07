# Numbers

1. Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
2. Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
3. Expand on the method you wrote in Numbers 2 to allow the input 1-999.
4. Expand the method you wrote in Numbers 2 to allow the input 1-9999

```java
public class Runner {
	
	public static void main(String[] args) {
		
		StringMethods sm = new StringMethods();
		
		int value = 99999999;
		
		sm.addDigits(value);

	}
	
}

```

```java
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
```