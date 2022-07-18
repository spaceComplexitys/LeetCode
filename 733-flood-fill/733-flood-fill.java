class Solution {
   public int[][] floodFill(int[][] a, int s, int si, int n) {
    task(a,s,si,n,a[s][si]);
    return a;
}
static void task(int[][] a, int s, int si, int n, int k)
{
    if(s < 0||s >= a.length 
       || si < 0 || si >=a[0].length
       ||a[s][si] == n 
       ||a[s][si] != k)
        return;
    a[s][si] = n;
    task(a,s,si+1,n,k);
    task(a,s,si-1,n,k);
    task(a,s+1,si,n,k);
    task(a,s-1,si,n,k);
}
}