package job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int j = 0; j < pref.length; j++) {
                if (word[j] != pref[j]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
