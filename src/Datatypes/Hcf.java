package Datatypes;
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2 = sc.nextInt();
        int HCF = 1;
        for(int i = 1;i <= n1 || i <= n2 ; i++){
            if(n1 % i == 0 && n2 % i == 0){
                HCF = i;

            }
        }
        System.out.println("HCF is:" + HCF);


    }
}
