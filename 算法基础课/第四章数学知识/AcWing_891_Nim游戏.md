link:   https://www.acwing.com/problem/content/893/
![image](https://user-images.githubusercontent.com/14832260/183249094-01d32ca5-fdcd-493b-864a-650737cf635c.png)

思路：

这道题有一个结论：
假设有n堆石子， 每堆石子的数量分别a<sub>1</sub>, a<sub>2</sub>, ....a<sub>n</sub>

    a1^a2^...^a~n = 0     先手必败  
    否则         ！= 0     先手必胜  

代码如下:
```c

#include <iostream>
#include <algorithm>

int main()
{
    int n;
    scanf("%d", &n);

    int res = 0;
    while(n--)
    {
        int x;
        scanf("%d", &x);
        res ^= x;
    }

    if(res) puts("Yes");
    else puts("No");

    return 0;
}
```
