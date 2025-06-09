class Solution {
    public void rotate(int[] nums, int k) {
        rotateByK(nums,k);
    }
    public static void rotateByK(int arr[],int k){
        //for large k
        k=k%arr.length;
        //if k is negative then make it corrosponding positive
        if(k<0)  k=k+arr.length;
        //if i is zero then simple not doing anything
        if(k==0) return;

        //find mid to brake into two part
        int mid=arr.length-k;

        //reverce first part of array
        int start=0;
        int end=mid-1;
        reverce(arr,start,end);

        //reverce second part of array
        start=mid;
        end=arr.length-1;
        reverce(arr,start,end);

        //reverce whole array for opt 
        // a + b --> input
        // a` + b`
        // (a` + b`)`
        // b + a  --> output

        start=0;
        end=arr.length-1;
        reverce(arr,start,end);


    }
    
    public static void reverce(int arr[],int start,int end){
         while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
    }
}