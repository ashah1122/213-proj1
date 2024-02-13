/**
 * Represents a calendar date with year, month, and day fields.
 * Provides functionality to validate the date and compare it with other Date instances.
 * Includes leap year calculation for accurate date validation.
 *
 * @author aeshashah
 */
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    // Constants for month lengths and leap year calculations
    public static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUATERCENTENNIAL = 400;

    /**
     * Constructs a Date with specified year, month, and day.
     *
     * @param year the year part of the date
     * @param month the month part of the date, 1 through 12
     * @param day the day part of the date
     */
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Checks if this date is valid according to the Gregorian calendar.
     *
     * @return true if the date is valid, false otherwise
     */
    public boolean isValid() {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        if (month == 2 && isLeapYear()) {
            return day <= 29;
        }
        return day <= DAYS_IN_MONTH[month];
    }

    /**
     * Determines whether the specified year is a leap year.
     *
     * @return true if the year is a leap year, false otherwise
     */
    private boolean isLeapYear() {
        if (year % QUATERCENTENNIAL == 0) {
            return true;
        } else if (year % CENTENNIAL == 0) {
            return false;
        } else {
            return year % QUADRENNIAL == 0;
        }
    }

    /**
     * Compares this Date with another Date for order.
     *
     * @param other the Date to be compared
     * @return a negative integer, zero, or a positive integer as this Date is less than, equal to, or greater than the specified Date
     */
    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return this.year - other.year;
        } else if (this.month != other.month) {
            return this.month - other.month;
        } else {
            return this.day - other.day;
        }
    }
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day); // Formats the date as "YYYY-MM-DD"
    }

    public static void main(String[] args) {
        // Valid date
        System.out.println(new Date(2024, 1, 31).isValid()); // Should print true
        // Invalid date
        System.out.println(new Date(2024, 2, 30).isValid()); // Should print false
        // Leap year
        System.out.println(new Date(2024, 2, 29).isValid()); // Should print true
        System.out.println(new Date(2023, 2, 29).isValid()); // Should print false
        System.out.println(new Date(2024, 4, 31).isValid()); // Should print false
        System.out.println(new Date(0, 0, 0).isValid()); // Should print false
        System.out.println(new Date(2024, 1, 0).isValid()); // Should print false
    }

    // Getters and setters
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
}
