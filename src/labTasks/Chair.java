
    package labTasks;
    import java.awt.Color;
    import java.awt.Graphics2D;
    public class Chair extends abstractFurniture   {
        public void paintFurniture(Graphics2D g2d) {
            maleSitzFlaeche(g2d);
            maleRueckStuetze(g2d);
            maleStuhlBeine(g2d);
        }
        public void maleSitzFlaeche(Graphics2D g2d) {
            g2d.setColor(Color.BLUE);
            g2d.drawLine(getX(), getY(), getX() + 100, getY());
            g2d.drawLine(getX(), getY(), getX(), getY() + 100);
            g2d.drawLine(getX(), getY() + 100, getX() + 100, getY() + 100);
            g2d.drawLine(getX() + 100, getY(), getX() + 100, getY() + 100);
        }
        public void maleRueckStuetze(Graphics2D g2d) {
            g2d.setColor(Color.BLUE);
            g2d.drawLine(getX(), getY(), getX() - 25, getY() - 50);
            g2d.drawLine(getX(), getY() + 100, getX() - 25, getY() + 50);
            g2d.drawLine(getX() - 25, getY() - 50, getX() - 25, getY() + 50);
        }
        public void maleStuhlBeine(Graphics2D g2d) {
            g2d.drawLine(getX() + 100, getY(), getX() + 125, getY() + 25);
            g2d.drawLine(getX() + 100, getY() + 100, getX() + 125, getY() + 125);
            g2d.drawLine(getX(), getY() + 100, getX() + 25, getY() + 125);
        }
    }
