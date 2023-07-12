package Practice.ggang9.Chapter5;

public class HouseDog extends Dog{
    public HouseDog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("HouseDog sleep .....zZ");
    }

    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("black");
        houseDog.sleep();
    }


}
