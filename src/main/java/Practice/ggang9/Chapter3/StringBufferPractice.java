package Practice.ggang9.Chapter3;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java" 출력

        StringBuffer sb1 = new StringBuffer();
        sb1.append("jump to java");
        sb1.insert(0, "hello ");
        System.out.println(sb1.toString());



    }

}
