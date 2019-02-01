package Week11.Exercise2;

import Week11.Exercise3.ChangeHoursToWords;

public class MinutePast implements CheckListClock {
    ChangeHoursToWords changeHour=new ChangeHoursToWords();
    @Override
    public Boolean checkMinuts(Integer number) {
        return number > 0 && number <30;
    }

    @Override
    public String mesg(Integer hours, Integer minutes) {
        return changeHour.getIntegerStringMap(hours)+ " "+changeHour.getIntegerStringMap(minutes);
    }
}
