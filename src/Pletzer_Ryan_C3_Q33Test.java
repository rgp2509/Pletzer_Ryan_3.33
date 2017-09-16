import org.junit.Test;
import static org.junit.Assert.*;


public class Pletzer_Ryan_C3_Q33Test {

    @Test
    public void compareTest() throws Exception {
        double input1Cost = 10, input1Quantity = 10, input2Cost = 20, input2Quantity = 10;
        assertEquals("Less",Pletzer_Ryan_C3_Q33.compare(input1Cost,input1Quantity,input2Cost,input2Quantity));

    }

}