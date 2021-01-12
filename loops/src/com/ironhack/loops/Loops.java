package com.ironhack.loops;

public class Loops {

//    create a new project where you iterate over an array of integers and update each position of this array by multiplying that value by the value of the next position. The last positicion must be multiplied by the first position of the array.
//            Example
//    input: [5, 4, 3, 2, 1]
//    output: [20, 12, 6, 10, 5] // Explanation 5*4, 4*3, 3*2, 1*5
//
//
//    in the same project create a method to invert an array
//            Example
//    input: [1, 2, 3, 4, 5]
//    output: [5, 4, 3, 2, 1]

    public static void main(String[] args) {

        int[] arrayInt = {5, 4, 3, 2, 1};
        int[] result = multiplyNext(arrayInt);

        for(int elem: result) {
            System.out.println(elem);
        }

        int[] arrayInt2 = {1, 2, 3, 4, 5};
        int[] reverseResult = reverse(arrayInt2);
        for(int elem: reverseResult) {
            System.out.println(elem);
        }
    }

    public static int[] multiplyNext(int[] arrayInt) {

        for (int i=0; i<arrayInt.length; i++)
        {
            if (i + 1 == arrayInt.length) {
                arrayInt[i] = arrayInt[i] * arrayInt[0];
            }
            else {
                arrayInt[i] = arrayInt[i] * arrayInt[i + 1];
            }
        }
        return arrayInt;
    }

    public static int[] reverse(int[] arrayInt) {
        int[] newArrayInt = new int[arrayInt.length];

        for(int i=0; i<newArrayInt.length; i++) {
            newArrayInt[i] = arrayInt[newArrayInt.length-i-1];
        }

        return newArrayInt;
    }
}
