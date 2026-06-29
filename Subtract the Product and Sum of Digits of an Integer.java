class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int r=1, l;
        while(n!=0)
        {
            l=n%10;
            s+=l;
            r*=l;
            n=n/10;
        }
        return r-s;
    }
}
