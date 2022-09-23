public class App {
    public static void main(String[] args) throws Exception {

        int[] vectorA = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);
        }

        boolean primo;
        String messanger;

        for (int i = 0; i < vectorA.length; i++) {

            primo = true;
            for (int j = 2; j < vectorA[i]; i++) {

                if (vectorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            messanger = "";
            if (primo) {
                messanger = " - Primo.";
            } else {
                messanger = " - Não é primo.";
            }

            System.out.println(vectorA[i] + messanger);
        }

    }
}
