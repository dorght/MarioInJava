/**
 * Created by iHAL on 4/18/15.
 */
import java.io.Console;

public class Mario {

    public static void main(String[] args) {
        Console input = System.console();
        String hgtstr = input.readLine("Height: ");
        int height = Integer.parseInt(hgtstr);

        Pyramid pyramid = new Pyramid();
        pyramid.setHeight(height);

        pyramid.drawPyramid();
    }
}
