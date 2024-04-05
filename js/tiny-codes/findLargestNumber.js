function findLargestNumber(numbers) {
  let largest = numbers[0];

  for (let i = 0; i < numbers.length; i++) {
    if (largest < numbers[i]) {
      largest = numbers[i];
    }
  }

  return largest;
}

console.log(findLargestNumber([23, 45, 6])); // Should return 45
console.log(findLargestNumber([5, 10, 2, 8])); // Should return 10
console.log(findLargestNumber([15, 3, 7, 22, 45])); // Should return 45
console.log(findLargestNumber([-5, -10, -2, -8])); // Should return -2

return Math.max(...numbers);
