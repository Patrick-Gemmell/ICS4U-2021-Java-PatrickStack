/*
* This class creates an integer stack
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2020-05-18
*/

import java.util.ArrayList;  // Import the ArrayList class

public final class PatrickStack {
  /**
   * public stack.
   */
    public PatrickStack() {
  }
    // Initializing the array list field
  /**
  * private array.
  * @param stackAsArray
  */
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  // Method that adds user input to stack
  /**
  * adds integer to array.
  * @param inputNumber
  */
  public void push(final Integer inputNumber) {
    stackAsArray.add(inputNumber);
  }
  /**
  * returns shows stack.
  */
  public void showStack() {
    System.out.println(this.stackAsArray);
  }
  /**
  * peeks at first element.
  * @return
  * returns peeked element.
  */
  public Integer peek() {
    if (this.stackAsArray.size() <= 0) {
      throw new ArrayIndexOutOfBoundsException("Error: stack is empty.");
    } else {
      int peekElement;
      peekElement = stackAsArray.get(0);
      return peekElement;
    }
  }
  // Getter that tells the user the most recent input
  /**
  * pops the first element.
  * @return
  * returns pop.
  */
  public Integer pop() {
    if (this.stackAsArray.size() <= 0) {
      throw new ArrayIndexOutOfBoundsException("Error: stack is empty.");
    } else {
      Integer popElement;
      popElement = stackAsArray.remove(0);
      return popElement;
    }
  }
  /**
   * This method clears the stack of all values.
   */
  public void clear() {
    if (this.stackAsArray.size() <= 0) {
      throw null;
    } else {
      while (this.stackAsArray.size() > 0) {
        stackAsArray.remove(this.stackAsArray.size() - 1);
      }
    }
  }
}
