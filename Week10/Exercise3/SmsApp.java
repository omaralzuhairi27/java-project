package Week10.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsApp {

    public void ratioBetweenHamAndSpam(List <Sms> sms) {
        Integer size = sms.size();
        String collect = sms.stream()
                .map(e -> e.getTitle())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + "  " + e.getValue() * 100 / size)
                .collect(Collectors.joining("% ", "Ham/spam ratio: ", "%"));
        System.out.println(collect);
    }
    public void mostUsedHamWord(List<Sms> sms){

        String words = getWordsAsString(sms);
        Map <String, Long> wordsCount = Stream.of(words.split(" "))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Optional <String> first = wordsCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        if(first.isPresent()){
            System.out.println("Most used ham word: "+first.get());
        }
    }

    public void mostUsedHamLetter(List<Sms> sms){
        String words =getWordsAsString(sms);
        words=words.replaceAll(" ","");

        Map <String, Long> letterCount = Stream.of(words.split(""))

                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Optional <String> first = letterCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        if(first.isPresent()){
            System.out.println("Most used ham Letter:"+first.get());
        }else {
            Optional.empty();
        }
    }

    private String getWordsAsString(List <Sms> sms) {
        return sms.stream()
                    .map(e -> e.getText().replaceAll(",", ""))
                    .map(e -> e.replaceAll("\\.", ""))

                    .collect(Collectors.joining());
    }

    public void LongestSpamSms(List<Sms> sms){
        Optional <Integer> spam = sms.stream()
                .filter(e -> e.getTitle().equals("spam"))
                .map(e -> e.getText().length())
                .sorted((e1, e2) -> e2.compareTo(e1))
                .findFirst();
        if(spam.isPresent()){
            System.out.println("Longest spam message: "+spam.get());
        }


    }

    public static void main(String[] args) {
        SmsReader smsReader = new SmsReader();
        List <Sms> sms = smsReader.smsAsList("Week10/Exercise3/sms.csv");
        SmsApp smsApp = new SmsApp();
        smsApp.ratioBetweenHamAndSpam(sms);
        smsApp.mostUsedHamWord(sms);
        smsApp.mostUsedHamLetter(sms);
        smsApp.LongestSpamSms(sms);

    }
}
