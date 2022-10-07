package furniture;


public class Furnitureinfo {
    public static void main(String args[]){
        Furniture furn;
        furn = new Diningtable();
        furn.legs();
        furn = new Chair();
        furn.legs();
    }
}
