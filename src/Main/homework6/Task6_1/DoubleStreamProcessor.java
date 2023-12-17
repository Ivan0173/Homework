package homework6.Task6_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.DoubleStream;

public class DoubleStreamProcessor {
//    public static void main(String[] args){
//        double[] arrayDouble = new double[]{1,2,3,4,5,-5.954363456345634563456346346777,6,0,7,5,0,7,6};
//        long numberOfZeros = numberOfZerosInTheStream(Arrays.stream(arrayDouble));
//        System.out.println(numberOfZeros);
//
//        System.out.println(isFractionalNumber(Arrays.stream(arrayDouble)));
//
//        System.out.println(maximumDifference(Arrays.stream(arrayDouble)));
//
//        double[] arrayValuesIsLarger = arrayValuesIsLarger(Arrays.stream(arrayDouble),3);
//        for (double number: arrayValuesIsLarger){
//            System.out.println(number);
//        }
//
//        System.out.println(maxLengthValue(Arrays.stream(arrayDouble)));
//    }

    static long  numberOfZerosInTheStream(DoubleStream doubleStream){
        long numberOfZeros = doubleStream.filter(e->e==0).count();
        return numberOfZeros;
    }
    static boolean  isFractionalNumber(DoubleStream doubleStream){
        return doubleStream.anyMatch(e->Math.round(e)!=e);
    }

    static double  maximumDifference(DoubleStream doubleStream){
        double[] sortArray = doubleStream.sorted().toArray();
        if(sortArray.length>0) {
            double maximumDifference = Math.abs(sortArray[sortArray.length - 1] - sortArray[0]);
            return maximumDifference;
        }else return 0;
    }

    static double[]  arrayValuesIsLarger(DoubleStream doubleStream, double limit){
        final double finalLimit = limit;
        double[] arr = doubleStream.filter(e->e>finalLimit).toArray();
        return arr;
    }

    static double  maxLengthValue(DoubleStream doubleStream){
            String numberString = doubleStream.mapToObj(e -> Double.toString(e))
                    .max(Comparator
                            .comparing(e -> e.toString().length()))
                    .get();
            return Double.parseDouble(numberString);
        }
}

