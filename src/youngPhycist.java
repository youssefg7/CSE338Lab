import java.util.Scanner;
public class youngPhycist {
    public static boolean main() {
        int x = 0, y = 0, z = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x += scanner.nextInt();
            y += scanner.nextInt();
            z += scanner.nextInt();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
            return true;
        }else {
            System.out.println("NO");
            return false;
        }
    }
}
