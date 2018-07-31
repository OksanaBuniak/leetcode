import java.util.*;

public class FizzBuzz {

 /*   public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {

            boolean isprinted = false;

            if (i % 3 == 0) {
                System.out.print("Fizz");
                isprinted = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                isprinted = true;
            }

            if (isprinted) {
                System.out.println();
            } else {
                System.out.println("\"" + i + "\"");
            }

        }
    } */


    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            
            String currentRow = "";

            if (i % 3 == 0) {
                currentRow = "Fizz";
            }
            if (i % 5 == 0) {
                currentRow = currentRow + "Buzz";
            }

            if (currentRow.length() != 0) {
                result.add(currentRow);
            } else {
                result.add(Integer.toString(i));
            }

        }
        return result;
    }

    public static void main(String[] args) {
        fizzBuzz(30);
    }
}
