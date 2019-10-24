import java.util.Scanner;

public class M2Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0,sun = 1;
        for (int i=1;i<=n;i++){
            sun *= 2;
            sum += sun;
        }
        System.out.println(sum);
    }
}
