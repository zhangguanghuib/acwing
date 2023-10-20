<h1>This problem is leveraging the js library   https://github.com/datastructures-js/priority-queue</h1>

This kind code can AC in the leetcode.cn https://leetcode.cn/problems/kth-largest-element-in-an-array/submissions/
```JS
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const findKthLargest = function(a, k) {
    return minHeap(a, k);
}

const compare = (a,b) => a - b

const minHeap = (a, k) =>{
    //let minpq = new PriorityQueue((i,j)=>i-j);
    let minpq = new PriorityQueue({compare});
    for(let v of a){
        if(minpq.size() < k) minpq.enqueue(v);
        else if(minpq.front() < v){
            minpq.dequeue();
            minpq.enqueue(v);
        }
    }
    return minpq.front();
}
```

and this code is also able to AC
```JS
const compare = (a,b) => a - b
const findKthLargest = function(nums, k) {
    //let minpq = new MinPriorityQueue();
    let minpq = new PriorityQueue({compare})
    nums.forEach(element => {
        if(minpq.size() < k) minpq.enqueue(element);
        else if(minpq.front()<element){
            minpq.dequeue();
            minpq.enqueue(element);
        }
    });
    
    return minpq.front();
};
```
And even the below code is also OK:
```js
const compare = (a,b) => a - b
const findKthLargest = function(nums, k) {
    let minHeap = new PriorityQueue({compare});
    nums.forEach(element => {
        minHeap.enqueue(element);
        if(minHeap.size() > k){
            minHeap.dequeue();
        }
    });

    return minHeap.front();
}
```

But in VS code, when run it but node xxx.js, only the below code is OK:
```js
import { PriorityQueue } from "@datastructures-js/priority-queue"

const compare = (a,b) => a - b
const findKthLargest = function(nums, k) {
    let minHeap = new PriorityQueue(compare);
    nums.forEach(element => {
        minHeap.enqueue(element);
        if(minHeap.size() > k){
            minHeap.dequeue();
        }
    });

    return minHeap.front();
}

console.log(findKthLargest([3,2,1,5,6,4], 2));
```

