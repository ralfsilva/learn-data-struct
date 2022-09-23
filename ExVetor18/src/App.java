import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] idades = new int[10];

        Random rand = new Random();

        // int smaller = Integer.MAX_VALUE;
        // int larger = Integer.MIN_VALUE;
        // int positionSmaller = -1;
        // int positionLarger = -1;
        int smaller = Integer.MAX_VALUE;
        int larger = idades[0];
        int positionSmaller = 0;
        int positionLarger = 0;

        for (int i = 1; i < idades.length; i++) {
            idades[i] = rand.nextInt(100);            
            if (idades[i] > larger) {
                larger = idades[i];
                positionLarger = i;
            }
            else if (idades[i] < smaller) {
                smaller = idades[i];
                positionSmaller = i;
            }
        }

        // for (int i = 0; i < idades.length; i++) {
        //     idades[i] = rand.nextInt(100);

        //     if (idades[i] < smaller) {
        //         smaller = idades[i];
        //         positionSmaller = i;
        //     }
        //     if (idades[i] > larger) {
        //         larger = idades[i];
        //         positionLarger = i;
        //     }
        // }

        System.out.println("My smaller age: " + smaller + "\nPosition: " + positionSmaller);
        System.out.println("My large age: " + larger + "\nPosition: " + positionLarger);

    }
}
