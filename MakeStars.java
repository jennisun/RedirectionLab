import java.util.Scanner;
import java.util.ArrayList;

public class MakeStars {
  public static void main(String[] args) {
    // creates a Scanner object
    Scanner input = new Scanner(System.in);
    // reads an int value
    while (input.hasNextLine()) {

       Scanner data1 = new Scanner(input.nextLine());
       while (data1.hasNext()) {
         String k = data1.next();

         for (int i = 0; i < k.length(); i ++) {
           System.out.print('*');
         }
         System.out.print(' ');
       }
       System.out.print("\n");
    }
    input.close();
  }
}
