public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Вы ввели что-то не то.");
        }
        System.out.println();
        System.out.println("Задача 2");
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 2020;
        if (year > 1584 && year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 0;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else {
            System.out.println("В ваш район, доставка не производится.");
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 22;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону - лето.");
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону - осень");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}