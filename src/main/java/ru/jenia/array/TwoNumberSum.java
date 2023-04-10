package ru.jenia.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        boolean solution = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    solution = true;
                    result = new int[] {i, j};
                    break;
                }
            }
            if (solution) {
                break;
            }
        }
        return solution ? result : new int[0];
    }
}
