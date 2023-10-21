 https://leetcode.cn/problems/intersection-of-two-linked-lists/  <br/>
 <img width="1002" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/6b1e1b5b-11a3-406a-ad31-b2c1c9502e69">

 思路:

两个指针分别沿着两个链表，p=headA,  q = headB,  走到链表最后一个节点后交换 p=headB, q=headA, 这样相遇时的时候一定是第一个相交的节点：
<img width="388" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/2cb55671-972c-477d-8162-aafe1a2527ab">
<br/>

```ts
 class ListNode {
    val: number
     next: ListNode | null
     constructor(val?: number, next?: ListNode | null) {
         this.val = (val===undefined ? 0 : val)
          this.next = (next===undefined ? null : next)
    }
  }


function getIntersectionNode(headA: ListNode | null, headB: ListNode | null): ListNode | null {
    let p = headA;
    let q = headB;

    while(p !== q){
        if(p != null && p!= undefined){
            p = p.next
        } else{
            p = headB;
        }

        if(q!=null && q!= undefined){
            q = q.next;
        } else{
            q = headA;
        }
    }
    return p;
};
```


