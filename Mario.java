/**
 * Created by iHAL on 4/18/15.
 */
import java.io.Console;

public class Mario {

    public static void main(String[] args) {
        Console input = System.console();
        int height = -1;
        while (height < 0 || height > 23) { 
            try {
               String hgtstr = input.readLine("Height: ");
               height = Integer.parseInt(hgtstr);
            } catch (NumberFormatException e) {
            }
        }

        Pyramid pyramid = new Pyramid();
        pyramid.setHeight(height);

        pyramid.drawPyramid();
    }
}
