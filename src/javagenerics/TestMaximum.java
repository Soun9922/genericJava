package javagenerics;

import java.util.Scanner;

public class TestMaximum<TM extends Comparable<TM>> {
    TM firstValue, secondValue, thirdValue;

    public TestMaximum(TM firstValue, TM secondValue, TM thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public TM maximum() {
        return TestMaximum.maximum(firstValue, secondValue, thirdValue);
    }

    public static <TM extends Comparable<TM>> TM maximum(TM firstValue, TM secondValue, TM thirdValue) {
        TM maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        printMaximumValue(firstValue, secondValue, thirdValue, maxValue);
        return maxValue;
    }


    public static <TM> void printMaximumValue(TM firstValue, TM secondValue, TM thirdValue, TM maxValue) {
        System.out.printf("Maximum Value of %s , %s and %s is %s \n", firstValue, secondValue, thirdValue, maxValue);
    }

    public static void main(String[] args) {
        Integer fistValueInt = 6, secondValueInt = 9, thirdValueInt = 2;
        Float firstValueFlt = 1.9f, secondValueFlt = 4.9f, thirdValueFlt = 3.9f;

        new TestMaximum(fistValueInt, secondValueInt, thirdValueInt).maximum();
        new TestMaximum(firstValueFlt, secondValueFlt, thirdValueFlt).maximum();
    }
}
