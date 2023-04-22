import java.util.Scanner;
public class Main {
    static void primeNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = input.nextInt();
        boolean isPrimeNumber = true;
        for (int i=2;i<a;i++){
            if(a%i==0){
                isPrimeNumber = false;
                System.out.println(a + " Bir Asal Sayı Değildir.");
                break;
            }
        }
        if (isPrimeNumber){
            System.out.println(a + " Bir Asal Sayıdır.");
        }
    }
    public static void main(String[] args) {

        primeNumber();

    }
}