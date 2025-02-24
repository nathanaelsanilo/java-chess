package com.academy.app;

public class Translator {
    private static char[] letters = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
    private static char[] numbers = new char[] { '8', '7', '6', '5', '4', '3', '2', '1' };

    // example input e4 = [4, 4]
    public static int[] translate(String position) {
        char[] chars = position.toCharArray();
        char letter = chars[0];
        char number = chars[1];

        int row = 0;
        int col = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) {
                row = i;
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                col = i;
                break;
            }
        }

        return new int[] { col, row };

    }
}
