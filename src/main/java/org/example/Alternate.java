package org.example;

public class Alternate {
    public static void main(String[] args) {
        int[] ints = {1, -1, 3, -1};
        System.out.println(isArrayAlternating(ints));
    }

    // Describing the method
    public static boolean isArrayAlternating(int[] ints) {
        if (ints == null || ints.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != ints[i + 1]*(-1)) {
            }
        }
        return false;
    }
}
