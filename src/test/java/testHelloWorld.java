import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testHelloWorld {
    @Test
    public void test(){
        assertEquals("Testing Hello world string","Hello World",helloWorld.welcome());
    }
}
