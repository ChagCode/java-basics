public class Variable {
  public static void main(String[] args) {
    System.out.println("------------------------------- Задача 1 ----------------------------");
    int john = 100; // У Джона 100$
    int nick = 5 * 100; // у Ника в 5 раз больше
    // сколько у них всего денег
    System.out.println("Денег у Джона и Ника -> " + (john + nick));

    System.out.println("------------------------------- Задача 2 ----------------------------");
    // сколько в числе лет, месяцев и дней
    int numb = 10000;
    int years = numb / 365;
    int months = (numb - (years * 365)) / 30;
    int days = numb - (years *365) - (months * 30);

    System.out.println("В числе " + numb + " лет -> " + years);
    System.out.println("В числе " + numb + " месяцев-> " + months);
    System.out.println("В числе " + numb + " дней -> " + days);

    System.out.println("------------------------------- Задача 3 ----------------------------");
    double radius = 10.8;
    double pi = 3.14;
//    float radius = 10.8f;
//    float pi = 3.14f;
    double area = pi * radius * radius;
    System.out.println("Площать круга = " + area);
  }
}
