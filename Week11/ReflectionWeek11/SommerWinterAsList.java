package Week11.ReflectionWeek11;

import java.util.Arrays;
import java.util.List;

public class SommerWinterAsList {
    public static List<CheckSolstices> aslist(){
        return Arrays.asList(
                new Sommer(),
                new Winter()
        );
    }

}
