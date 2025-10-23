public class MilKilometre {
    public static void main(String[] args) {
        // 1 mil = 1.609 km
        double milToKmOrani = 1.609;

        System.out.println("Mil\tKilometre");
        System.out.println("-----------------");

        int mil1 = 1;
        System.out.println(mil1 + "\t" + (mil1 * milToKmOrani));

        int mil5 = 5;
        System.out.println(mil5 + "\t" + (mil5 * milToKmOrani));

        int mil10 = 10;
        System.out.println(mil10 + "\t" + (mil10 * milToKmOrani));

        int mil20 = 20;
        System.out.println(mil20 + "\t" + (mil20 * milToKmOrani));

        int mil50 = 50;
        System.out.println(mil50 + "\t" + (mil50 * milToKmOrani));
    }
}
