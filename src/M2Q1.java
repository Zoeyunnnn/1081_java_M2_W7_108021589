import java.util.Scanner;

public class M2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float v1 = sc.nextFloat();
        float max = v1;
        float min = v1;

        for (int i = 1; i < 9; i++) {
            v1 = sc.nextFloat();
            if (max < v1) {
                max = v1;
            } else if (min > v1) {
                min = v1;
            }
        }
        System.out.printf("%.2f\n", max);
        System.out.printf("%.2f\n", min);

    }
}

