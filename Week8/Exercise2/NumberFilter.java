package Week8.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {
    public List<Integer> filterNumber(List<Integer> numbers, Predicate<Integer> condation){
        List<Integer> newNumbers=new ArrayList <>();
        for (Integer number : numbers) {
            if(condation.test(number)){
                newNumbers.add(number);
            }
        }
        return newNumbers;

    }
    public List<Integer> getEven(List<Integer> numbers){
        return filterNumber(numbers,e->e%2==0);
    }
    public  List<Integer> getOdd(List<Integer> numbers){
        return filterNumber((numbers),e->e%2!=0);
    }
    
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,3,5,6,6,5,9);
        NumberFilter numberFilter=new NumberFilter();
        System.out.println(numberFilter.getEven(numbers));;
        System.out.println(numberFilter.getOdd(numbers));;

    }
}
