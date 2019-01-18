package Week8.Reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    private Thermostat thermostat=new Thermostat(e->e<=0 && e>=80 ,t->"degrees Celsius");

    @Test
    void sense() {
        String message=thermostat.sense(0.0);
        String expected="Warning!";
        assertEquals(expected,message);
    }
}