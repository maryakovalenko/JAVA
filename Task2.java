//Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Task2  {
  static boolean check(String[] str, String substr) {
    boolean res = false;
    for (String i : str) {
      if (i.contains(substr)) {
        res = true;
      } else
        return false;
    }
    return res;
  }
  public static void main(String[] args) {
    String[] str = new String[] {        };

    String pref = str[0];
    boolean flag = false;
    int endIndex = str[0].length();
    while (endIndex > 1 && !flag) {
      pref = str[0].substring(0, endIndex);
      flag = check(str, pref);
      endIndex--;
    }
    if (flag) {
      System.out.printf("Search prefix = %s\n", pref);
    } else {
      System.out.printf("NONE");

      System.out.println( );
    }
  }
}