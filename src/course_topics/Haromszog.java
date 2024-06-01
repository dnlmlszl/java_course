package course_topics;

public class Haromszog {
    public static double kerulet(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public static void main(String[] args) {

        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;

        // Kerület kiszámítása
        double perimeter = kerulet(sideA, sideB, sideC);

        // Eredmény kiírása
        System.out.println("A háromszög oldalai: " + sideA + ", " + sideB + ", " + sideC);
        System.out.printf("A háromszög kerülete: %.2f cm", perimeter);
    }
}
