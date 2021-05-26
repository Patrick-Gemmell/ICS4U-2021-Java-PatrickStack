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
      stack.showStack();
      //stack.peek();
      System.out.println("The peeked element is: " + stack.peek());
      System.out.println("The value: " + stack.pop() + " got popped out");
      System.out.println("Clearing Stack");
      stack.clear();
      stack.showStack();
      // Catches and tells the user that an improper input was entered.

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: stack is empty");

    } catch (Exception e) {
      System.out.println("Error: Invalid input, not an integer");
    }
  }
}
