package homework6.Task6_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.DoubleStream;

public class DoubleStreamProcessor {

    static long numberOfZerosInTheStream(DoubleStream doubleStream) {
        long numberOfZeros = doubleStream.filter(e -> e == 0).count();
        return numberOfZeros;
    }

    static boolean isFractionalNumber(DoubleStream doubleStream) {
        return doubleStream.anyMatch(e -> Math.round(e) != e);
    }

    static double maximumDifference(DoubleStream doubleStream) {
        double[] sortArray = doubleStream.sorted().toArray();
        if (sortArray.length > 0) {
            double maximumDifference = Math.abs(sortArray[sortArray.length - 1] - sortArray[0]);
            return maximumDifference;
        } else return 0;
    }

    static double[] arrayValuesIsLarger(DoubleStream doubleStream, double limit) {
        final double finalLimit = limit;
        double[] arr = doubleStream.filter(e -> e > finalLimit).toArray();
        return arr;
    }

    static double maxLengthValue(DoubleStream doubleStream) {
        String numberString = doubleStream.mapToObj(e -> Double.toString(e))

                .max(Comparator
                        .comparing(e -> e.toString().length())).orElse("0");
        return Double.parseDouble(numberString);
    }
}

