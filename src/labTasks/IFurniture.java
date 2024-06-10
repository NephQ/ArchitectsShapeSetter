package labTasks;

import java.awt.Graphics2D;

public interface IFurniture {
    void setX(int x) throws FurnitureOutOfBorderException;

    int getX();

    void setY(int y) throws FurnitureOutOfBorderException;

    int getY();

    void paintFurniture(Graphics2D g2d);
}