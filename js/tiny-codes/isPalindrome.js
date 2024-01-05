function isPalindrome(str) {

    const lowerStr = str.toLowerCase();
    const newStr = lowerStr.replace(/[^a-z0-9]/g, '');

    let start = 0;
    let end = newStr.length - 1;

    while(start < end) {
        if (newStr[start] != newStr[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}

console.log(isPalindrome("A man, a plan, a canal Panama"));
