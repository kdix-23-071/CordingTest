//テスト内容をJavaを用いて実装した。
//インターフェース、ArrayList、拡張for文、if文を使用。
package Java;

import java.util.ArrayList;

public interface Judge {
          // 以下メソッド
          public static boolean judge(String s) {
                    // 開きかっこを一時的の保存するスタック
                    ArrayList<Character> stack = new ArrayList<>();
                    // for文で一文字ずつチェック
                    for (char c : s.toCharArray()) {
                              // 開きかっこはスタックに一時保存
                              if (c == '(' || c == '{' || c == '[') {
                                        stack.add(c);

                              } else if (c == ')' || c == '}' || c == ']') {
                                        // スタック空=開きかっこがその前にないということなのでfalse
                                        if (stack.isEmpty())
                                                  return false;
                                        // かっこの組み合わせ検証用(次のif文で使用)
                                        char top = stack.remove(stack.size() - 1);
                                        // スタックがからでない場合は組み合わせを検証
                                        if ((c == ')' && top != '(') ||
                                                            (c == '}' && top != '{') ||
                                                            (c == ']' && top != '[')) {
                                                  return false;
                                        }
                              }
                    }
                    return stack.isEmpty();
          }
}