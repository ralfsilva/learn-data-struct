import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[10];

        int count = 0;
        // boolean flag = false;

        for (int i = 0; i < vectorA.length; i++) {
            // vectorA[i] = (int) Math.round(Math.random() * 10);
            vectorA[i] = sc.nextInt();

            if (vectorA[i] % 2 != 0) {
                System.out.println("Element odd, finished iteration.");
                break;
            }           
        }

        if (vectorA.length == 10) {
            System.out.println("All elements are pairs.");
        }
        
        sc.close();
    }
}
