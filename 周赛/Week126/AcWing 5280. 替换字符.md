https://www.acwing.com/problem/content/5283/ <br/>
<img width="703" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/21ea4867-1748-45ea-9be4-1bb944cbf385">
```js
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputs = [];
let n, m;
let s, t;
rl.on('line', function (line) {
    inputs.push(line);
});

rl.on('close', function () {
    [n, m] = inputs[0].split(' ').map(item => parseInt(item));
    s = inputs[1];
    t = inputs[2];
    let res = new Array(n + 1);

    for (k = 0; k < m - n + 1; k++) {
        let p = calc(k);
        if (p.length < res.length) {
            res = p;
        }
    }
    console.log(res.length);
    if (res.length > 0) {
        let str = res.map(item => item + 1).join(' ');
        console.log(str);
    }
});

function calc(k) {
    let ret = [];
    for (i = 0; i < n; ++i) {
        if (s[i] !== t[i + k]) {
            ret.push(i);
        }
    }
    return ret;
}
```
