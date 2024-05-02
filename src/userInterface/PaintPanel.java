





package userInterface;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
import java.util.ArrayList;
import labTasks.*;
public class PaintPanel extends JPanel  {
    private static final long serialVersionUID = 1L;
    private ArrayList <Chair> chairListe = new ArrayList<Chair>();
    private ArrayList <Desk> deskListe = new ArrayList<Desk>();
    public  PaintPanel (){
        int furnitures = 3;
        for ( int i = 0 ; i<furnitures;i++ ) {
            Chair chair = new Chair();
            chairListe.add(chair);
        } //chairs erzeugen und in Liste speichern
        for ( int i = 0 ; i < chairListe.size();i++){
            chairListe.get(i).setX(getRandomValue());
            chairListe.get(i).setY(getRandomValue());
        } //chairs x-y values

        for ( int i = 0; i<furnitures;i++){
            Desk desk = new Desk();
            deskListe.add(desk);
        } // desks erzeugen und in Liste speichern
        for (int i =0 ;i<deskListe.size(); i++)
        {
            deskListe.get(i).setX(getRandomValue());
            deskListe.get(i).setY(getRandomValue());
        }// desks x-y values
    }
    @Override
    public void paint(Graphics g2d) {
        Graphics2D graphic2d =  (Graphics2D) g2d;
        for (Chair chair : chairListe) {
            chair.paintFurniture((Graphics2D) g2d);
        } //chair malen
        for (Desk desk : deskListe) {
            desk.paintFurniture((Graphics2D) g2d);
        }//desk malen
    }
    public int getRandomValue() {
        Random random = new Random();
        return random.nextInt(0,700);
    }
}