package Practice.redzzzi.Chapter5;

class Animal {

  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {

  void sleep() {
    System.out.println(this.name + " zzz");
  }
}

class HouseDog extends Dog {

}

public class MethodOverriding {

  public static void main(String[] args) {
    HouseDog houseDog = new HouseDog();
    houseDog.setName("happy");
    houseDog.sleep();
  }

}
