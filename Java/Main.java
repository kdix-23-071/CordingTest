package Java;

public class Main {
          public static void main(String[] args) {
                    String s1 = "()";
                    String s2 = "({[]})";
                    String s3 = "({[})";

                    boolean isValid1 = Judge.judge(s1);
                    boolean isValid2 = Judge.judge(s2);

                    System.out.println("入力:s=”" + s1 + "");
                    System.out.println("出力:" + isValid1);
                    System.out.println("入力:s=”" + s2 + "");
                    System.out.println("出力:" + isValid2);
                    System.out.println("入力:s=”" + s3 + "");
                    System.out.println("出力:" + Judge.judge(s3));

          }
}
