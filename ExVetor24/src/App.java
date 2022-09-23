import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // input values
        int[] vectorA = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }

        boolean palindrome = true;
        for (int i = 0; i < (vectorA.length/2); i++) {
            if (vectorA[i] != vectorA[vectorA.length - i - 1]) {
                palindrome = false;
                System.out.println("Está executando aqui.");
                break;
            }
        }

        // output
        System.out.println("Vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }

        if (palindrome) {
            System.out.println("\nYes, it is pali1ndrome.");
        } else {
            System.out.println("\nIt is not palindrome.");
        }

        sc.close();

    }
}