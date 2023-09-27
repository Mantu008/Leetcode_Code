class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        Printsubn(idx,target,candidates,n,list,resultList);
        return resultList;
    }

       public static void Printsubn(int idx,int target,int arr[],int n,ArrayList<Integer>list, List<List<Integer>>resultList){
         if(idx==n){
                if(target==0){
                     resultList.add(new ArrayList<>(list));
                }
               return;
         }
            if(arr[idx]<=target){
                list.add(arr[idx]);
                Printsubn(idx,target-arr[idx],arr,n,list,resultList);
                int size=list.size()-1;
                list.remove(size);
            }
         Printsubn(idx+1,target,arr,n,list,resultList);
         return;
    }
}

