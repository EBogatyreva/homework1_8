package pro.sky.java.course1;
import java.time.LocalDate;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Задание 1.
        int currentYear = LocalDate.now().getYear();
        boolean isLeapYear = leapYear(currentYear);
        printIsLeapYear(currentYear, isLeapYear);

        //Задание 2.
        int realiseYear = LocalDate.now().getYear();
        int typeOfSystem = 0;

        boolean resultTypeOfVersion = typeOfVersion(realiseYear);
        String resultTypeOfSystem = typeOfSystem(typeOfSystem);
        printTypeOfVersion(resultTypeOfVersion, resultTypeOfSystem);

        //Задание 3.
        int deliveryDistance = 95;
        int days = numbersOfDeliveryDays(deliveryDistance);
        printNumbersOfDeliveryDays(days);

        //Задание 4.
        String s = "aabccddefgghiijjkk";
        String sort = sortString(s);
        findRepetition(sort);

        //Задание 5.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        viseVersa(reverseFullName);
    }

    //Задание 1.
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void printIsLeapYear(int currentYear, boolean isLeapYear) {
        if (isLeapYear) {
            System.out.println(currentYear + " високосный год");
        } else {
            System.out.println(currentYear + " не високосный год");
        }
    }

    //Задание 2.
    public static boolean typeOfVersion(int realiseYear) {
        if (realiseYear > 2015) {
            return true;
        } else return false;
    }

    public static String typeOfSystem(int typeOfSystem) {
        String a;
        if (typeOfSystem == 0) {
            a = "IOS";
        } else {a = "Android";}
        return a;
    }

    public static void printTypeOfVersion(boolean resultTypeOfVersion, String resultTypeOfSystem) {
        if (resultTypeOfVersion)
            System.out.println("Установите приложения для " + resultTypeOfSystem + " по ссылке");
        else
            System.out.println("Установите облегченную версию приложения для " + resultTypeOfSystem + " по ссылке");

    }

    //Задание 3.
    public static int numbersOfDeliveryDays(int deliveryDistance) {
        int days = 1;
        while (true) {
            if (deliveryDistance <= 20)
                return days;
            else if (deliveryDistance > 20 && deliveryDistance < 60) {
                days = days * 2;
                return days;
            } else days = days * 3;
            return days;
        }
    }

    public static void printNumbersOfDeliveryDays(int days) {
        System.out.println("Потребуется дней: " + days);
    }

    //Задание 4.
    public static String sortString(String sort) {
        char[] chars = sort.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }

    public static void findRepetition(String repetition) {
        int sLength = repetition.length();
        char[] c = repetition.toCharArray();

        for (int i = 0; i < sLength - 1; i++) {
            if (c[i] == c[i + 1]) {
                System.out.println("Присутствует дублирующие значения: " + c[i] + " " + c[i + 1]);
                break;
            } else System.out.println("Дублирующие значения не обнаружены");
        }
    }

    //Задание 5.
    public static void viseVersa(char[] reverseFullName) {
        int l = reverseFullName.length-1;
        for (int i = 0; i < l; i++, l--) {
            char c = reverseFullName[i];
            reverseFullName[i] = reverseFullName[l];
            reverseFullName[l] = c;
        }
        System.out.println(reverseFullName);
    }
    }
