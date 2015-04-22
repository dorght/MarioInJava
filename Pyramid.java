/**
 * Pyramid class draws a half pyramid to the screen
 * Created by iHAL on 4/18/15.
 */
class Pyramid {
    private int height;
    private char block = '#';

    public void drawPyramid() {
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            // print required leading spaces
            for (int j = 0; j < height - i - 1; j++) {
                line.append(' ');
            }

            // print required number of block characters
            for (int j = 0; j < i + 1; j++) {
                line.append(block);
            }

            // add second block to end of pyramid row
            line.append(block);

            System.out.println(line.toString());
        }
    }


    public void setBlock(char block) {
        this.block = block;
    }

    public char getBlock() {
        return block;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

}
