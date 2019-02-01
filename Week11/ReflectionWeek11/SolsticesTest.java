package Week11.ReflectionWeek11;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesTest {
    Solstices solstices=new Solstices();

    @Test
    void getSummerSolsticeCountdown() {

        LocalDate date=LocalDate.of(2019,02,01);
        String summerSolsticeCountdown = solstices.getSummerSolsticeCountdown(date);


    }
    @Test
    void getWinterSolsticeCountdown() {
        LocalDate date=LocalDate.of(2019,02,01);
        String summerSolsticeCountdown = solstices.getWinterSolsticeCountdown(date);


    }
}