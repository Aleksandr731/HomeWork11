import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static int leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    public static int recommendVersion(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        int iOS = 0;
        int android = 1;

        if (clientOs == iOS) {
            if (currentYear >= clientYear) {
                System.out.println("Установите обычную версию для iOS");
            } else {
                System.out.println("Установите облегченную версию для iOS");
            }
        } else if (clientOs == android) {
            if (currentYear >= clientYear) {
                System.out.println("Установите обычную версию для android");
            } else {
                System.out.println("Установите облегченную версию для android");
            }
        } else {
            System.out.println("ОС не поддерживается");
        }
        return clientOs;
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = -1;
        int days = 0;
        if (distance <= 20) {
            deliveryDays = days + 1;
        } else if (distance <= 60) {
            deliveryDays = days + 2;
        } else if (distance <= 100) {
            deliveryDays = days + 3;

        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        int leapYear = leapYear(year);
    }

    public static void task2() {
        recommendVersion(1, 2015);
    }
    public static void task3() {
        int deliveryDays = calculateDeliveryDays(60);
        System.out.println("Дней доставки: " + deliveryDays);

    }
}

