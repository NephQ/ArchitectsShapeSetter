package labTasks;

import java.util.ArrayList;

public class FurnitureList extends ArrayList<IFurniture> {
    private static final long serialVersionUID = 1L;

    public void shiftAllElements(int mx, int my) {
        for (IFurniture furniture : this) {
            try {
                furniture.setX(furniture.getX() + mx);
                furniture.setY(furniture.getY() + my);
            } catch (FurnitureOutOfBorderException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}