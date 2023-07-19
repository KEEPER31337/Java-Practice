package Practice.stopmin.Chapter5;

public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void setName(String name_) {
    this.name = name_;
  }

  void setAge(int age_) {
    this.age = age_;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }

  public static void main(String[] args) {
    Student student1 = new Student("정지민", 21);
    Student student2 = new Student("손현경", 23);

//    student1.setAge(21);
//    student2.setAge(23);
//
//    student1.setName("정지민");
//    student2.setName("손현경");

    System.out.println(student1.getAge() + "살 " + student1.getName());
    System.out.println(student2.getAge() + "살 " + student2.getName());
    System.out.println(student1.toString());
  }
}
