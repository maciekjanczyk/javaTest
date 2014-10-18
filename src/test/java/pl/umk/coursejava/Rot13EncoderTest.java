package pl.umk.coursejava;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class Rot13EncoderTest {

    @Test
    public void should_encrypt_text() throws UnrecognizedCharException {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("abc");
        assertThat(encryptedText).isEqualTo("nop");
    }

    @Test
    public void should_encrypt_other_text() throws UnrecognizedCharException {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("bcd");
        assertThat(encryptedText).isEqualTo("opq");
    }

    @Test
    public void should_encrypt_text_with_end_alphabet_letter() throws UnrecognizedCharException {
        Rot13Encoder encoder = new Rot13Encoder();

        String encryptedText=encoder.encrypt("xyz");
        assertThat(encryptedText).isEqualTo("klm");
    }

    @Test
    public void should_throw_error_when_char_is_unrecognized() {
        Rot13Encoder encoder = new Rot13Encoder();
        String encryptedText = "";
        try {
            encryptedText = encoder.encrypt("xyD");
        } catch (UnrecognizedCharException e) {
            assertThat(e.printErr()).isEqualTo("ERROR");
        }
    }

}