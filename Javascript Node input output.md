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

Case #2: Multiple lines input,  number of line is certain:
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

case #3:  Multiple lines input,  first line is the line number, subsequent lines are real data:
```js
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let num = 0;
let inputs = [];
rl.on('line', function (line) {
    if(num === 0){
        num = parseInt(line)
    }else{
        inputs.push(line.toLocaleLowerCase());
    }
    if(inputs.length === num){
        for(let item of inputs){
           //...
           //Process all the lines in input array
            // clean for next group
            num = 0;
            inputs = [];
        }
    }
});
```







