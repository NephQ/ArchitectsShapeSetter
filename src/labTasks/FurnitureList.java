package labTasks;

import java.util.ArrayList;

public class FurnitureList extends ArrayList<IFurniture> {
    private static final long serialVersionUID = 1L;
    // Move Methode, bekommt mx und my, wie viel es geschoben werden soll.
    public void shift(int mx, int my) {
        for (IFurniture furniture : this) {
            furniture.setX(furniture.getX() + mx);
            furniture.setY(furniture.getY() + my);
        }
    }
}