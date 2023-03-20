package ru.jenia.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        boolean isSolution = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    isSolution = true;
                    result = new int[] {i, j};
                    break;
                }
            }
            if (isSolution) {
                break;
            }
        }
        return isSolution ? result : new int[0];
    }
}
