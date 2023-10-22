<h1>This doc shows how to input output for javascript in Node environment</h1>

<ol>
 <li>Single line input</li>
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
</ol>







