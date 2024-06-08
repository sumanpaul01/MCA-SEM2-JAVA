import java.util.Arrays;
public class MergeFloatArrays {
    public static void main(String[] args) {
        float[] array1 = {1.5f, 2.5f, 3.5f};
        float[] array2 = {4.5f, 5.5f, 6.5f};

        
        int mergedLength = array1.length + array2.length;

        
        float[] mergedArray = new float[mergedLength];

        
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}