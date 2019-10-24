import java.util.Scanner;

public class M2Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum+1d/((2*i-1)*(2*i));
        }
        System.out.println(sum);

    }
}
