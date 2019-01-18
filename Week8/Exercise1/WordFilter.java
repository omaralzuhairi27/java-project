package Week8.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WordFilter {



    public static void main(String[] args) {
        List<String> names=new ArrayList <>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        //WordFilter wordFilter=new WordFilter();
        System.out.println("Part1");
        System.out.println(names+"\n");

        System.out.println("Part2");
        names.removeIf(e->e.endsWith("e"));
        System.out.println(names+"\n");
        System.out.println("Part3");
        names.replaceAll(e -> e.toUpperCase());
        System.out.println(names+"\n");
        System.out.println("Part4");
        names.removeIf(e -> e.length() <6);
        System.out.println(names+"\n");
        System.out.println("Part5");
        names.forEach(name -> System.out.println(name));


    }
}
