package labTasks;
import labTasks.FurnitureOutOfBorderException;
public abstract class abstractFurniture implements IFurniture {
    protected int x;
    protected int y;
    public void setX(int x) {
        // if (outOf Bunds) then throw Exception, else
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
}



