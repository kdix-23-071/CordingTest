fun isValid(s: String): Boolean {

          val stack = mutableListOf<Char>()
          //組み合わせ表
          val map = mapOf('(' to ')', '{' to '}', '[' to ']')

          //各文字チェック
          for (char in s) {
                    //開きかっこ検知した場合
                    if (char in map.keys) {
                              //スタック保存
                              stack.add(char)
                    //とじかっこ検知した場合          
                    } else if (char in map.values) {
                              //スタック空なら最初にとじかっこなのでfalse スタックに保存したキーで出たバリューが一致しないならfalse
                              if (stack.isEmpty() || map[stack.removeAt(stack.size - 1)] != char) {
                                        return false
                              }
                    }
          }
          return stack.isEmpty()
}

fun main() {
          val s1 = "()"
          val s2 = "({[]})"
          val s3 = "({[})"

          println("入力:s=\"$s1\"")
          println("出力:${isValid(s1)}")
          println("入力:s=\"$s2\"")
          println("出力:${isValid(s2)}")
          println("入力:s=\"$s3\"")
          println("出力:${isValid(s3)}")
}