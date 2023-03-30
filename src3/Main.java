import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 15, 2, 3, 6, 55, 87, 1, -3, -8, 0};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));

    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        return mergeSortInner(buffer1, buffer2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result;

        if (sorted1 == buffer1) result = buffer2;
        else result = buffer1;

        while (index1 < middle && index2 < endIndex) {
            if (sorted1[index1] < sorted2[index2]) result[destIndex++] = sorted1[index1++];
            else result[destIndex++] = sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
