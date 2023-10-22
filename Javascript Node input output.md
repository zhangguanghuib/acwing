<h1>This doc shows how to input output for javascript in Node environment</h1>

Case #1. Single line input
 ```
 const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.on('line', function (line) {
    console.log(line)
});
 ```

Case #2: multiple line input,  number of line is certain:
```
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
// number of lines to be input:
let num = 2;
let inputs =[]; // Array to store all the lines 
rl.on('line', function (line) {
    inputs.push(line);
    if(inputs.length === num){
        // all lines are input done, start processing them
        console.log(inputs[0].substr(0,parseInt(inputs[1])))；
        // Clean the array so that it can store next group lines
        inputs = [];
    }
});
```







