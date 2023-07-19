package Practice.yejun;

public class Student {

  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public static void main(String[] args) {
    Student student1 = new Student("홍길동", 20);
    Student student2 = new Student("철수", 18);
    Student student3 = new Student("영희", 15);

    System.out.println(student1);
    System.out.println(student2.getName());
    System.out.println(student3.getAge());
  }
}
