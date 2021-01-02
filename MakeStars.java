import java.util.Scanner;

public class MakeStars {
  public static void main(String[] args) {

    // creates a Scanner object
    Scanner input = new Scanner(System.in);

    // reads an int value
    while (input.hasNextLine()) {
      // Scanner data1 = new Scanner(input.nextLine());
      //
      // String k = data1.next();
      // String output = "";
      // for (int i = 0; i < k.length(); i ++) {
      //   if (k.charAt(i) != ' ') output += "*";
      //   else output += " ";
      // }
      // System.out.println(output);

      Scanner data1 = new Scanner(input.nextLine());
      while (data1.hasNext()) {
        String k = data1.next();

        if (k.charAt(0) == 'a' || k.charAt(0) == 'e' || k.charAt(0) == 'i' || k.charAt(0) == 'o' || k.charAt(0) == 'u') {
          System.out.print(k + "hay");
        }
        else System.out.print(k.substring(1, k.length()) + String.valueOf(k.charAt(0)) + "ay");

        // for (int i = 0; i < k.length(); i ++) {
        //   System.out.print('*');
        // }
        System.out.print(' ');
      }

      System.out.println("");
    }


    input.close();


  }

}
