/**
 * Mario gets user input for how high to make a half pyramid then calls the
 * Pyramid class to print it to console
 * Created by iHAL on 4/18/15.
 */
import java.io.Console;

public class Mario {

    public static void main(String[] args) {
        Console input = System.console();
        int height = -1;

        // get input and verify format and range
        while (height < 0 || height > 23) { 
            try {
               String hgtstr = input.readLine("Height: ");
               height = Integer.parseInt(hgtstr);
            } catch (NumberFormatException e) {
            }
        }

        // print a pyramid of the inputted height
        Pyramid pyramid = new Pyramid();
        pyramid.setHeight(height);
        pyramid.drawPyramid();
    }
}
