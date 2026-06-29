class Solution {
    public boolean isSameAfterReversals(int num) {
        int l = 0;
        int rev1 = 0, rev2 = 0;
        int temp = num;
        while(num!=0)
        {
            l=num%10;
            rev1 = (rev1*10+l);
            num/=10;
        }
        while(rev1!=0)
        {
            l = rev1%10;
            rev2 = rev2*10+l;
            rev1 /= 10;
        }
        return rev2==temp;
    }
}
