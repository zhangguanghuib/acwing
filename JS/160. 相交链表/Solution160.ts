 //Definition for singly-linked list.
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