package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == pref[i] && word[i + 1] == pref[i + 1]) {
                return true;
            }
        }
        return true;
    }
}
