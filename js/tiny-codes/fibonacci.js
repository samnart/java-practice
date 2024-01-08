function fibonacci(n) {
    let prev = 0;
    let current = 1;
    for (let i = 0; i < n; i++) {
        console.log(prev);
        let next = prev + current;
        prev = current;
        current = next;
    }
}

// console.log(fibonacci(2));
fibonacci(10);