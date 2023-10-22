<h1>This doc shows how to input output for javascript in Node environment</h1>

Case #1. Single line input
 ```js
 const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.on('line', function (line) {
    console.log(line)
});
 ```







