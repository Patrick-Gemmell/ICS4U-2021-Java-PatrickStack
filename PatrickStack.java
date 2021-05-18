/*
* This class creates an integer stack
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2020-05-18
*/

import java.util.ArrayList;  // Import the ArrayList class

public final class PatrickStack {
    private PatrickStack() {
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
  * returns integer.
  * @return
  * return integer.
  */
  // Getter that tells the user the most recent input
  public Integer getPushedNumber() {
    return this.stackAsArray.get(stackAsArray.size() - 1);
  }
}
