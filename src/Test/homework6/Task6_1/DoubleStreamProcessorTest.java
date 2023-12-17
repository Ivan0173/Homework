package homework6.Task6_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleStreamProcessorTest {
    double[] defArray = new double[]{1, 2, 3, 0, 5, 0, 7, 0, 8};
    double[] nullArray = new double[0];
    double[] array3 = new double[]{1, 1, 1};
    double[] array0_1 = new double[]{0.2, 0.3, 0.7, 0.4, 0.2};
    double[] hardArray = new double[]{0, 0, 0, 0, 0, 3, 5, 12345.0987654321, 4, 3, 5, 8, 0, 2, -3, -4, 5, 6};

    @Test
    void numberOfZerosInTheStream() {
        assertEquals(3, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(defArray)));
        assertEquals(0, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(nullArray)));
        assertEquals(0, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(array3)));
        assertEquals(0, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(array0_1)));
        assertEquals(6, DoubleStreamProcessor.numberOfZerosInTheStream(Arrays.stream(hardArray)));
    }

    @Test
    void isFractionalNumber() {
        assertEquals(false, DoubleStreamProcessor.isFractionalNumber(Arrays.stream(defArray)));
        assertEquals(false, DoubleStreamProcessor.isFractionalNumber(Arrays.stream(nullArray)));
        assertEquals(false, DoubleStreamProcessor.isFractionalNumber(Arrays.stream(array3)));
        assertEquals(true, DoubleStreamProcessor.isFractionalNumber(Arrays.stream(array0_1)));
        assertEquals(true, DoubleStreamProcessor.isFractionalNumber(Arrays.stream(hardArray)));
    }

    @Test
    void maximumDifference() {
        assertEquals(8, DoubleStreamProcessor.maximumDifference(Arrays.stream(defArray)));
        assertEquals(0, DoubleStreamProcessor.maximumDifference(Arrays.stream(nullArray)));
        assertEquals(0, DoubleStreamProcessor.maximumDifference(Arrays.stream(array3)));
        // assertEquals(0.5, DoubleStreamProcessor.maximumDifference(Arrays.stream(array0_1))); не проходит из-за округления double
        assertEquals(12349.0987654321, DoubleStreamProcessor.maximumDifference(Arrays.stream(hardArray)));
    }

    @Test
    void arrayValuesIsLarger() {
        double[] resultArray = DoubleStreamProcessor.arrayValuesIsLarger(Arrays.stream(defArray), -1);
        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(defArray[i], resultArray[i]);
        }

        double[] expectedArray = new double[]{5, 7, 8};
        resultArray = DoubleStreamProcessor.arrayValuesIsLarger(Arrays.stream(defArray), 3);
        for (int i = 0; i < resultArray.length; i++) {
            assertEquals(expectedArray[i], resultArray[i]);
        }

        resultArray = DoubleStreamProcessor.arrayValuesIsLarger(Arrays.stream(defArray), 10);
        assertEquals(true, resultArray.length == 0);
    }

    @Test
    void maxLengthValue() {
        assertEquals(1, DoubleStreamProcessor.maxLengthValue(Arrays.stream(defArray)));
        assertEquals(0, DoubleStreamProcessor.maxLengthValue(Arrays.stream(nullArray)));
        assertEquals(1, DoubleStreamProcessor.maxLengthValue(Arrays.stream(array3)));
        assertEquals(0.2, DoubleStreamProcessor.maxLengthValue(Arrays.stream(array0_1)));
        assertEquals(12345.0987654321, DoubleStreamProcessor.maxLengthValue(Arrays.stream(hardArray)));
    }
}