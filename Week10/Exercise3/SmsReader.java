package Week10.Exercise3;

import Week9.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    public List<Sms> smsAsList(String path){
        FileReader fileReader=new FileReader();
        return fileReader.asStream(path)
                .skip(1)
                .map(e->e.replaceAll(";;;",";"))
                .map(e->e.split(";"))
                .map(e-> new Sms(e[0],e[1]))
                .collect(Collectors.toList());
    }
}
