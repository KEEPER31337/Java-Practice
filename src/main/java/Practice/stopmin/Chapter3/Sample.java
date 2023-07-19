package Practice.stopmin.Chapter3;

public class Sample {


  private String message; // 속성, 필드

  public Sample(String message) {
    this.message = message;
  }

  public static void main(String[] args) {
    Sample sample = new Sample("ABDERERER");
  }

  public void myPublic() {
    System.out.println(message);
  }

  protected void myP() {

  }

  private void myP2() {

  }

  void myD() {

  }
}
