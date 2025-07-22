package Java;

import java.util.Scanner;

public class Judge2 {

          public static boolean judge2() {
                    // スキャナー入力
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("入力: ");
                    String input = scanner.nextLine();
                    // 入力されたのがかっこ以外ならエラー処理
                    if (input == null || !input.matches("[(){}\\[\\]]+")) {
                              System.out.println("エラー: (){}[]のいずれかを入力してください");
                              scanner.close();
                              return false;
                    }

                    // 入力された文字列を検証(Judge.javaを流用)
                    boolean isValid = Judge.judge(input);
                    scanner.close();
                    return isValid;
          }

          public static void main(String[] args) {
                    boolean result = judge2();
                    System.out.println("出力: " + result);
          }
}
