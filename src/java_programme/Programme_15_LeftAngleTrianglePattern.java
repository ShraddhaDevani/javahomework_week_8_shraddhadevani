package java_programme;

/**
 * Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Programme_15_LeftAngleTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; //Number of rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
