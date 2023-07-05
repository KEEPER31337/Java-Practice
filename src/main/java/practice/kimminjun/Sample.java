package practice.kimminjun;

public class Sample {

  public Sample(String message) {
    this.message = message;
  }

  public static void main(String[] args) {
    Sample sample = new Sample("EEEE");
  }

  public void myPublic() {
    String a = "asdfasf";
  }

  protected void myProtected() {

  }

  private String message; // 속성, 필드

  private void myPrivate() {

  }

  void myPackage() {  // package-privtae method : 같은 패키지 (디렉토리 느낌)에서만 접근 가능

  }
}