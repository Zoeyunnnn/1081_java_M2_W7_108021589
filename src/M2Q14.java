import java.util.Scanner;

public class M2Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i=0;i<=n;i++){
            sum += i*(i+1);
        }
        System.out.println(sum);

    }
}
