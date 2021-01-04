import java.util.Scanner;
import java.util.ArrayList;

public class PigLatin {

  public static String pigLatinSimple(String s){
    String k = s.toLowerCase();
    if (k.charAt(0) == 'a' || k.charAt(0) == 'e' || k.charAt(0) == 'i' || k.charAt(0) == 'o' || k.charAt(0) == 'u') {
      return(k + "hay");
    }
    else return (k.substring(1, k.length()) + String.valueOf(k.charAt(0)) + "ay");
  }


  public static String pigLatin(String s){
    String k = s.toLowerCase();
    ArrayList<String> a = new ArrayList<String>();
    String[] b = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < b.length; i ++) {
      a.add(b[i]);
    }

    if (k.charAt(0) == 'a' || k.charAt(0) == 'e' || k.charAt(0) == 'i' || k.charAt(0) == 'o' || k.charAt(0) == 'u') {
      return (k + "hay");
    }
    else {
      if (k.length() >= 2 && a.contains(k.substring(0, 2))) return(k.substring(2, k.length()) + k.substring(0, 2) + "ay");
      else return(k.substring(1, k.length()) + String.valueOf(k.charAt(0)) + "ay");
    }
  }


  public static String pigLatinBest(String s){
    String k = s.toLowerCase();
    if (!(97 <= (int)k.charAt(0) && (int)k.charAt(0) <= 122)) return(k);
    else if (!(97 <= (int)k.charAt(k.length() - 1) && (int)k.charAt(k.length() - 1) <= 122)) return(pigLatin(k.substring(0, k.length() - 1)) + String.valueOf(k.charAt(k.length() - 1)));
    else return(pigLatin(k));
  }


  public static void main(String[] args) {
    // creates a Scanner object
  Scanner input = new Scanner(System.in);

  while (input.hasNextLine()) {

    Scanner data1 = new Scanner(input.nextLine());
    while (data1.hasNext()) {
      String k = data1.next();

      System.out.print(pigLatinBest(k.toLowerCase()) + ' ');
    }
    System.out.println("");
  }

  input.close();

  }
}
