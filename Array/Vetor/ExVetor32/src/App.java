import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[5];

        System.out.println("Enter with a number for multiplication table: ");
        int number = sc.nextInt();

        for (int i = 0; i < vectorA.length; i++) {
            
            vectorA[i] = number * (i+1);

            System.out.printf("%d x %d = %d%n", number, (i+1), vectorA[i]);
        }

        sc.close();

    }
}
