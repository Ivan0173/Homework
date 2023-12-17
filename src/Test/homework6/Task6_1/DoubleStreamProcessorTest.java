package homework6.Task6_1;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoubleStreamProcessorTest {

    @Test
    void numberOfZerosInTheStream() {
        double[] arrayDouble = new double[]{1,2,3,4,5,-5.954363456345634563456346346777,6,0,7,5,0,7,6};
        assertEquals(2, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(arrayDouble)));
    }

    @Test
    void isFractionalNumber() {
    }

    @Test
    void maximumDifference() {
    }

    @Test
    void arrayValuesIsLarger() {
    }

    @Test
    void maxLengthValue() {
    }
}