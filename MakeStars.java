import java.util.Scanner;
import java.util.ArrayList;

public class MakeStars {
  public static void main(String[] args) {

    // creates a Scanner object
    Scanner input = new Scanner(System.in);

    ArrayList<String> a = new ArrayList<String>();
    String[] b = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < b.length; i ++) {
      a.add(b[i]);
    }


    while (input.hasNextLine()) {

      Scanner data1 = new Scanner(input.nextLine());
      while (data1.hasNext()) {
        String k = data1.next();

        if (k.charAt(0) == 'a' || k.charAt(0) == 'e' || k.charAt(0) == 'i' || k.charAt(0) == 'o' || k.charAt(0) == 'u') {
          System.out.print(k + "hay");
        }
        else {
          if (k.length() >= 2 && a.contains(k.substring(0, 2))) System.out.print(k.substring(2, k.length()) + k.substring(0, 2) + "ay");
          else System.out.print(k.substring(1, k.length()) + String.valueOf(k.charAt(0)) + "ay");
        }

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
