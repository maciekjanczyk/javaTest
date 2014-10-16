package pl.umk.coursejava;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by macias on 16.10.14.
 */
public class Rot13Encoder {

    public static final List<Character> ALPHABET=
            Lists.charactersOf("abcdefghijklmnopqrstuvwxyz");

    public String encrypt(String abc) {

        // Praca domowa :
        //
        String result="";

        for(Character c : abc.toCharArray()) {
            Integer position = ALPHABET.indexOf(c);
            result+=ALPHABET.get((position+13)%26);
        }

        return result;

    }
}
