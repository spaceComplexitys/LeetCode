class Solution {
    // Time complexity: O(2^n)- since T(n) = T(n-1) + T(n-2)is an exponential time
    // Space complexity: O(n) - space for recursive function call stack
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        else
            return fib(N - 1) + fib(N - 2);
    }
}