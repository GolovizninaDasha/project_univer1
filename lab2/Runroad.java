package lab2;

public class Runroad implements  Barrier{
    int lenght;

    public int GET() {
        return lenght;
    }

    public boolean TIP(){
        return true;
    }
    public Runroad(int lenght) {
        this.lenght = lenght;
    }
}
