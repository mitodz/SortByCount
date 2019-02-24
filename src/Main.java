import java.util.Scanner;

public class Main {

    public static int[] sortByCount (int[]a, int m) {
        int[]b = new int[m];
        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        for (int j = 1; j < m; j++) {
            b[j] = b[j] + b[j - 1];
        }
        int [] res = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            res[b[a[i]]-1] = a[i];
            b[a[i]]--;
        }
        return res;
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[]res = sortByCount(a, 10);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
