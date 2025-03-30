public class Main {
    public static void main(String[] args)


  System.out.println(" Задача1 ");
    public class LeapYearChecker {
        public static void main(String[] args) {
            checkLeapYear(2021);
        }

        public static void checkLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");
            }
        }
    }

        System.out.println(" Задача2 ");

import java.time.LocalDate;

    public class AppInstaller {
        public static void main(String[] args) {
            suggestAppVersion(0, 2014); // пример вызова метода
        }

        public static void suggestAppVersion(int osType, int deviceYear) {
            int currentYear = LocalDate.now().getYear();
            if (deviceYear < currentYear) {
                if (osType == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (osType == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                if (osType == 0) {
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                } else if (osType == 1) {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                }
            }
        }
    }
    System.out.println(" Задача3 ");

    public class DeliveryCalculator {
        public static void main(String[] args) {
            int days = calculateDeliveryDays(95); // пример вызова метода
            System.out.println("Потребуется дней: " + days);
        }

        public static int calculateDeliveryDays(int deliveryDistance) {
            if (deliveryDistance <= 20) {
                return 1;
            } else if (deliveryDistance <= 60) {
                return 2;
            } else if (deliveryDistance <= 100) {
                return 3;
            } else {
                return -1; // Возвращаем -1, если доставка невозможна
            }
        }
    }

    }
