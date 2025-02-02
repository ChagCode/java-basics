public class ArrayExample {
  public static void main(String[] args) {
    System.out.println("------------------------------- Задача 1 ----------------------------");
    String[] namesOfMonths = new String[12];
    namesOfMonths[0] = "январь";
    namesOfMonths[1] = "февраль";
    namesOfMonths[2] = "март";
    namesOfMonths[3] = "апрель";
    namesOfMonths[4] = "май";
    namesOfMonths[5] = "июнь";
    namesOfMonths[6] = "июль";
    namesOfMonths[7] = "август";
    namesOfMonths[8] = "сентябрь";
    namesOfMonths[9] = "октябрь";
    namesOfMonths[10] = "ноябрь";
    namesOfMonths[11] = "декабрь";

    for (int i = 0; i < namesOfMonths.length; i++) {
      System.out.print(namesOfMonths[i]);
      if (i < namesOfMonths.length - 1) {
        System.out.print(", ");
      } else {
        System.out.print(".");
      }
    }
    System.out.println();
    System.out.println("------------------------------- Задача 2 ----------------------------");
    int[] numb = {4, 67, 87,5, 3, 2, 72, 0, 23};

    for (int i = 0; i < numb.length; i++) {
      System.out.print(numb[i] + " ");
    }
    System.out.println();
    System.out.println("------------------------------- Задача 3 ----------------------------");
    int[] numb2 = {4, 67, 87, 5, 3, 2, 72, 0, 23};
    for (int i = numb2.length - 1; i >= 0; i--) {
      System.out.print((numb2[i] % 2 == 0) ? numb2[i] + " " : "");
    }
  }
}
