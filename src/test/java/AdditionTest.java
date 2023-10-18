import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @org.junit.jupiter.api.Test
    void add() {
        int result= Addition.add(3,3);
        int correct= 6;
        assertEquals(6,result);
    }
}