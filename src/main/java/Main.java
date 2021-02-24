public class Main {

  public static void main(String[] args) {
    String program = args[0];
    Calculator calculator = new Calculator();
    int a;
    int b;
    String first;
    String second;

    switch(program) {
      case "add" :
        first = args[1];
        second = args[2];
        a = Integer.parseInt(first);
        b = Integer.parseInt(second);
        System.out.println(calculator.add(a, b));
        break;
      case "subtract" :
        first = args[1];
        second = args[2];
        a = Integer.parseInt(first);
        b = Integer.parseInt(second);
        System.out.println(calculator.subtract(a, b));
        break;
      case "multiply" :
        first = args[1];
        second = args[2];
        a = Integer.parseInt(first);
        b = Integer.parseInt(second);
        System.out.println(calculator.multiply(a, b));
        break;
      case "divide" :
        first = args[1];
        second = args[2];
        a = Integer.parseInt(first);
        b = Integer.parseInt(second);
        System.out.println(calculator.divide(a, b));
        break;
      case "fibonacci" :
        first = args[1];
        a = Integer.parseInt(first);
        System.out.println(calculator.fibonacciNumberFinder(a));
        break;
      case "binary" :
        first = args[1];
        a = Integer.parseInt(first);
        System.out.println(calculator.intToBinaryNumber(a));
        break;
      default:
        System.out.println("invalid command");
    }

  }
}
