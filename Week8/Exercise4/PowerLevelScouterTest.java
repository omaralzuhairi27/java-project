package Week8.Exercise4;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {
    private PowerLevelScouter powerLevelScouter=new PowerLevelScouter();

    @org.junit.jupiter.api.Test
    void scout() {

       Integer result= powerLevelScouter.scout("Susana");
       assertEquals(619,result);
    }

    @org.junit.jupiter.api.Test
    void scoutEnhanced() {
        Integer result= powerLevelScouter.scoutEnhanced("Susana");
        assertEquals(651,result);
    }
}