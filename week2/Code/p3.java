/**
 * @author Wenjie Hou
 * @Email wenjie.hou@tum.de
 * @Date 2019-10-22
 */
public class p3 {

  public static int gen(int gen){
    if (gen == 0)
      return 0;
    if (gen == 1)
      return 1;
    else
      return 2 * population(gen - 1);
  }

  public static int population(int gen){
    if (gen < 3)
      return gen(gen);
    else
      return gen(gen) - (gen > 3 ? gen(gen - 3) - gen(gen - 4) : 0);
  }

  public static void main(String[] args) {
    int input = MiniJava.readInt();
    MiniJava.write(population(input));

  }
}
