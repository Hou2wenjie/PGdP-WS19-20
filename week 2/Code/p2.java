import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Wenjie Hou
 * @Email wenjie.hou@tum.de
 * @Date 2019-10-22
 */
public class p2 {

  public static boolean isPrime(int num){
    for (int i = 2; i < num; i++){
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static void factorisation(int num){
    if (num < 1)
      MiniJava.write("Fehler: n>1 erwartet!");
    int factor = 2;
    int tem = num;
    ArrayList<Integer> results = new ArrayList<>();
    while (tem != 1){
      if (tem % factor == 0 && isPrime(factor)){
        results.add(factor);
        tem = tem / factor;
      } else
        factor++;
    }
    String str = results.stream().map(Object::toString).collect(Collectors.joining(" "));
    MiniJava.write(str);
  }

  public static void main(String[] args) {
    int num = MiniJava.readInt("Zahl eingeben:");
    factorisation(num);
  }

}
