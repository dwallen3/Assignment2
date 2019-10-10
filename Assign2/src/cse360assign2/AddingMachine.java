/*
 * Dustin Allen, Side R Row E seat 10, Assignment 2
 * this file contains the class and methods that we will be using for this
 * assignment in which we are using github to make a repository using this file
 */
package cse360assign2;
/*
 * The purpose of this class is to do all of the operations of the methods in 
 * this class
 */
public class AddingMachine {
	
	private int total;
	private String returnStr = "0"; // string that gets returned
	
	public AddingMachine () { // the object to add all the operations
	
	}
	
	public int getTotal () { // returns the number stored in the total
		return total;
	}
	
	public void add (int value) { // adds to total
		total += value;
		returnStr += " + " + value;
		
	}
	
	public void subtract (int value) { // subtracts from total
		total += value;
		returnStr += " - " + value;
		
	}
	
	public String toString () { // returns string of all the math operations
		return returnStr;
		
	}
	
	public void clear() { // clears string
		
	}

}
