/**
 * @author Wenjie Hou
 * @Email wenjie.hou@tum.de
 * @Date 2019-10-23
 */
public class p4 {

  public static void main(String[] args) {
    int input = MiniJava.readInt();
    int sum = 0;

    for (int i = 0; i < input; i++) {
      if (i % 3 == 0 || i % 7 == 0)
        sum += i;
    }
    MiniJava.write(sum);
  }
}
