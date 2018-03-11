import java.util.Scanner;

public class Exam280817_P04_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patientNum = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
            }
            if (patientNum > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patientNum - doctors;
            } else {
                treatedPatients += patientNum;

            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

    }
}
