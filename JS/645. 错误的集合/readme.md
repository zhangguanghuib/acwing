https://leetcode.cn/problems/set-mismatch/  <br/>

<img width="871" alt="image" src="https://github.com/zhangguanghuib/acwing/assets/14832260/bec84f19-1557-4567-8f3d-3cb1ae6573c8">

思路：
遍历数组两次：

第一次将所有对应下标的数组变为负数， 重复的数字就会由正变负再由负变成正

[1,3,3,4]经过第一次遍历，变成 [-1, 3, 3, -4]  ，找到重复的数字3

第二次遍历，如果发现对应下标的数字不在数组中，但是该数字为正，则这个数字是缺失的数字:
发现下标1，对应的数字是3， 但是arr[1] = 3 !=2,  说明2是缺失的数字，

```ts
function findErrorNums(nums: number[]): number[] {
      let res: number[] = [];
      for(let x of nums){
        let k: number = Math.abs(x);
        if(nums[k-1] < 0){
            res[0] = k;
        }
        nums[k-1] *= -1;
      }

      for(let i :number = 0; i<nums.length; ++i){
         if(nums[i] > 0 && i+1 != res[0]){
            res[1] = i+1;
         }
      }
      return res;
};

console.log(findErrorNums([1,3,3,4]));
```


