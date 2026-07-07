class Solution {
    public long sumAndMultiply(int n) {
        long num=n;
        long res=0;
        while(num>0){
            long d=num%10;
            if(d!=0){
                res=res*10+d;
            }
            num/=10;
        }
        long x=0;
        while(res>0){
            x=x*10+(res%10);
            res/=10;
        }
        long sum=0;
        long t=x;
        while(t>0){
            sum+=(t%10);
            t/=10;
        }
        return x*sum;
    }
}