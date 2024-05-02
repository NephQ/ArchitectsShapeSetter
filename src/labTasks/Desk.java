

package labTasks;
import java.awt.Color;
import java.awt.Graphics2D;
public class Desk implements IFurniture {
    private int x;
    private int y;
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getX() {
        return this.x;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public int getY() {
        return this.y;
    }


    @Override
    public void paintFurniture(Graphics2D g2d) {
        maleTischFlaeche(g2d);
        maleTischBeine(g2d);
    }
    public void maleTischFlaeche(Graphics2D g2d){
        g2d.setColor(Color.GRAY);
        g2d.drawLine(getX(),getY(),getX()+200,getY());
        g2d.drawLine(getX(),getY(),getX(),getY()+100);
        g2d.drawLine(getX(),getY()+100,getX()+200,getY()+100);
        g2d.drawLine(getX()+200,getY()+100,getX()+200,getY());
    }
    public void maleTischBeine(Graphics2D g2d){
        g2d.drawLine(getX(),getY()+100,getX()+25,getY()+125);
        g2d.drawLine(getX()+200,getY(),getX()+225,getY()+25);
        g2d.drawLine(getX()+200,getY()+100,getX()+225,getY()+125);
    }
}
