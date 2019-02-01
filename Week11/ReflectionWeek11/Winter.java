package Week11.ReflectionWeek11;

import java.time.LocalDate;

public class Winter implements CheckSolstices {
    @Override
    public Boolean checkDate(LocalDate localDate) {
        LocalDate now = LocalDate.now();
        LocalDate end=LocalDate.of(localDate.getYear(),12,22);
        return  localDate.isAfter( now ) && localDate.isBefore( end );
    }

    @Override
    public String message(LocalDate localDate) {
        LocalDate end=LocalDate.of(localDate.getYear(),12,22);
        if(localDate.plusYears(1).isLeapYear() ){
            return localDate.getYear()+"-"+end.getMonth()+"-"+end.getDayOfMonth();
        }else{
            return localDate.getYear()+"-"+end.getMonth()+"-"+(end.getDayOfMonth()-1);
        }
    }
}
