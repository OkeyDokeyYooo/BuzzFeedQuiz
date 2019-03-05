package buzzfeedquiz;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class CheckTest {
    @Test
    public void testCheckValid(){
        ByteArrayInputStream in = new ByteArrayInputStream("b".getBytes());
        System.setIn(in);
        Check testInput = new Check();
        testInput.checkValid();
        assertEquals(10,testInput.finalGrade);
    }


}