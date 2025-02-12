
public class array {
    public static void main(String[]args) {
        System.out.println("Array");

        // gli array di java sono di lunghezza fissa
        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;


        // System.out.println(numbers[1]);
        // numbers[1] = 40;
        // System.out.println(numbers[1]);

        // ciclare su un array

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}