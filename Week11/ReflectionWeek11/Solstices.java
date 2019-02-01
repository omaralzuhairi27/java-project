package Week11.ReflectionWeek11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

public class Solstices {
    LocalDate now=LocalDate.now();

    public  String getSummerSolsticeCountdown(LocalDate localDate){
        Optional <String> first = SommerWinterAsList.aslist().stream()
                .filter(e -> e.checkDate(localDate))
                .map(e -> e.message(localDate))
                .findFirst();
        return first.get();
    }
    public String getWinterSolsticeCountdown(LocalDate localDate){
        Optional <String> first = SommerWinterAsList.aslist().stream()
                .filter(e -> e.checkDate(localDate))
                .map(e -> e.message(localDate))
                .findFirst();
        return first.get();
    }


}
