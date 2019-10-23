import java.util.Scanner;

public class M2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2;
        boolean flog = true;

        for (int i=2;i<m;i++){
            if (n%i == 0){
                flog = false;
                break;
            }
        }
        if (flog){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
