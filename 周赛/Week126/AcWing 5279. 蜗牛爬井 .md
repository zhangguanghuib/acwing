https://www.acwing.com/problem/content/5282/
<img width="657" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/9da575c1-bc9c-450a-88be-dd97251bd277">
```js
const { stdin } = require('process');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let l = 0;
let d = 0;

rl.on('line', function(line){
    l = parseInt(line); 
    if(l<=5){
        d = 1;
    } else{
        d = l-5 + 1;
    }
    console.log(d);
});
```
