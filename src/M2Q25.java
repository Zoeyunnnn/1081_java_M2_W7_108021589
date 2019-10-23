import java.util.Scanner;

public class M2Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0,ct;
        boolean flag = true;
        for (int i=2;i<=n;i++){
            ct = i;
            for (;ct!=1;){
                if (ct%2==0){
                    ct /= 2;
                }else if (ct%3==0){
                    ct /= 3;
                }else if (ct%5==0){
                    ct /= 5;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag)sum +=i;
            flag = true;
        }
        System.out.println(sum);
    }
}
