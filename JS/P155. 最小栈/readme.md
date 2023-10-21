https://leetcode.cn/problems/min-stack/description/<br/>

<img width="690" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/5fb8a5b4-6ec0-46ed-879e-ec55ab559bb1">

思路:

1. 维护两个栈，一个Store 真实的data， 另一个维护最小值
2. 当往栈里面插入一个数据时，判断最小栈的栈顶元素是不是比正要插入的元素大，如果大，则新的数字同时插入最小栈和数据栈， 否则最小栈不变，只插入数据栈
3. 当从栈中弹出一个元素时，判断最小栈和数据栈的元素大小，如果数据栈的元素小于或者等于最小栈的元素，则两者都要弹出，否则只弹出数据栈的元素

```ts
class MinStack {

    private stk: number[];
    private minStk: number[];

    constructor() {
        this.stk = [];
        this.minStk = [];
    }

    push(val: number): void {
        this.stk.push(val);
        if (this.minStk.length <= 0 || this.minStk[this.minStk.length - 1] >= val) {
            this.minStk.push(val);
        }
    }

    pop(): void {
        if (this.stk[this.stk.length - 1] <= this.minStk[this.minStk.length - 1]) {
            this.minStk.pop();
        }
        this.stk.pop();
    }

    top(): number {
        return this.stk[this.stk.length - 1];
    }

    getMin(): number {
        return this.minStk[this.minStk.length - 1];
    }
}
```
