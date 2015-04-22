import java.util.Scanner;

/**
 * Created by iHAL on 4/18/15.
 */
public class Mario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Height: ");
        int height = input.nextInt();

        Pyramid pyramid = new Pyramid();
        pyramid.setHeight(height);

        pyramid.drawPyramid();
    }
}
