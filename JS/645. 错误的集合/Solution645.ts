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
