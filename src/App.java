import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.next();
            char firstRepetitive = findFirstRepetitive(text);
            if (firstRepetitive != Character.MIN_VALUE) {
                System.out.println("\nFirst Repetitive: " + firstRepetitive + "\n");
            } else {
                System.out.println("\nAll characters are unique\n");
            }
        }
    }

    public static char findFirstRepetitive(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < text.length(); j++) {
                if (j != i) {
                    char c1 = text.charAt(j);
                    if (c == c1) {
                        isDuplicate = true;
                        break;
                    }
                }
            }
            if (isDuplicate) {
                return c;
            }
        }
        return Character.MIN_VALUE;
    }
}
