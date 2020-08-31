/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 8/7/2020
 *   Time: 6:37 PM
 *   File: NumberOfDaysInMonth.java
 */

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1542));
        System.out.println(getDaysInMonth(1, 1336));
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else
            return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1) || year > 9999) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        } else
            switch (month) {
                case 2:
                    return 28;
                case 11:
                case 4:
                case 6:
                case 9:
                    return 30;
                default:
                    return 31;
            }
    }
}
