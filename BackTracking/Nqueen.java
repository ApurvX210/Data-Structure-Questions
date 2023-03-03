import java.util.ArrayList;

public class Nqueen {
    static boolean isvalid(int x, int y, int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i != y && arr[x][i] == 1) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != x && arr[i][y] == 1) {
                return false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (x - i >= 0 && y - i >= 0 && arr[x - i][y - i] == 1) {
                return false;
            }
            if (x - i >= 0 && y + i < arr.length && arr[x - i][y + i] == 1) {
                return false;
            }
            if (x + i < arr.length && y - i >= 0 && arr[x + i][y - i] == 1) {
                return false;
            }
            if (x + i < arr.length && y + i < arr.length && arr[x + i][y + i] == 1) {
                return false;
            }
        }
        return true;
    }

    static void soln(int n, int x, int y, ArrayList<ArrayList<Integer>> A, int[][] arr, ArrayList<Integer> a) {
        if (isvalid(x, y, arr)) {
            if (x == n - 1) {
                a.add(y+1);
                A.add(new ArrayList<>(a));
                a.remove(a.size() - 1);
                return;
            }
            arr[x][y] = 1;
            a.add(y+1);
            for (int i = 0; i < n; i++) {
                soln(n, x + 1, i, A, arr, a);
            }
            a.remove(a.size() - 1);
            arr[x][y] = 0;
        }
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int arr[][] = new int[n][n];
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            soln(n, 0, i, A, arr, a);
        }
        return A;

    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };
        ArrayList<ArrayList<Integer>> A = nQueen(4);
        System.out.println(A);
    }
}
