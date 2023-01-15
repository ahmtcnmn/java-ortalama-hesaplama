import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,kim,fiz,tar;
        Scanner input =new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz;");
        mat = input.nextInt();

        System.out.print("Kimya notunuzu giriniz;");
        kim=input.nextInt();

        System.out.print("Fizik notunuzu giriniz;");
        fiz=input.nextInt();

        System.out.print("Tarih notunuzu giriniz;");
        tar=input.nextInt();

        double ort= mat+fiz+kim+tar;
        System.out.print("Ortalamanız = ");
        System.out.println(ort/4);
        String basari;
        basari = (ort>60)? "Sınıfı geçtiniz" : "Başaramadınız";
        System.out.print(basari);
    }
}