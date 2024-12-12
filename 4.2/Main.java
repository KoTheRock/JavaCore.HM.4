import java.util.Date;
import java.time.LocalDate;

public class Main {

    public enum Holiday {
        NO_HOLIDAY(null), // Нет праздника
        NEW_YEAR(LocalDate.of(2025, 1, 1)),
        WOMEN_DAY(LocalDate.of(2025, 3, 8)),
        DEFENDER_DAY(LocalDate.of(2025, 2, 23));
        private final LocalDate date;

        Holiday(LocalDate date) {
            this.date = date;
        }

        public LocalDate getDate() {
            return date;
        }
    }

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Полина"),
                new Employee("Алена"),
                new Employee("Анатолий"),
                new Employee("Илья")
        };

        System.out.println(toGetСongrats(LocalDate.now()));
    }
    public static String toGetСongrats(LocalDate currentDate) {
        String result;

        if (currentDate.equals(Holiday.DEFENDER_DAY.getDate())) {
            result = "Сongrats to all males";
        } else if (currentDate.equals(Holiday.WOMEN_DAY.getDate())) {
            result = "Сongrats to all female";
        } else if (currentDate.equals(Holiday.NEW_YEAR.getDate())) {
            result = "Сongrats to everyone";
        } else {
            result = "There is no holidays today";
        }
        return result;
    }
}
