package quotes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuoteTest {
    @Test
    public void testQuotesWork() {
        Quote thisIsATest = new Quote("Call me Ishmael.", "Herman Melville");
        assertEquals("Call me Ishmael by Herman Melville", thisIsATest.toString());
    }
}
