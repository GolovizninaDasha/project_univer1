package lab2;

public class Wall implements Barrier{
    int height;

    public int GET() {
        return height;
    }

    public boolean TIP(){
        return false;
    }
    public Wall(int height) {
        this.height = height;
    }
}
