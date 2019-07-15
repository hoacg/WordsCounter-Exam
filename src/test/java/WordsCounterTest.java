import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsCounterTest {

    @Test
    public void testCount1() {
        String search = "   cỏ       xanh";
        int result = WordsCounter.count(search);
        int expected = 3;

        assertEquals(expected, result, "count `hoa vàng` should return 3");
    }

    @Test
    void testCount2() {
        String search = "hoa    vàng    trên  cỏ xanh";
        int result = WordsCounter.count(search);
        int expected = 3;
        assertEquals(expected, result, "count `hoa vàng trên cỏ xanh` should return 3");
    }

    @Test
    public void testCountZero() {
        String search = "hoa  xanh";
        int result = WordsCounter.count(search);
        int expected = 0;

        assertEquals(expected, result, "count `hoa xanh` should return 0");
    }
}
