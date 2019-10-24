/**
 * @author Wenjie Hou
 * @Email wenjie.hou@tum.de
 * @Date 2019-10-22
 */
public class p1 {

  public static void add1(){
    int sum = 0;

    while (true){
      int input;
      input = MiniJava.readInt("Bitte Zahl eingeben:");
      sum += input;
      if (input == 0)
        break;
    }
    MiniJava.write("Summe:\n" + sum);
  }

  public static void add2(){
    int sum = 0;

    int input = 0;
    input = MiniJava.readInt("Bitte Zahl eingeben:");

    while (input != 0){
      sum += input;
      input = MiniJava.readInt("Bitte Zahl eingeben:");
    }
    MiniJava.write("Summe:\n" + sum);
  }

  public static void main(String[] args) {

  }
}
