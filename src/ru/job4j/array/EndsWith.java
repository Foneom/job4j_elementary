package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < post.length; j++) {
                if (word[i] == post[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

