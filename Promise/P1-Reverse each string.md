<h1>How to reverse a long sentence and then each world</h1>

```ts
function reverseChunks(input: string): Promise<string>[] {
    let arrs = input.split('').reverse().join('').split(' ');
    return arrs.map(chunk => new Promise<string>((resolve) => {
        resolve(chunk.split('').reverse().join(''));
    }));
}

let input : string = 'this is a long string that will be split into chunks and each chunk will be reversed';
const promises = reverseChunks(input);
Promise.all(promises).then(results => {
    let ret: string = results.join(' ');
    console.log(ret);
});
```
