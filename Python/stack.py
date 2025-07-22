def is_valid(s):
    stack = []
    mapping = {')': '(', '}': '{', ']': '['}
    for char in s:
        if char in mapping.values():
            stack.append(char)
        elif char in mapping.keys():
            if not stack or mapping[char] != stack.pop():
                return False
    return not stack

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