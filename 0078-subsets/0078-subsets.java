class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        Printsubn(idx,nums,n,list,resultList);
        return resultList;

    }

      public static void Printsubn(int idx,int arr[],int n,ArrayList<Integer>list, List<List<Integer>> resultList){
         if(idx>=n){
                resultList.add(new ArrayList<>(list));
               return;
         }
         list.add(arr[idx]);
         Printsubn(idx+1,arr,n,list,resultList);
         int last=list.size()-1;
         list.remove(last);
         Printsubn(idx+1,arr,n,list,resultList);
         return;
    }
}