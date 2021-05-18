/*
* This program pushes a user inputed integer to a stack
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2020-05-18
*/

import java.util.Scanner;  // Import the Scanner class

public final class StackForm {
  private StackForm() {
  }
  /**
   * This function allows the user to add an inputted number to a stack.
   * @param args
   */
  public static void main(final String[] args) {
    try {
      // User input for integer to be added to stack
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter an Integer for the Stack: ");
      int numberChosen = userInput.nextInt();
      System.out.println();

      // Declaring stack by using the JacobStack class
      PatrickStack stack = new PatrickStack();

      // Placing the inputted integer on the stack
      stack.push(numberChosen);

      // Verifying the integer you just placed in the stack
      System.out.println("Pushed to ArrayList: " + stack.getPushedNumber());

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
