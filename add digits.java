class Solution {
    public int addDigits(int num) {
        int l,s=0;
        while(num!=0)
        {
            l = num%10;
            s+=l;
            num/=10;

        if(num==0&&s>9)
        {
            num = s;
            s = 0;
        }
        }
        return s;
    }
}
