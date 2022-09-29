package lab2;

public class MainApp {
    public static void main(String[] args) {
        Barrier[] bar = {new Wall(2),
                new Runroad(200),
                new Wall(4),
                new Runroad(800),
                new Wall(15)};
        Move[] attem = {
                new Human(1, 30),
                new Cat(12, 500),
                new Robot(30, 1000)};
        for (Move paticapant : attem) {
            for (Barrier again : bar) {
                paticapant.action(again.GET(),again.TIP());
                if (!paticapant.isForvard()) {
                    break;
                }
            }

        }


    }
}
