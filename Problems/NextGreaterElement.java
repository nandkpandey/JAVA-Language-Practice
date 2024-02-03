package Problems;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] input1 = {4, 5, 2, 25};
        int[] input2 = {13, 7, 6, 12};
        int[] input3 = {1, 2, 3, 4, 5};

        System.out.println("Next Greater Elements: " + Arrays.toString(findNextGreaterElements(input1)));
        System.out.println("Next Greater Elements: " + Arrays.toString(findNextGreaterElements(input2)));
        System.out.println("Next Greater Elements: " + Arrays.toString(findNextGreaterElements(input3)));
    }
}
