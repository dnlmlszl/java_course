package prog_tetelek;

public class Osszegzes {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public static void osszegzestetel() {
        int[] array = {1, 2, 3, 4, 5}; // Példa tömb
        int sum = calculateSum(array);

        System.out.println("A tömb elemei: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nAz elemek összege: " + sum);

        int numberOfElements = array.length;
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int calculatedSum = numberOfElements * (firstElement + lastElement) / 2;

        System.out.println("Számított összeg: " + calculatedSum);
    }
    public static void main(String[] args) {
        osszegzestetel();
    }
}
