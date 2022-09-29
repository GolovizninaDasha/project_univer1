package lab2;

public class Robot implements Move{
    boolean forvard = true;
    public boolean isForvard() {
        return forvard;
    }
    int jump_height;
    int run_distance;
    public Robot(int jump_height, int run_distance) {
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

    public void run(int Distance) {
        if(Distance < run_distance) {
            System.out.println("Робот пробежал " + Distance + " метров");
        }else {
            System.out.println("Робот не пробежал " + Distance + " метров");
            forvard = false;
        }

    }
    public void jump(int Distance) {
        if(Distance < jump_height) {
            System.out.println("Робот прыгнул " + Distance + " метров");
        }else {
            System.out.println("Робот не прыгнул " + Distance + " метров");
            forvard = false;
        }

    }
}
