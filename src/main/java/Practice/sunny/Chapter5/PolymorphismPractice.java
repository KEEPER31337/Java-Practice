package Practice.sunny.Chapter5;

public class PolymorphismPractice {

  public static void main(String[] args) {
    Tiger tiger = new Tiger();
    Lion lion = new Lion();

    // Animal tiger = new Tiger();
    // Animal lion = new Lion();

    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger);
    bouncer.barkAnimal(lion);
  }
}
