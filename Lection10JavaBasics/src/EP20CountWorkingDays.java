import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EP20CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String input = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(input, formatter);
        input = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(input, formatter);


        int count = 0;

        formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
        LocalDate[] holidays = new LocalDate[11];
        holidays[0] = LocalDate.parse("1 Jan 1990", formatter);
        holidays[1] = LocalDate.parse("3 Mar 1990", formatter);
        holidays[2] = LocalDate.parse("1 May 1990", formatter);
        holidays[3] = LocalDate.parse("6 May 1990", formatter);
        holidays[4] = LocalDate.parse("24 May 1990", formatter);
        holidays[5] = LocalDate.parse("6 Sep 1990", formatter);
        holidays[6] = LocalDate.parse("22 Sep 1990", formatter);
        holidays[7] = LocalDate.parse("1 Nov 1990", formatter);
        holidays[8] = LocalDate.parse("24 Dec 1990", formatter);
        holidays[9] = LocalDate.parse("25 Dec 1990", formatter);
        holidays[10] = LocalDate.parse("26 Dec 1990", formatter);


        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            boolean isWorkingDay = true;
            for (int i = 0; i < holidays.length; i++) {

                if (date.getMonthValue() == holidays[i].getMonthValue() &&
                        date.getDayOfMonth() == holidays[i].getDayOfMonth()) {
                    isWorkingDay = false;

                }
            }

            if (date.getDayOfWeek().compareTo(DayOfWeek.SATURDAY) == 0 ||
                    date.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0) {
               isWorkingDay = false;

            }

            if (isWorkingDay){
                count++;
            }




        }
        System.out.println(count);

    }

}
