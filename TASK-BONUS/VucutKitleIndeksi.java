public class VkiHesapla {
    public static void main(String[] args) {
      
        double kilo = 55.0;
        double boy = 1.68;

        double vki = kilo / (boy * boy);

        System.out.println("Kilo (kg): " + kilo);
        System.out.println("Boy (m): " + boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", vki);
    }
}
