package Week11.Exercise2;


import Week11.Exercise3.ChangeHoursToWords;

public class MinuteTo implements CheckListClock   {
    ChangeHoursToWords changeHour=new ChangeHoursToWords();

    @Override
    public Boolean checkMinuts(Integer number) {
            return number < 30 && number >= 20;
    }

    @Override
    public String mesg(Integer hours, Integer minutes) {
        return changeHour.getIntegerStringMap(hours)+ " "+changeHour.getIntegerStringMap(minutes);

    }


}
