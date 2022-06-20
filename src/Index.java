/* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül = Kilo (kg) / Boy(m) * Boy(m) */

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, size;

        // Kullanıcıdan değerleri alıp formüle göre vücut kitle endeksini ekrana yazdırıyoruz.

        System.out.println();
        System.out.print("Lutfen Kilonuzu (Kg Cinsinde) Giriniz : ");
        weight = input.nextDouble();
        System.out.print("Lutfen Boyunuzu (Metre Cinsinde) Giriniz : ");
        size = input.nextDouble();
        System.out.println();

        double bdi = (weight / (size * size));
        System.out.println("Vucut Kitle Indexiniz : " + bdi);
    }
}