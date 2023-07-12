package Practice.sunny.Chapter5;
/*
class Animal {

  // Instance Variable
  String name;

  public void setName(String name) {
    this.name = name;
  }
}
*/

class Student {

  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

public class ClassPractice {

  public static void main(String[] args) {
    // Instance
    Animal cat = new Animal();
    // Call Method
    cat.setName("boby");

    Animal dog = new Animal();
    dog.setName("happy");

    System.out.println(cat.name);
    System.out.println(dog.name);

    Student student = new Student("hi", 3);
    System.out.println(student.getName());
    System.out.println(student.getAge());
  }
}
