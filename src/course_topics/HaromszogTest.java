package course_topics;

public class HaromszogTest {
    public static void main(String[] args) {
        testKeruletWithPositiveSides();
        testKeruletWithZeroSides();
        testKeruletWithNegativeSides();
    }
    public static void testKeruletWithPositiveSides() {
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;
        double expectedPerimeter = 12.0;
        double actualPerimeter = Haromszog.kerulet(sideA, sideB, sideC);
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("testKeruletWithPositiveSides passed.");
        } else {
            System.out.println("testKeruletWithPositiveSides failed. Expected: " + expectedPerimeter + ", but got: " + actualPerimeter);
        }
    }
    public static void testKeruletWithZeroSides() {
        double sideA = 0.0;
        double sideB = 4.0;
        double sideC = 5.0;
        double expectedPerimeter = 9.0;
        double actualPerimeter = Haromszog.kerulet(sideA, sideB, sideC);
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("testKeruletWithZeroSides passed.");
        } else {
            System.out.println("testKeruletWithZeroSides failed. Expected: " + expectedPerimeter + ", but got: " + actualPerimeter);
        }
    }

    public static void testKeruletWithNegativeSides() {
        double sideA = -3.0;
        double sideB = 4.0;
        double sideC = 5.0;
        double expectedPerimeter = 6.0;
        double actualPerimeter = Haromszog.kerulet(sideA, sideB, sideC);
        if (expectedPerimeter == actualPerimeter) {
            System.out.println("testKeruletWithNegativeSides passed.");
        } else {
            System.out.println("testKeruletWithNegativeSides failed. Expected: " + expectedPerimeter + ", but got: " + actualPerimeter);
        }
    }
}
