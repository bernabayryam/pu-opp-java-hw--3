package piece;

import java.awt.*;

public class Guard {
    private int row;
    private int column;
    private String color;

    public Guard() {
        this.row = row;
        this.column = column;

    }
    //Визуализация на жълтите гардове

    public void renderYellow(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillOval(140, 51, 40, 40);
        g.fillOval(140, 51, 40, 40);
        g.fillOval(255, 51, 40, 40);
        g.fillOval(370, 51, 40, 40);
    }
    //Визуализация на зелените гардове

        public void renderGreen(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillOval(470,482,40,40);
            g.fillOval(140,482,40,40);
            g.fillOval(255,482,40,40);
            g.fillOval(370,482,40,40);
        }

    public void render(Graphics g) {
    }
}
