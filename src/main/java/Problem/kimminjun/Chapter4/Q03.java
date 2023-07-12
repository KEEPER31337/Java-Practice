package Problem.kimminjun.Chapter4;

public class Q03 {

  /**
   * 별 표시하기
   */
  public static void main(String[] args) {
    // TODO: while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.

    //*
    //**
    //***
    //****
    //*****
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < i + 1; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
