package job4j.condition;

public class Max {

    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, max(second, third));
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(first, max(second, third, fourth));
        return result;
    }
}
