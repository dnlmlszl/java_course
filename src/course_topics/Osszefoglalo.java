package course_topics;

public class Osszefoglalo {
    static int[] sorozat = {3,1,7,2};
    public static void main(String[] args) {
        bemutatas();
    }

    private static void bemutatas() {
        System.out.println("osszegzes: " + osszegzes());
        String van = eldontes() ? "van" : "nincs";
        System.out.println(eldontes());
    }

    private static boolean eldontes() {
        int i = 0;
        while(i < sorozat.length && !(sorozat[i] % 2 == 1)) {
            i++;
        }

        return i < sorozat.length;
    }

    private static int osszegzes() {
        int osszeg = 0;
        for (int elem: sorozat) {
            osszeg += elem;
        }
        return osszeg;
    }

}
