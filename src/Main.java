
public class Main {
    public static void main(String[] args) {

        //задание 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //задание 2

        int clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0) {
            if (clientDeviceYear > 2014) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }   else {
            if (clientDeviceYear > 2014) {
                System.out.println("Установите  версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }


    }
}