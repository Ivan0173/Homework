package Main.homework1.Task2_2;

import java.util.Scanner;

public class CountdownMain {
    public static void main(String[] args) {
        int totalNumberMinutes = 1443;
        if (args.length > 0) {
            try {
                totalNumberMinutes = Integer.parseInt(args[0]);
            } catch (Exception e) {
            }
        } else {
            System.out.println("Введите количество минут:");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextInt()) {
                    totalNumberMinutes = scanner.nextInt();
                } else {
                    scanner.nextLine();
                    System.out.println("Ошибка. Введите количество минут ещё раз:");
                }
            }
        }
        if (totalNumberMinutes <= 0) {
            System.out.println("Уже началось!!!");
        } else {
            int days = totalNumberMinutes / 1440;
            int hours = (totalNumberMinutes % 1440) / 60;
            int minutes = (totalNumberMinutes % 1440) % 60;
            System.out.println(days + choosingEndForDay(days) + ", " + hours + choosingEndForHours(hours) +
                    ", " + minutes + choosingEndForMinutes(minutes));
        }
    }

    static String choosingEndForDay(int days) {
        String suitableFormDay = " ";
        if (days > 10 && days < 20) {
            suitableFormDay = " дней";
        } else {
            int lastDigitCountDays = days % 10;
            switch (lastDigitCountDays) {
                case 1:
                    suitableFormDay = " день";
                    break;
                case 2:
                case 3:
                case 4:
                    suitableFormDay = " дня";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    suitableFormDay = "дней";
                    break;
                default:
                    break;
            }
        }
        return suitableFormDay;
    }

    static String choosingEndForHours(int hours) {
        String suitableFormHours = " ";
        if (hours > 10 && hours < 20) {
            suitableFormHours = " часов";
        } else {
            int lastDigitCountDays = hours % 10;
            switch (lastDigitCountDays) {
                case 1:
                    suitableFormHours = " час";
                    break;
                case 2:
                case 3:
                case 4:
                    suitableFormHours = " часа";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    suitableFormHours = " часов";
                    break;
                default:
                    break;
            }
        }
        return suitableFormHours;
    }

    static String choosingEndForMinutes(int minutes) {
        String suitableFormMinutes = " ";
        if (minutes > 10 && minutes < 20) {
            suitableFormMinutes = " минут";
        } else {
            int lastDigitCountMinutes = minutes % 10;
            switch (lastDigitCountMinutes) {
                case 1:
                    suitableFormMinutes = " минута";
                    break;
                case 2:
                case 3:
                case 4:
                    suitableFormMinutes = " минуты";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    suitableFormMinutes = " минут";
                    break;
                default:
                    break;
            }
        }
        return suitableFormMinutes;
    }
}
