package lab2;

public class Cat implements Move{
    boolean forvard = true;

    public boolean isForvard() {
        return forvard;
    }

    int jump_height;
    int run_distance;
    public Cat(int jump_height, int run_distance) {
        this.jump_height = jump_height;
        this.run_distance = run_distance;
    }
    @Override
    public void action(int Distance,boolean type){
        if(type){
            run(Distance);
        }
        else {
            jump(Distance);
        }
    }

    public void jump (int Distance){
        if(Distance < jump_height) {
            System.out.println("Кот прыгнул " + Distance + " метров");
        }else {
            System.out.println("Кот не прыгнул " + Distance + " метров");
            forvard = false;
        }
    }

    public void run(int Distance){
        if(Distance < run_distance) {
            System.out.println("Кот пробежал " + Distance + " метров");
        }else {
            System.out.println("Кот не пробежал " + Distance + " метров");
            forvard = false;
        }

    }

}
