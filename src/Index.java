import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        double kilo, boy;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu (Kg Cinsinde) Giriniz : ");
        kilo = input.nextDouble();
        System.out.print("Lutfen Boyunuzu (Metre Cinsinde) Giriniz : ");
        boy = input.nextDouble();

        double bdi = (kilo / (boy * boy));
        System.out.print("Vucut Kitle Indexiniz : " + bdi);

    }
}
