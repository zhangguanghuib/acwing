<h1>This problem is leveraging the js library   https://github.com/datastructures-js/priority-queue</h1>

This kind code can AC:
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

