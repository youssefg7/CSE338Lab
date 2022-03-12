import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class watermelonTest {
    @Test
    public void firstTest(){
        String testData = "2"; //2 corner case, even but can't be divided into 2 even numbers
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(watermelon.main(),false);
    }
    @Test
    public void secondTest(){
        String testData = "100"; //even >2 divided into 2 even numbers
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(watermelon.main(),true);
    }
    @Test
    public void thirdTest(){
        String testData = "69"; //odd can't be divided into 2 even numbers
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(watermelon.main(),false);
    }
}