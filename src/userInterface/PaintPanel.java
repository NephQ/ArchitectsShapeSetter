package userInterface;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
import java.util.ArrayList;
import labTasks.*;
import javax.swing.JButton;
public class PaintPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<IFurniture> myFurnitureListe = new ArrayList<IFurniture>();

    public PaintPanel() {
        int furnitures = getRandomFurnitureNumber();
        for (int i = 0; i < furnitures; i++) {
            IFurniture chair = new Chair();
            IFurniture desk = new Desk();
            myFurnitureListe.add(chair);
            myFurnitureListe.add(desk);
        }
        for (int i = 0; i < myFurnitureListe.size(); i++) {
            myFurnitureListe.get(i).setX(getRandomValue());
            myFurnitureListe.get(i).setY(getRandomValue());
        }
    }
    @Override
    public void paint(Graphics g2d) {
        Graphics2D graphic2d = (Graphics2D) g2d;
        for (IFurniture furniture : myFurnitureListe) {
            furniture.paintFurniture((Graphics2D) g2d);
        }
    }

    public int getRandomValue() {
        Random random = new Random();
        return random.nextInt(0, 600);
    }

    public int getRandomFurnitureNumber() {
        Random random2 = new Random();
        return random2.nextInt(1, 6);
    }
}


