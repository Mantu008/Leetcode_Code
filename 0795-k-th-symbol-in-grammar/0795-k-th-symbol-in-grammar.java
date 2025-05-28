class Solution {
    public int kthGrammar(int n, int k) {
        return findkth(n,k);
    }

    public static int findkth(int n,int k){
        if(n==1 && k==1){
            return 0;
        }

        int mid=(int) (Math.pow(2,n-1)/2);

        if(k<=mid){
            return findkth(n-1,k);
        }else{
            int ans=findkth(n-1,k-mid);
            if(ans==0){
                return 1;
            }else if(ans==1){
                return 0;
            }
        }
        // this will never return 
        return 1;
    }
}