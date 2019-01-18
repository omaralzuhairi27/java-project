package Week8.Reflection;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    private Predicate <Double> condation;
    private Function <Double, String> display;

    public Thermostat(Predicate <Double> condation, Function <Double, String> display) {
        this.condation = condation;
        this.display = display;
    }

    public String sense(Double degree) {
        if (condation.test(degree)) {
            return "Warning!";
        }
        return display.apply(degree);
    }

}
