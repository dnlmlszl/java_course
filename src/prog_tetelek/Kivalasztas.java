package prog_tetelek;

public class Kivalasztas {
    public static int findSmallestPositive(int[] array) {
        int smallestPositive = Integer.MAX_VALUE;
        boolean found = false;

        for (int num: array) {
            if (num > 0 && num < smallestPositive) {
                smallestPositive = num;
                found = true;
            }
        }
        return smallestPositive;
    }
    public static void main(String[] args) {
        int[] numbers = {-1, 2, -3, 4, 5, -6};
            int smallestPositive = findSmallestPositive(numbers);
            String text = String.format("A tömb legkisebb pozitív száma: %d", smallestPositive);
            System.out.println(text);

    }
}
