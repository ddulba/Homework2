package pl.javapoz25.dateandtime;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainDateTime {

    public static void main(String[] args) {

        //Exercise 9
        System.out.println("Exercise 9:");
        LocalTime currentTime = LocalTime.now();
        System.out.println("Aktualny czas: " + currentTime);

        //Exercise 10
        System.out.println("Exercise 10:");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Aktualna data: " + currentDate);

        //Exercise 11
        System.out.println("Exercise 11:");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Aktualna data i godzina: " + ldt);

        //Exercise 12
        System.out.println("Exercise 12:");
        LocalDate first = LocalDate.of(2017, 1, 1);
        LocalDate second = LocalDate.of(2017, 5, 5);
        Period result = Period.between(first, second);
        System.out.println("Od " + first + " do " + second + " minęło: " + result + " dni");

        //Exercise 13
        System.out.println("Exercise 13:");
        LocalTime clock1 = LocalTime.of(14, 11);
        LocalTime clock2 = LocalTime.of(18, 41);
        Duration duration = Duration.between(clock1, clock2);
        System.out.println("Od godziny " + clock1 + " do godziny " + clock2 + " minęło: " + duration);

        //Exercise 14
        System.out.println("Exercise 14:");
        LocalDateTime localTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Czas lokalny w Tokio: " + localTokyo);

        //Exercise 15
        System.out.println("Exercise 15:");
        LocalDateTime localBydgoszcz = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy , EEEE HH:mm:ss");
        System.out.println(formatter.format(localBydgoszcz));
    }
}
