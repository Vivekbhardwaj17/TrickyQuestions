package hackerrank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberHackos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dayReturned = scan.nextInt();
        int monthReturned = scan.nextInt();
        int yearReturned = scan.nextInt();

        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();

        LocalDate dateExpected = LocalDate.of(yearExpected, monthExpected, dayExpected);
        LocalDate dateReturned = LocalDate.of(yearReturned, monthReturned, dayReturned);

        long fine = 0;

        if(dateReturned.isAfter(dateExpected)) {

            if ( dateExpected.getYear() == dateReturned.getYear() ) {
                if (dateExpected.getMonth() == dateReturned.getMonth()) {
                    long differenceDays = ChronoUnit.DAYS.between(dateExpected, dateReturned);
                    fine = 15 * differenceDays;
                } else {
                    long differenceMonths = ChronoUnit.MONTHS.between(dateExpected, dateReturned);
                    fine = 500 * differenceMonths;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
}
