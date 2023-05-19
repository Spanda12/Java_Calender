import java.util.Calendar;
import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a month and year
        System.out.println("Please enter a month (1-12): ");
        int month = sc.nextInt()-1; // month is 0-based
        System.out.println("Please enter a year: ");
        int year = sc.nextInt();

        // Print the calendar for the input month and year
        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        // Create a calendar object
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);

        // Set the first day of the month
        cal.set(Calendar.DAY_OF_MONTH, 1);

        // Get the first day of the month (Monday, Tuesday, etc.)
        int firstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

        // Get the number of days in the month
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the calendar
        System.out.println("    " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.US) + " " + cal.get(Calendar.YEAR));
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print the empty spaces before the first day of the month
        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int i = 1; i <= daysInMonth; i++) {
            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }
            if ((i + firstDayOfMonth - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
