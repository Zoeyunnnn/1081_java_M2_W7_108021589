import java.util.Scanner;

public class M2Q10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0,i=1,j=1;
        for (i=1;i<=n;i++){
            for (j=1;j<n;j++){
              sum = i*j;
                System.out.print(sum+"\t");
            }
            System.out.println(i*(j));
        }
    }
}