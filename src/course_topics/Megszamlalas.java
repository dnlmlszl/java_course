package course_topics;

public class Megszamlalas {
    public static int countElements(int[] array) {
        return array.length;
    }
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countOddElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void megszamlalastetel() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int totalCount = countElements(array);
        int evenCount = countEvenElements(array);
        int oddCount = countOddElements(array);

        System.out.println("A tömb elemei: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nAz elemek száma: " + totalCount);
        System.out.println("A páros számok száma: " + evenCount);
        System.out.println("A páratlan számok száma: " + oddCount);

    }


    public static void main(String[] args) {
        megszamlalastetel();
    }
}

