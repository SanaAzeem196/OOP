public class problem3pattern1 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            // Print the spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }


            // Print the numbers
            for (int k = rows; k >= i; k--) {
                System.out.print(" "+i);
            }

            System.out.println("");
        }
    }
}
