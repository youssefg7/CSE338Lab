import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;
public class youngPhycistTest {
    @Test
    public void firstTest(){
        String testData = "3\n" +
                "4 1 7\n" +
                "-2 4 -1\n" +
                "1 -5 -3\n"; //sum of x,y,z forces separately !=0
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(youngPhycist.main(),false);
    }
    @Test
    public void secondTest(){
        String testData = "3\n" +
                "3 -1 7\n" +
                "-5 2 -4\n" +
                "2 -1 -3\n"; //sum of x,y,z forces separately ==0
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(youngPhycist.main(),true);
    }
    @Test
    public void thirdTest(){
        String testData = "3\n" +
                "3 -3 0\n" +
                "-5 5 0\n" +
                "7 0 -7\n"; //sum of all forces ==0 but not x,y,z separately
        System.setIn(new ByteArrayInputStream(testData.getBytes()));
        assertEquals(youngPhycist.main(),false);
    }
}