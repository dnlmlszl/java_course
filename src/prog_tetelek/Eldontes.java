package prog_tetelek;

public class Eldontes {
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, -5, 6};
        int valueToFind = 4;

        boolean found = contains(numbers, valueToFind);

        String feedback = found ?
                String.format("A tömb tartalmazza a %d értéket.", valueToFind) :
                String.format("A tömb nem tartalmazza a %d értéket.", valueToFind);
        System.out.println(feedback);
    }
}
