
package Java;

import java.util.ArrayList;

public interface Judge {
          public static boolean judge(String s) {
                    ArrayList<Character> stack = new ArrayList<>();
                    for (char c : s.toCharArray()) {
                              if (c == '(' || c == '{' || c == '[') {
                                        stack.add(c);
                              } else if (c == ')' || c == '}' || c == ']') {
                                        if (stack.isEmpty())
                                                  return false;
                                        char top = stack.remove(stack.size() - 1);
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