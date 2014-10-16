package pl.umk.coursejava;

/**
 * Created by macias on 16.10.14.
 */
public class Rot13Encoder {
    public String encrypt(String abc) {

        String result="";

        for(Character c : abc.toCharArray()) {
            Integer position = Integer.valueOf(c);
            position+=13;
            result+=Character.toChars(position)[0];
        }

        return result;
    }
}
