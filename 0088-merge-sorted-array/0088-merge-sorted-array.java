class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        sort(nums1,nums2,m,n,arr);
    }

     public static void sort(int nums1[],int nums2[],int m,int n,int arr[]){
            int i=0,j=0,k=0;

            while(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                    arr[k]=nums1[i];
                    i++;
                    k++;
                }else{
                    arr[k]=nums2[j];
                    j++;
                    k++;
                }
            }

            System.out.println(i+" "+j+" "+k);

            if(i==m){
                 for(int p=k;p<arr.length;p++){
                    arr[p]=nums2[j];
                    j++;
                 }
            }else{
                for(int p=k;p<arr.length;p++){
                      arr[p]=nums1[i];
                      i++;
                 }
            }

            for(int p=0;p<m+n;p++){
            nums1[p]=arr[p];
       }
    }
}