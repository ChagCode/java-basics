public class CondOper {
  public static void main(String[] args) {
    System.out.println("------------------------------- Задача 2 ----------------------------");
    int temp = 26;
    if (temp > 25) {
      System.out.println("Кондиционер включен");
    } else {
      System.out.println("Кондиционер выключен");
    }

    System.out.println("------------------------------- Задача 2 ----------------------------");
    boolean isGoodWeather = false;
    boolean isNight = false;

    if (isNight) {
      System.out.println("Спать");
    }
    if (!isNight && isGoodWeather) {
      System.out.println("Гулять");
    }
    if (!isNight && !isGoodWeather) {
      System.out.println("Читать книгу");
    }

  }
}
