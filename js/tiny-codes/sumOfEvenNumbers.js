function sumOfEvenNumbers(numbers) {
  let sum = 0;
  for (let i = 0; i <= numbers.length; i++) {
    if (numbers[i] % 2 == 0) {
      sum += numbers[i];
    }
  }
  return sum;
}

console.log(sumOfEvenNumbers([1, 2, 3, 4, 5, 6])); // Should return 12
console.log(sumOfEvenNumbers([10, 15, 20, 25])); // Should return 30
console.log(sumOfEvenNumbers([3, 7, 11])); // Should return 0
