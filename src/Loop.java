public class Loop {
  public static void main(String[] args) {
    System.out.println("------------------------------- Задача 1 ----------------------------");
    int i = 0;
    while (i <= 1000) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    }
    System.out.println("------------------------------- Задача 2 ----------------------------");
    int b = 0;
    do {
      System.out.println("Hello");
    } while (b > 0);

    System.out.println("------------------------------- Задача 3 ----------------------------");
    for (int j = 0; j < 1000; j += 10) {
      System.out.println(j);
    }
    System.out.println("------------------------------- Задача 4 ----------------------------");
    for (int j = 1000; j >= 0; j--) {
      if (j % 3 == 0) {
        System.out.println(j);
      }
    }
  }
}
