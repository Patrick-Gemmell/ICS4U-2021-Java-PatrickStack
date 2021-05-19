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
  */
  public void peek() {
    int peekElement;
    peekElement = stackAsArray.get(0);
    System.out.println(peekElement);
  }
  // Getter that tells the user the most recent input
  /**
  * pops the first element.
  * @return
  * returns pop.
  */
  public Integer pop() {
    Integer popElement;
    popElement = stackAsArray.remove(0);
    return popElement;
  }
}
