## 関数定義
def is_valid(s):
    stack = []
    mapping = {')': '(', '}': '{', ']': '['}
    for char in s:
        ##開きかっこ(バリュー)を取得した時
        if char in mapping.values():
            ##一時保存用のスタックに追加
            stack.append(char)
          ##とじかっこ検知の場合
        elif char in mapping.keys():
            ##スタック空またはスタックの最後が対応する開きかっこではない時false
            if not stack or mapping[char] != stack.pop():##最後に追加してるからpopすれば取得
                return False

s = "()"
s2 = "([{}])"
s3 = "([)]"
is_valid1 = is_valid(s)
is_valid2 = is_valid(s2)
is_valid3 = is_valid(s3)
print(f"入力:s=\"{s}\"")
print(f"出力:{is_valid1}")
print(f"入力:s=\"{s2}\"")
print(f"出力:{is_valid2}")
print(f"入力:s=\"{s3}\"")
print(f"出力:{is_valid(s3)}")