package Week8.Exercise;

public class HashTagMark implements Decrypt {
    @Override
    public String decrypt(String line) {
        String newLine = line.replaceAll("#", "");
        return newLine.replaceAll("robomime", "");

    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("#");
    }

}
