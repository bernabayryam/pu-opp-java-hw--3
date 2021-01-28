package piece;

import java.awt.*;

public class Leader {
    private int row;
    private int column;
    private String color;

    public Leader() {
        this.row = row;
        this.column = column;
    }

    public void render(Graphics g) {

        if(this.row % 2 == column % 2) {

            g.setColor(Color.YELLOW);
            g.fillRect(470,51,40,40);

            g.setColor(Color.GREEN);
            g.fillRect(35,482,40,40);

        }
        }
    }
