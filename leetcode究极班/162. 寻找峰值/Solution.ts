function findPeakElement(nums: number[]): number {
    let l: number = 0;
    let r: number = nums.length - 1;
    while (l < r) {
        let mid: number = (l + r) >> 1;
        if (nums[mid] < nums[mid + 1]) {
            l = mid + 1;
        } else {
            r = mid
        }
    }
    return l;
};