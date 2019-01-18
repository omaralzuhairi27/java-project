package Week8.Exercise;

public class ExclamationMark implements Decrypt {
    @Override
    public String decrypt(String line) {
        return  line.replaceAll("!", "");
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("!");
    }


}
