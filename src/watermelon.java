import java.util.Scanner;
public class watermelon {
    public static boolean main() {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w != 2 && w % 2 == 0) {
            System.out.println("YES");
            return true;
        } else {
            System.out.println("NO");
            return false;
        }
    }
}
