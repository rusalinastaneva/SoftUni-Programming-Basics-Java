import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {
        public static void main(String[] args) {
          Scanner consolein = new Scanner(System.in);
            LocalDate input = LocalDate.parse(consolein.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            String result = input.plusDays(999).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println(result);
    }
}

