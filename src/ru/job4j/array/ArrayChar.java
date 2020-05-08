package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith (char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < pref.length; j++) {
                if (word[i] == pref[j] && word[i+1] == pref[j+1]){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return result;
    }
}
