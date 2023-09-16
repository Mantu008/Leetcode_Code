class Solution {
     public static void maxofright(int mxr[],int arr[],int n){
             
          mxr[n-1]=arr[n-1];

          for(int i=n-2;i>=0;i--){
              if(mxr[i+1]>arr[i]){
                  mxr[i]=mxr[i+1];
              }else{
                 mxr[i]=arr[i];
              }
          }

    }

    public static void maxofleft(int mxl[],int arr[],int n){
              
         mxl[0]=arr[0];

        for(int i=1;i<n;i++){
            if(mxl[i-1]>arr[i]){
                mxl[i]=mxl[i-1];
            }else{
               mxl[i]=arr[i];
            }
        }

    }
    public int trap(int[] height) {
        int n=height.length;
        int mxr[]=new int[n]; 
        int mxl[]=new int[n];
        int water[]=new int[n]; 
        int min;
        int sum=0;

        maxofleft(mxl, height, n);
        maxofright(mxr, height, n);

        for(int i=0;i<n;i++){
            water[i]=(mxl[i]<mxr[i]?mxl[i]:mxr[i])-height[i];
        }

         for(int i=0;i<n;i++){
             sum=sum+water[i];
        }

       return sum;
    }
}