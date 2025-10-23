public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 358;
        int kalan = miktar;

        int yuzluk = kalan / 100;
        kalan = kalan % 100;

        int ellilik = kalan / 50;
        kalan = kalan % 50;


        int beslik = kalan / 5;
        kalan = kalan % 5;

        int ikilik = kalan / 2;
        kalan = kalan % 2;

        int birlik = kalan;

        System.out.println(miktar + " TL = "
                + yuzluk + "x100, "
                + ellilik + "x50, "
                + beslik + "x5, "
                + ikilik + "x2, "
                + birlik + "x1");
    }
}
