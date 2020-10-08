/**
* The AddingMachine program is a basic calculator
* that will display the output using toString.
*
* @author  Aidan Hoppe
* @version 1.0
* @since   2020-October-7 
*/
package cse360assignment02;

import java.util.ArrayList;

public class AddingMachine {
	
	public static void main(String[] args) {
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(4);
		myMachine.subtract(2);
		myMachine.add(5);
		myMachine.add(10);
		myMachine.subtract(2);
		myMachine.subtract(6);
		System.out.println(myMachine);
	}
	
  private int total;
  private ArrayList<String> signList;
  private ArrayList<String> numList;
  private String returnString;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    signList = new ArrayList<String>();
    numList = new ArrayList<String>();
    numList.add("0");
    returnString = "";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  signList.add("+");
	  numList.add(Integer.toString(value));
  }

  public void subtract (int value) {
	  total -= value;
	  signList.add("-");
	  numList.add(Integer.toString(value));
  }

  public String toString () {
	  for(int i = 0; i< signList.size(); i++) {
		  returnString = returnString + numList.get(i);
		  returnString = returnString + " ";
		  returnString = returnString + signList.get(i);
		  returnString = returnString + " ";
	  }
	  returnString = returnString + numList.get(numList.size()-1);
	  System.out.println(returnString);
    return returnString;
  }

  public void clear() {
	  signList = new ArrayList<String>();
	  numList = new ArrayList<String>();
	  returnString = "";
  }
}