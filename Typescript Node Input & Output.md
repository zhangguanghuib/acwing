<h1>This doc shows how to input output for Typescript in Node environment</h1>

Firstly, please install the Typescipt to support node:

npm i --save-dev @types/node

Case #0:  
```ts
import * as readline from 'readline';

// Create an interface for reading data from the console
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Ask a question and get input from the user
rl.question('Please enter your name: ', (answer) => {
  // Output the answer
  console.log(`Hello, ${answer}!`);

  // Close the interface
  rl.close();
});
```

Case #1. Single line input
 ```ts
import * as readline from 'readline';

// Create an interface for reading data from the console
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', function (line) {
    console.log(line)
 });
 ```

Case #2: Multiple lines input,  number of line is certain:
```ts
import * as readline from 'readline';

// Create an interface for reading data from the console
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// number of lines to be input:
let num: Number = 2;
let inputs : string[] =[]; // Array to store all the lines 
rl.on('line', function (line:string) {
    inputs.push(line);
    if(inputs.length === num){

        let s: string = inputs[0];
        let n: number = parseInt(inputs[1]);
        // all lines are input done, start processing them
        console.log(inputs[0].substr(0,parseInt(inputs[1])))
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
Case #4,  multiple lines input,  line number is uncertail:
```js
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputs = [];

rl.on('line', function (line) {
        inputs.push(line);
    }
);
// 输入结束时，在 close 中对数据进行处理
rl.on('close', function () {
   
});
```








