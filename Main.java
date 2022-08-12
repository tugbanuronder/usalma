import java.util.Scanner;

public class Main {

    static void usalma(int base,int exp){

        int result=1;

        for(int i=1 ; i<=exp ;i++){
            result *=base;
        }

        System.out.println("Sonuç :" + result);
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz:");
        int base=input.nextInt();
        System.out.print("Üs değerini giriniz:");
        int exp=input.nextInt();

        usalma(base,exp);
    }

}