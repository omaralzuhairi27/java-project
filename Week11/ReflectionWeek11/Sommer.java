package Week11.ReflectionWeek11;

import java.time.LocalDate;

public class Sommer implements CheckSolstices {


    @Override
    public Boolean checkDate(LocalDate localDate) {
        LocalDate now = LocalDate.now();
        LocalDate end = LocalDate.of(localDate.getYear(), 06, 21);
        return localDate.isAfter(now) && localDate.isBefore(end);
    }

    @Override
    public String message(LocalDate localDate) {
        LocalDate end = LocalDate.of(localDate.getYear(), 6, 21);
        if (localDate.isLeapYear()) {
            return localDate.getYear() + "-" + end.getMonth() + "-" + (end.getDayOfMonth() - 1);
        } else {
            return localDate.getYear() + "-" + end.getMonth() + "-" + end.getDayOfMonth();
        }
    }
}
