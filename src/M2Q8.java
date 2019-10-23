import java.util.Scanner;

public class M2Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,sum=0;
        for (i=3;i<=n;i+=3){
            sum += i;
        }
        System.out.println(sum);
    }
}
