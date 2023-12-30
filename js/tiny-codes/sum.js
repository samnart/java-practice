function sumOfDigits(num) {
    let sum = 0;
    for (let i = 0; i < num.length; i++) {
        sum += parseInt(num.charAt(i), 10);
    }
    return sum;
}

console.log(sumOfDigits('123'));