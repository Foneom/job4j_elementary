package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < word.length; i++) {
                if (word[word.length - 1] == post[post.length - 1] &&
                        word[word.length - 2] == post[post.length - 2]) {
                    return true;
                }
        }
        return false;
    }
}
