class Solution {
    public int findGCD(int[] arr) {
        int i=0,temp;
        int arrlength = arr.length;
        int min,max;
        Arrays.sort(arr);
        min=arr[0];
        max = arr[arrlength-1];
        while(max!=0)
        {
            temp = max;
            max=min%max;
            min=temp;
        }
        return min;
    }
}
