import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void test1() {
        double[] arr = new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        assertEquals(41, Main.gps(20, arr));
    }

    @Test
    public void test2() {
        double[] arr = new double[]{0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        assertEquals(219, Main.gps(12, arr));
    }

}
