public class Main {
    public static void main(String[] args) {
        int height = 4;

        for (int row = 1; row <= height; row++) {
            for (int asterisk = 1; asterisk <= row; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
