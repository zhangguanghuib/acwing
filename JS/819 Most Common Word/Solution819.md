Problem link: https://leetcode.com/problems/most-common-word/description/<br/>
<img width="737" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/7abc27d6-042d-4cf9-b8ad-d9a9782b9cf3">
```ts
function mostCommonWord(paragraph:string, banned: string[]): string{
    let result = "";
    let maxFreq = 0;

    const bannedSet : Set<string> = new Set(banned);
    const words = paragraph.split(/\W+/).map(word=>word.toLocaleLowerCase());

    const freqMap : Map<string, number> = new Map<string, number>();

    for(const word of words){
        if(word !== '' && !bannedSet.has(word)){
            freqMap.set(word, (freqMap.get(word) || 0) + 1);
        }
    }

    for(const [word, freq] of freqMap){
        if(freq > maxFreq){
            result = word;
            maxFreq = freq;
        }
    }

    return result;
}

let paragraph: string = "..Bob hit a ball, the hit BALL flew far after it was hit.";
let banned: string[] = ["hit"];

let ret:string = mostCommonWord(paragraph, banned);
console.log(ret);

```
