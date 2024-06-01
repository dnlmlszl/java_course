package prog_tetelek;

public class Kereses {
    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int valueToFind = 3;

        boolean found = contains(array, valueToFind);

        System.out.println("A tömb elemei: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nAz érték " + valueToFind + (found ? " megtalálható" : " nem található") + " a tömbben.");
    }
}
