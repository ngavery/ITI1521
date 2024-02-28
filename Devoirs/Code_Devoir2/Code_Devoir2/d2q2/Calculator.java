/**********************Q2-Devoir2 ITI1521*********/
public class Calculator {
  private double operand;
  private String operation;

  public Calculator() {
      operand = 0;
      operation = "";
  }

  public void setOperand(double value) {
      operand = value;
  }

  public void setOperation(String op) {
      operation = op;
  }

  public double compute() {
      switch (operation) {
          case "+":
              operand = operand + operand;
              break;
          case "-":
              operand = operand - operand;
              break;
          case "x":
              operand = operand * operand;
              break;
          case "/":
              if (operand != 0) {
                  operand = operand / operand;
              } else {
                  // Handle division by zero
                  System.out.println("Error: Division by zero");
              }
              break;
          case "!":
              // Implement factorial logic here
              operand = calculateFactorial((int) operand);
              break;
          case "^":
              operand = Math.pow(operand, operand);
              break;
          case "sqrt":
              operand = Math.sqrt(operand);
              break;
          case "ln":
              operand = Math.log(operand);
              break;
          default:
              // Handle unknown operation
              System.out.println("Error: Unknown operation");
              break;
      }

      // Reset operation after computation
      operation = "";
      return operand;
  }

  private double calculateFactorial(int n) {
      if (n == 0 || n == 1) {
          return 1;
      } else {
          return n * calculateFactorial(n - 1);
      }
  }

  public void clear() {
      operand = 0;
      operation = "";
  }

  public double display() {
      return operand;
  }
}

