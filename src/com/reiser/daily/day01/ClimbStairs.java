package com.reiser.daily.day01;

class ClimbStairs {

    public static void main(String[] args) {
        ClimbStairs c = new ClimbStairs();
        System.out.println(c.climbStairs(5));
    }

    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;

        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}