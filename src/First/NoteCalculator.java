package First;
import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, kimya, muzik;

        Scanner s = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = s.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = s.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = s.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = s.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = s.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = s.nextInt();

        double average = (mat + kimya + muzik + tarih + turkce + fizik) / 6;
        String gectiKaldi = (average >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(gectiKaldi);


    }
}
