package javagenerics;

import java.util.Scanner;

public class TestMaximum<TM extends Comparable<TM>> {
    TM firstValue, secondValue, thirdValue, fourthValue, fifthValue, sixthValue;

    public TestMaximum(TM firstValue, TM secondValue, TM thirdValue, TM fourthValue, TM fifthValue, TM sixthValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.fourthValue = fourthValue;
        this.fifthValue = fifthValue;
        this.sixthValue = sixthValue;
    }

    public TM maximum() {
        return TestMaximum.maximum(firstValue, secondValue, thirdValue, fourthValue, fifthValue, sixthValue);
    }

    public static <TM extends Comparable<TM>> TM maximum(TM firstValue, TM secondValue, TM thirdValue, TM fourthValue, TM fifthValue, TM sixthValue) {
        TM maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        if (fourthValue.compareTo(maxValue) > 0) {
            maxValue = fourthValue;
        }
        if (fifthValue.compareTo(maxValue) > 0) {
            maxValue = fifthValue;
        }
        if (sixthValue.compareTo(maxValue) > 0) {
            maxValue = sixthValue;
        }
        printMaximumValue(firstValue, secondValue, thirdValue, fourthValue, fifthValue, sixthValue, maxValue);
        return maxValue;
    }

    public static String TestMaximum(String firstValue, String secondValue, String thirdValue, String fourthValue, String fifthValue, String sixthValue) {
        String maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        if (fourthValue.compareTo(maxValue) > 0) {
            maxValue = fourthValue;
        }
        if (fifthValue.compareTo(maxValue) > 0) {
            maxValue = fifthValue;
        }
        if (sixthValue.compareTo(maxValue) > 0) {
            maxValue = sixthValue;
        }
        printMaximumValue(firstValue, secondValue, thirdValue, fourthValue, fifthValue, sixthValue, maxValue);
        return maxValue;
    }


    public static <TM> void printMaximumValue(TM firstValue, TM secondValue, TM thirdValue, TM fourthValue, TM fifthValue, TM sixthValue, TM maxValue) {
        System.out.printf("Maximum Value of %s , %s , %s , %s , %s , %s is %s \n", firstValue, secondValue, thirdValue, fourthValue, fifthValue, sixthValue, maxValue);
    }

    public static void main(String[] args) {
        Integer fistValueInt = 6, secondValueInt = 9, thirdValueInt = 16, fourthValueInt = 5, fifthValueInt = 13, sixthValueInt = 9;
        Float firstValueFlt = 17.9f, secondValueFlt = 4.9f, thirdValueFlt = 3.9f, fourthValueFlt = 5.98f, fifthValueFlt = 12.98f, sixthValueFlt = 9.98f;
        String firstValueStr = "CustardApple", secondValueStr = "Pomegranate", thirdValueStr = "DragonFruit", fourthValueStr = "KiwiFruit", fifthValueStr = "StrawBerry", sixthValueStr = "Papaya";

        new TestMaximum(fistValueInt, secondValueInt, thirdValueInt, fourthValueInt, fifthValueInt, sixthValueInt).maximum();
        new TestMaximum(firstValueFlt, secondValueFlt, thirdValueFlt, fourthValueFlt, fifthValueFlt, sixthValueFlt).maximum();
        new TestMaximum(firstValueStr, secondValueStr, thirdValueStr, fourthValueStr, fifthValueStr, sixthValueStr).maximum();
    }
}
