package Practice.Ch05._02;

class Animal {

  Animal(String name) {
    setName(name);
  }

  String name;

  public void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  void sleep() {
    System.out.println(this.name);
  }

}

class HouseDog extends Dog {

  public HouseDog(String name) {
    super(name);  // 자식 클래스에서는 부모 클래스 생성자 실행. super 키워드 이용.
  }

  @Override // override 햇다고 명시적으로 붙여주는 걸 추천!
  public void setName(String name) {
    super.setName(name);
  }

  void sleep() {
    System.out.println(this.name + "house");
  }

}

public class Ch05_02 {

  public static void main(String[] args) {
//    Animal cat = new Animal();
//    cat.setName("boby");
//
//    Animal dog = new Animal();
//    dog.setName("happy");
//
//    System.out.println(cat.name);
//    System.out.println(dog.name);
    Dog dog = new Dog("Nut");
    dog.sleep();
    HouseDog dog2 = new HouseDog("DDONG");
    dog2.sleep();
  }
}