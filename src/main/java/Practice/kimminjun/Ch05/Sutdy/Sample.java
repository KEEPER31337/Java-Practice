package Practice.Ch05.Sutdy;

class Student {

  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  int getAge() {
    return this.age;
  }
}
// to string

public class Sample {

  public static void main(String[] args) {
    Student stu1 = new Student("Kim", 21);
    Student stu2 = new Student("Lee", 23);
    Student stu3 = new Student("Park", 25);

    System.out.println(stu1.getName() + stu1.getAge());
    System.out.println(stu2.getName() + stu2.getAge());
    System.out.println(stu3.getName() + stu3.getAge());
  }

}
