import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.example.helloworld.api.Saying;

public class TestSaying {

    @Test
    public void testGetContent() {
        // Setup
        Saying saying1 = new Saying(1, "John");
        Saying saying2 = new Saying(2, "");

        // Run
        // Verify
        assertEquals(saying1.getId(), 1);
        assertEquals(saying1.getContent(), "John");
        assertEquals(saying2.getId(), 2);
        assertEquals(saying2.getContent(), "");
    }

    @Test
    public void testUnrelated() {
        assertEquals(true, true);
    }
}