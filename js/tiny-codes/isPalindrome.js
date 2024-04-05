function isPalindrome(str) {
  const strLower = str.toLowerCase();
  const STR = strLower.replace(/[^a-z0-9]/g, "");

  let start = 0;
  let end = STR.length - 1;

  while (start < end) {
    if (STR[start] !== STR[end]) {
      return false;
    }
    start++;
    end--;
  }
  return true;
}

console.log(isPalindrome("A man, a plan, a canal Panama"));
console.log(isPalindrome("level"));
console.log(isPalindrome("hello"));
