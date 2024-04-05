function countWords(sentence) {
  let words = sentence.split(/\s+/);
  let wordCount = words.length;
  return wordCount;
}

console.log(countWords("Hello world!")); // Should return 2
console.log(countWords("This is a sample sentence.")); // Should return 5
console.log(countWords("  Extra   spaces  should not affect the count.   "));
