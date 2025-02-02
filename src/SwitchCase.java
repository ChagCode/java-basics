public class SwitchCase {
  public static void main(String[] args) {
       /*
    System.out.println("------------------------------- Задача 1 ----------------------------");
    int month = 5;
    switch (month) {
      case 1:
        System.out.println("январь");
        break;
      case 2:
        System.out.println("февраль");
        break;
      case 3:
        System.out.println("март");
        break;
      case 4:
        System.out.println("апрель");
        break;
      case 5:
        System.out.println("май");
        break;
      case 6:
        System.out.println("июнь");
        break;
      case 7:
        System.out.println("июль");
        break;
      case 8:
        System.out.println("август");
        break;
      case 9:
        System.out.println("сентябрь");
        break;
      case 10:
        System.out.println("октябрь");
        break;
      case 11:
        System.out.println("ноябрь");
        break;
      case 12:
        System.out.println("декабрь");
        break;
      default:
        System.out.println("Значение отсутствует");
    } */
    System.out.println("------------------------------- Задача 2 ----------------------------");
    int numbMonth = 122;
    switch (numbMonth) {
      case 12, 1, 2:
        System.out.println("Зима"); break;
      case 3, 4, 5:
        System.out.println("Весна"); break;
      case 6, 7, 8:
        System.out.println("Лето"); break;
      case 9, 10, 11:
        System.out.println("Осень"); break;
      default:
        System.out.println("Время года отсутствует");
    }
  }
}
