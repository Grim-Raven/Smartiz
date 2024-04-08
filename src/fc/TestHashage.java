package fc;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHashage {
    @Test
    public void testsha256() {
        String input = "Hello World";
        String hash = Hashage.sha256(input);

        assertEquals("a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e", hash);
    }
}
