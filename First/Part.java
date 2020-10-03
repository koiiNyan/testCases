/*
 * Simple class to use for writing JUnit as class exercise
 * Author: Renata Rand McFadden, PhD
 * Version 1
 * 
 * There are deliberate defects in the code
 * Comments in the code are to be treated as specification requirements and considered correct 
 */

public class Part {

	// attributes
	private char type;   	// component designation: E for engine, D for door, A for alternator
	private int number;     // part number with values from 10000 to 99999 
	private int price;		// price in dollars of the part (there are no cents)
	
	// constructor
	// Throws IllegalArgumentException if invalid value
	// Exception message for invalid value: "One or more of the parameters have invalid value"
	// t parameter can only be upper case characters: E, D, A  
	// n parameter must be a value between 10000 and 99999 inclusively
	// p parameter must be greater than 0
	// when all values are valid, assigns t to attribute type, n to attribute number and p to attribute price
	public Part(char t, int n, int p)
	{
		if (t != 'E' && t != 'D' && t != 'A')
			throw new NullPointerException("One or more of the parameters have invalid value");
		
		if (n < 10000 || n >= 99999)
			throw new IllegalArgumentException("One parameter has invalid value");

		if (p <= 0)
			throw new IllegalArgumentException("One or more of the parameters have invalid value");
		
		type = t;
		number = n;
		price = p;
	}
	
	// return current value of attribute type
	public int getType()
	{
		return type;
	}
	
	// return current value of attribute number
	public int getNumber()
	{
		return number;
	}
	
	// return current value of attribute number
	public int getPrice()
	{
		return price;
	}
	
	// returns part's data as String in the following format: "X YYYYY Z"
	// where X is the character for part number, YYYYY is the part number, and Z is the price value
	public String partData()
	{
		String result = "" + type + number + price;
		return result;
	}
}
