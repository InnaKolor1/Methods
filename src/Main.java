import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int year = 2025;
        boolean leapYear = leapYear(year);
        printLeapYear(leapYear, year);


        System.out.println(" Задача 2 ");
        int clientPhoneOs = 0;
        int clientDeviceYear = 2017;
        int currentYear = LocalDate.now().getYear();
        downloadAppVersionForYourDevice(clientDeviceYear, clientPhoneOs);

        System.out.println(" Задача 3 ");
        int distance = 13;
        System.out.println(calculateDeliveryDays(distance));
    }

    //Задача1//
    public static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public static void printLeapYear(boolean leap, int year) {
        if (leap) {
            System.out.println(year + "  год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Задача2//
    public static void downloadAppVersionForYourDevice(int clientDeviceYear, int clientPhoneOs) {

        if (clientPhoneOs == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            }

        } else if (clientPhoneOs == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установить обычную версию для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию для Android по ссылке");

            }
        }
    }

    //Задача3//
    public static String calculateDeliveryDays(int distance) {
        int deliveryDays;

        if (distance < 0) {
            return "Недопустимое расстояние";
        } else if (distance < 20) {
            deliveryDays = 1;
        } else if (distance < 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        } else {
            return "Доставка недоступна на расстояния более 100 км";
        }
        return "Это занимает " + deliveryDays + " день";
    }
}