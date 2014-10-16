package pl.umk.coursejava;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class Rot13EncoderTest {

    @Test
    public void should_encrypt_text() {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("abc");
        assertThat(encryptedText).isEqualTo("nop");
    }

    @Test
    public void should_encrypt_other_text() {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("bcd");
        assertThat(encryptedText).isEqualTo("opq");
    }

    @Test
    public void should_encrypt_text_with_end_alphabet_letter() {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("xyz");
        assertThat(encryptedText).isEqualTo("klm");
    }

}