for (let i = 1; i < 100; i++){
    if ((i % 2 === 0) && (i % 5 === 0)){ // Number is even and divisible by 5
        console.log("Baz" + "inga!");
    } else if (i % 2 === 0) { // Number is even
        console.log("Baz");
    } else if (i % 5 === 0) { // Number divisible by 5
        console.log("inga!");
    } else {
        console.log(i);
    }
}