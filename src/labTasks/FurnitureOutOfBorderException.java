package labTasks;
import labTasks.IFurniture;


public class FurnitureOutOfBorderException extends Exception {

    public static void checkFurnitureInBox (String message , FurnitureList myFurnitureList) throws FurnitureOutOfBorderException {
        for (int i = 0; i < myFurnitureList.size(); i++) {
            int a =  myFurnitureList.get(i).getX();
            int b = myFurnitureList.get(i).getY();
            if(a > 1000){
                throw new FurnitureOutOfBorderException(message + ": Ein Möbel ist außer UI gegangen. X: " + a + ", Y: " + b);
            }
            else if (b>1000){
                throw new FurnitureOutOfBorderException(message + ": Ein Möbel ist außer UI gegangen. X: " + a + ", Y: " + b);}
        }
        }
    public FurnitureOutOfBorderException (String message){
        super(message);
    }
    }


/* */