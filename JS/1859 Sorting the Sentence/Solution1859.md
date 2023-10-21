https://leetcode.com/problems/sorting-the-sentence/description/  <br/>
<img width="735" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/fc92663f-6651-4839-bf99-21551567bf02">

```TS
function sortSentences(s: string):string{
    let words = s.split(" ");
    let ans = new Array<string>(words.length);
    for(let word of words){
        let index = parseInt(word[word.length-1]);
        let original = word.substring(0, word.length-1);
        ans[index-1] = original;
    }
    return ans.join(" ");
}
```
