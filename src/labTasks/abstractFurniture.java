package labTasks;

public abstract class abstractFurniture implements IFurniture {
    protected int x;
    protected int y;

    @Override
    public void setX(int x) throws FurnitureOutOfBorderException {
        if (x > 1000 || x < 0) {
            throw new FurnitureOutOfBorderException("Furniture X coordinate out of border: " + x);
        }
        this.x = x;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setY(int y) throws FurnitureOutOfBorderException {
        if (y > 1000 || y < 0) {
            throw new FurnitureOutOfBorderException("Furniture Y coordinate out of border: " + y);
        }
        this.y = y;
    }

    @Override
    public int getY() {
        return this.y;
    }
}