function factorial(n) {
    let factorial = 1;
    while(n > 1) {
        factorial *= n;
        n--;
    } 
    return factorial;
}

console.log(factorial(0));
console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(10));
console.log(factorial(20));
console.log(factorial(50));