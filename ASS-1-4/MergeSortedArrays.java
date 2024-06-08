import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 5, 7, 9};
        int[] arrayB = {2, 4, 6, 8, 10};

        int lengthA = arrayA.length;
        int lengthB = arrayB.length;

        int[] mergedArray = new int[lengthA + lengthB];

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        
        while (indexA < lengthA && indexB < lengthB) {
            if (arrayA[indexA] < arrayB[indexB]) {
                mergedArray[indexC++] = arrayA[indexA++];
            } else {
                mergedArray[indexC++] = arrayB[indexB++];
            }
        }

        
        while (indexA < lengthA) {
            mergedArray[indexC++] = arrayA[indexA++];
        }

        
        while (indexB < lengthB) {
            mergedArray[indexC++] = arrayB[indexB++];
        }

        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }
}