public class ForEach {
  public static void main(String[] args) {
    String[] names = {"Nick", "Garri", "Helen", "Ivan"};
    System.out.println("------------------------------- Задача 1 ----------------------------");
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    System.out.println("------------------------------- Задача 2 ----------------------------");
    for (String name : names) {
      System.out.print(name + " ");
    }
    System.out.println();
    System.out.println("------------------------------- Задача 3 ----------------------------");
    int[] numbArray = new int[100];
    for (int i = 0; i < numbArray.length; i++) {
      numbArray[i] = i + 100;
    }
    for (int numb : numbArray) {
      System.out.print(numb + " ");
    }
  }
}
